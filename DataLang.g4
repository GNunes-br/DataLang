grammar DataLang;

program                  : rules;
rules                    : statement*;

IFSULDEMINAS             : 'IFSULDEMINAS';
INICIO                   : 'INICIO';
FIM                      : 'FIM';
COMPILADORES             : 'COMPILADORES';

COMMENT                  : '//' ~[\r\n]*;

fragment INT             : [0-9]+;

fragment FLOAT           : [0-9]+'.'[0-9]+;

NUMBER                   : INT | FLOAT;

fragment SINGLE_QUOTE    : '\'';
fragment DOUBLE_QUOTE    : '"';

STRING                   : DOUBLE_QUOTE (~('\\' | '"'))* DOUBLE_QUOTE | SINGLE_QUOTE (~('\\' | '\''))* SINGLE_QUOTE;
BOOLEAN                  : 'True' | 'False';
NONE                     : 'None';

FUNC                     : 'def';
RETURN                   : 'return';

COND_IF                  : 'if';
COND_ELIF                : 'elif';
COND_ELSE                : 'else';

LOOP_WHILE               : 'while';
LOOP_FOR                 : 'for';
LOOP_FOR_IN              : 'in';

OP_REL                   : '>' | '<' | '>=' | '<=' | '==' | '!=';
OP_MATH                  : '+' | '-' | '/' | '*' | '**';
OP_ASSING                : '=';
OP_LOG                   : 'and' | 'or' | 'not';

OPEN_PARENTHESES         : '(';
CLOSE_PARENTHESES        : ')';

OPEN_SQUARE_BRACKET      : '[';
CLOSE_SQUARE_BRACKET     : ']';

OPEN_BRACES              : '{';
CLOSE_BRACES             : '}';

COMMA                    : ',';

ID                       : [a-zA-Z][_a-zA-Z0-9]*;

WS                       : [ \t\n\r]+ -> skip;

keywords                 : COMPILADORES;

index_access             : ID OPEN_SQUARE_BRACKET NUMBER CLOSE_SQUARE_BRACKET
                         | ID OPEN_SQUARE_BRACKET STRING CLOSE_SQUARE_BRACKET;

list_definition          : OPEN_SQUARE_BRACKET expressions? (COMMA expressions)* CLOSE_SQUARE_BRACKET;
lists                    : list_definition | index_access;

tuple_definition         : OPEN_PARENTHESES expressions? (COMMA expressions)* CLOSE_PARENTHESES;
tuples                   : tuple_definition;

dict_definition          : OPEN_BRACES (expressions | expressions ':' expressions)? (COMMA (expressions | expressions ':' expressions))* CLOSE_BRACES;
dicts                    : dict_definition;

expressions              : dicts | tuples | lists | ID | NUMBER | STRING | BOOLEAN | NONE;

comment                  : COMMENT;

block                    : OPEN_BRACES statement* CLOSE_BRACES;

relational_operation     : expressions
                         | expressions OP_REL expressions (OP_LOG relational_operation)*;
mathematical_operation   : expressions? OP_MATH expressions (OP_MATH expressions)*
                         | OPEN_PARENTHESES expressions OP_MATH expressions (OP_MATH expressions)* CLOSE_PARENTHESES (OP_MATH expressions)*;
logical_operation        : expressions OP_LOG expressions;
assignment_operation     : expressions OP_ASSING (expressions | relational_operation | logical_operation | mathematical_operation);
operations               : relational_operation | mathematical_operation | assignment_operation | logical_operation;

condition_if             : COND_IF OPEN_PARENTHESES relational_operation CLOSE_PARENTHESES block;
condition_elif           : COND_ELIF OPEN_PARENTHESES relational_operation CLOSE_PARENTHESES block;
condition_else           : COND_ELSE block;
conditions               : condition_if (condition_elif)* (condition_else)?;

fucntion_parameter       : expressions;
fucntion_parameters      : fucntion_parameter (COMMA fucntion_parameter)*;
function_assignment      : FUNC ID OPEN_PARENTHESES fucntion_parameters* CLOSE_PARENTHESES OPEN_BRACES statement* (RETURN expressions?)* CLOSE_BRACES;
function_execution       : ID OPEN_PARENTHESES fucntion_parameters* CLOSE_PARENTHESES;
functions                : function_assignment | function_execution;

loop_while               : LOOP_WHILE relational_operation block
                         | LOOP_WHILE OPEN_PARENTHESES relational_operation CLOSE_PARENTHESES block;
loop_for                 : LOOP_FOR ID LOOP_FOR_IN ID block
                         | LOOP_FOR OPEN_PARENTHESES ID LOOP_FOR_IN ID CLOSE_PARENTHESES block;
loops                    : loop_while | loop_for;

statement                : IFSULDEMINAS INICIO (
                         | keywords
                         | comment
                         | operations
                         | conditions
                         | functions
                         | loops
                         | expressions )
                         FIM;
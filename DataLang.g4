grammar DataLang;

program                  : rules;
rules                    : token+;

IFSULDEMINAS             : 'IFSULDEMINAS';
INICIO                   : 'INICIO';
FIM                      : 'FIM';

COMMENT                  : '//';

ID                       : [a-zA-Z]+;

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

OP_REL                   : '>' | '<' | '>=' | '<=' | '==' | '!=';
OP_MATH                  : '+' | '-' | '/' | '*';
OP_ASSING                : '=';
OP_LOG                   : 'and' | 'or' | 'not';

OPEN_PARENTHESES         : '(';
CLOSE_PARENTHESES        : ')';

OPEN_SQUARE_BRACKET      : '[';
CLOSE_SQUARE_BRACKET     : ']';

OPEN_BRACES              : '{';
CLOSE_BRACES             : '}';

WS                       : [ \t\n\r]+ -> skip;

keywords                 : IFSULDEMINAS | INICIO | FIM;
expressions              : ID | NUMBER | STRING | BOOLEAN | NONE;
comment                  : COMMENT;
functions                : FUNC | RETURN;
parentheses              : OPEN_PARENTHESES token? CLOSE_PARENTHESES;
square_brackets          : OPEN_SQUARE_BRACKET token? CLOSE_SQUARE_BRACKET;
braces                   : OPEN_BRACES token? CLOSE_BRACES;
token                    : keywords | comment | expressions | functions | parentheses | square_brackets | braces;

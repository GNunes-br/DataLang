package App;

import ANTLR.DataLangParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.BaseErrorListener;

import java.util.ArrayList;
import java.util.List;

public class LexicalAnalysis {
    public List<Models.Token> tokens = new ArrayList<>();

    public LexicalAnalysis() {}

    public void run(String input) {
        // Criando um objeto ANTLRInputStream ou CharStream que encapsula a string
        CharStream stream = new ANTLRInputStream(input);

        // Criando um analisador léxico (lexer) com o CharStream
        ANTLR.DataLangLexer lexer = new ANTLR.DataLangLexer(stream);

        // Criando um listener de erros personalizado
        BaseErrorListener errorListener = new Listeners.DataLangErrorListener();

        // Removendo listeners de erros da classe DataLangLexer
        lexer.removeErrorListeners();

        // Adicionando listerners personalizados de erros na classe DataLangLexer
        lexer.addErrorListener(errorListener);

        // Criando um objeto CommonTokenStream para armazenar os tokens gerados pelo lexer
        CommonTokenStream tokensStream = new CommonTokenStream(lexer);

        // Criando um analisador sintático (parser) com o CommonTokenStream
        DataLangParser parser = new DataLangParser(tokensStream);

        // Removendo listeners de erros da classe DataLangParser
        parser.removeErrorListeners();

        // Adicionando listerners personalizados de erros na classe DataLangParser
        parser.addErrorListener(errorListener);

        // Executando o programa
        parser.program();

        // Preenchendo o buffer com todos os tokens
        tokensStream.fill();

        // Obtenha todos os tokens encontrados
        List<Token> allTokens = tokensStream.getTokens();

        // Adicionando os tokens encontrados
        for (Token token : allTokens) {
            int line = token.getLine();
            int column = token.getCharPositionInLine();
            String type = lexer.getVocabulary().getSymbolicName(token.getType());
            String text = token.getText();

            this.tokens.add(new Models.Token(line, column, text, type));
        }
    }

    public List<Models.Token> getTokens() {
        return this.tokens;
    }
}

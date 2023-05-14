package Listeners;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.List;
import java.util.ArrayList;
import java.util.BitSet;

public class DataLangErrorListener extends BaseErrorListener {
    private static List<String> systaxErrors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        systaxErrors.add("SyntaxError (linha " + line + ", coluna " + charPositionInLine + "): " + msg);
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        System.err.printf("reportAmbiguity");
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        System.err.printf("reportAttemptingFullContext");
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        System.err.printf("reportContextSensitivity");
    }

    public static List<String> getAllErrors() {
        return systaxErrors;
    }
}

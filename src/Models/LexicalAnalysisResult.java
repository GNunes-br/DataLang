package Models;

import java.util.List;

public class LexicalAnalysisResult {
    public List<Token> tokens;
    public List<String> errors;

    public int status;

    public LexicalAnalysisResult(List<Token> tokens, List<String> errors, int status) {
        this.errors = errors;
        this.tokens = tokens;
        this.status = status;
    }
}

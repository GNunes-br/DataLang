package Models;

public class Token {
    public int line;
    public int column;
    public String text;
    public String type;

    public Token(int line, int column, String text, String type) {
        this.line = line;
        this.column = column;
        this.text = text;
        this.type = type;
    }
}

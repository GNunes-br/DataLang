package Models;

public class Token {
    public int line;
    public int column;
    public String text;
    public int type;

    public Token(int line, int column, String text, int type) {
        this.line = line;
        this.column = column;
        this.text = text;
        this.type = type;
    }
}

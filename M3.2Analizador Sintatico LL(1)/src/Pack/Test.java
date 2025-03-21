package Pack;

public class Test {
    public static void main(String[] args) {
        ListLexer lexer = new ListLexer("[a,]"); //Error
        ListParser parser = new ListParser(lexer);
        parser.list();
    }
}

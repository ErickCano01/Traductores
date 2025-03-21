package Pack;

public class Test {
    public static void main(String[] args) {
        LookaheadLexer lexer = new LookaheadLexer("[a,b=c,,[d,e]]");//Error por ,,
        LookaheadParser parser = new LookaheadParser(lexer, 2);
        parser.list();
    }
}

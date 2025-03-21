package Pack;

public class Main {
    public static void main(String[] args) {
        String entrada = "(hola (mundo ejemplo))";
        LexerConcreto lexer = new LexerConcreto(entrada);

        Token token = lexer.nextToken();
        while (!token.tipo.equals("EOF")) {
            System.out.println(token);
            token = lexer.nextToken();
        }
    }
}

package Pack;

public class LexerConcreto extends LexerAbstracto {

    public LexerConcreto(String entrada) {
        super(entrada);
    }

    @Override
    public Token nextToken() {
        while (caracterActual != '\0') {
            if (Character.isWhitespace(caracterActual)) {
                WS();
                continue;
            }

            if (Character.isLetter(caracterActual)) {
                return NAME();
            }

            if (caracterActual == '(') {
                avanzar();
                return new Token("LPAREN", "(");
            }

            if (caracterActual == ')') {
                avanzar();
                return new Token("RPAREN", ")");
            }

            error();
        }

        return new Token("EOF", null);
    }

    private Token NAME() {
        StringBuilder nombre = new StringBuilder();
        while (caracterActual != '\0' &&
               (Character.isLetterOrDigit(caracterActual) || caracterActual == '_')) {
            nombre.append(caracterActual);
            avanzar();
        }
        return new Token("NAME", nombre.toString());
    }

    private void WS() {
        while (caracterActual != '\0' && Character.isWhitespace(caracterActual)) {
            avanzar();
        }
    }
}


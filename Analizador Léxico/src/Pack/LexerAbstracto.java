package Pack;

public abstract class LexerAbstracto {
    protected String entrada;
    protected int posicion = 0;
    protected char caracterActual;

    public LexerAbstracto(String entrada){
        this.entrada = entrada;
        caracterActual = entrada.charAt(posicion);
    }

    protected void avanzar(){
        posicion++;
        if(posicion < entrada.length()){
            caracterActual = entrada.charAt(posicion);
        }else{
            caracterActual = '\0';
        }
    }

    protected char peek() {
        int peekPos = posicion + 1;
        if (peekPos >= entrada.length()) {
            return '\0';
        }
        return entrada.charAt(peekPos);
    }

    protected void error() {
        throw new RuntimeException("Error léxico en el carácter '" + caracterActual + "'");
    }

    public abstract Token nextToken();
}

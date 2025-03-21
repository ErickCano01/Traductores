package Pack;

public class Token{
    public final String tipo;
    public final String texto;

    public Token(String tipo, String texto){
        this.tipo = tipo;
        this.texto = texto;
    }

    @Override
    public String toString(){
        return tipo + " " + texto;
    }



}

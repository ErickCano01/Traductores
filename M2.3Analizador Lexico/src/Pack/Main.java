package Pack;

import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws LexicalException{
        //String entrada = leerPrograma("src/Pruebas/ejemplo.alg");
        //String entrada = leerPrograma("src/Pruebas/ejercicio1.alg");
        String entrada = leerPrograma("src/Pruebas/ejercicio2.alg");

        PseudoLexer lexer = new PseudoLexer();
        lexer.analizar(entrada);

        System.out.println("*** Análisis léxico *** \n");

        for(Token t: lexer.getTokens()){
            System.out.println(t);
        }
    }
    private static String leerPrograma(String nombre){
        String entrada = "";

        try{
            FileReader reader = new FileReader(nombre);
            int caracter;

            while((caracter = reader.read()) != -1){
                entrada += (char) caracter;
            }
            reader.close();
            return entrada;
        } catch(IOException e){
            return "";
        }
    }
}
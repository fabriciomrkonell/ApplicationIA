package inteligenciaartificial;

import java.io.IOException;
import java.util.ArrayList;

public class InteligenciaArtificial {

    public static void main(String[] args) throws IOException {
                       
        Imagem obj = new Imagem();
                
        byte[][] pixels;
        ArrayList<byte[][]> todos = new ArrayList<>();
        String[] alunos = { "fabricio" };
        String[] imagens = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] tipo = { "1", "2"};
        
        obj.criarCabecalho("3", "400", "4");        
        
        for (String aluno : alunos) {
            for (String imagen : imagens) {
                for (String tipo1 : tipo) {
                    pixels = obj.converter(aluno, imagen, tipo1);        
                    obj.imprimir(pixels, aluno, imagen, tipo1);
                } 
            }
        }                  
    }
}    
    

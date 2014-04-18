package inteligenciaartificial;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

public class Imagem {
    
    public byte[][] converter(String aluno, String imagem, String tipo) throws IOException {
        String urlImagem = "C:\\Users\\Fabrício Ronchi\\Desktop\\InteligenciaArtificial\\imagens\\" + aluno + "_" + imagem + "_" + tipo + ".bmp";
        BufferedImage image = ImageIO.read(new File(urlImagem));
        byte[][] pixels = new byte[image.getWidth()][];

        for (int x = 0; x < image.getWidth(); x++) {
            pixels[x] = new byte[image.getHeight()];
            for (int y = 0; y < image.getHeight(); y++) {
                pixels[x][y] = (byte) (image.getRGB(x, y) == 0xFFFFFFFF ? 0 : 1);
            }
        }
        return pixels;    
    }
    
    public void imprimir(byte[][] imagem, String aluno, String caracter, String tipo) {        
        for (int i = 0; i < imagem.length; i++) {                        
            for (int j = 0; j < imagem[i].length; j++) {
                System.out.print(imagem[j][i]);
                System.out.print(" ");
            }                      
            System.out.println();            
        }
        System.out.println("Imagem: " + aluno + "_"  + caracter + "_" + tipo);  
        System.out.println("");                                                               
    }    
}

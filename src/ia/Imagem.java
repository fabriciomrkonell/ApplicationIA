package ia;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.imageio.ImageIO;

class Imagem {
    
    public byte[][] converter(String aluno, String imagem, String tipo) throws IOException {
        String especificacao = ".bmp";
        
        if ("alan".equals(aluno) || "fabios".equals(aluno) || "cristiano".equals(aluno)) {
            especificacao = ".png";
        }
        
        String urlImagem = "C:\\Fabricio\\IA\\imagens\\" + aluno + "_" + imagem + "_" + tipo + especificacao;        
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
    
    public String buscarBinarioImagem(String numero) {        
        String binario = "0 0 0 0 0";        
        if (null != numero) switch (numero) {
            case "1":
                binario = "0 0 0 0 1";
                break;
            case "2":
                binario = "0 0 0 1 0";
                break;
            case "3":
                binario = "0 0 0 1 1";
                break;
            case "4":
                binario = "0 0 1 0 0";
                break;
            case "5":
                binario = "0 0 1 0 1";
                break;
            case "6":
                binario = "0 0 1 1 0";
                break;
            case "7":
                binario = "0 0 1 1 1";
                break;
            case "8":
                binario = "0 1 0 0 0";
                break;
            case "9":
                binario = "0 1 0 0 1";
                break;
            case "a":
                binario = "0 1 0 0 1";
                break;
            case "b":
                binario = "0 1 0 1 0";
                break;
            case "c":
                binario = "0 1 1 0 0";
                break;
            case "d":
                binario = "0 1 1 0 1";
                break;
            case "e":
                binario = "0 1 1 1 0";
                break;
            case "f":
                binario = "0 1 1 1 1";
                break;
            case "g":
                binario = "1 0 0 0 1";
                break;
            case "h":
                binario = "1 0 0 1 0";
                break;
            case "i":
                binario = "1 0 0 1 1";
                break;
            case "j":
                binario = "1 0 1 0 0";
                break;
            default:
                binario = "0 0 0 0 0";
                break;
        }
        return binario;
    }
    
    public String buscarBinarioAluno(String numero) {   
        String binario = "0 0 0 0 0";
        if (null != numero) switch (numero) {
            case "alan":
                binario = "0 0 0 0 1";
                break;
            case "alessandro":
                binario = "0 0 0 1 0";
                break;
            case "antonio":
                binario = "0 0 0 1 1";
                break;
            case "cristiano":
                binario = "0 0 1 0 0";
                break;
            case "emiliano":
                binario = "0 0 1 0 1";
                break;
            case "fabios":
                binario = "0 0 1 1 0";
                break;
            case "fabiolenzi":
                binario = "0 0 1 1 1";
                break;
            case "fabricio":
                binario = "0 1 0 0 0";
                break;
            case "gabriel":
                binario = "0 1 0 0 1";
                break;
            case "joao":
                binario = "0 1 0 0 1";
                break;
            case "lucas":
                binario = "0 1 0 1 0";
                break;
            case "martin":
                binario = "0 1 1 0 0";
                break;
            case "maycon":
                binario = "0 1 1 0 1";
                break;
            case "rubens":
                binario = "0 1 1 1 0";
                break;
            case "f":
                binario = "0 1 1 1 1";
                break;
            case "g":
                binario = "1 0 0 0 1";
                break;
            case "h":
                binario = "1 0 0 1 0";
                break;
            case "i":
                binario = "1 0 0 1 1";
                break;
            case "j":
                binario = "1 0 1 0 0";
                break;
            default:
                binario = "0 0 0 0 0";
                break;
        }
        return binario;
    }
    
    public void criarCabecalho(int patterns, String inputs, String outputs) throws IOException {                
       this.cabecalhoAluno(patterns, inputs, outputs);
       this.cabecalhoImagem(patterns, inputs, outputs);                                   
    };
    
    public void cabecalhoImagem(int patterns, String inputs, String outputs) throws IOException {                
        FileWriter arq = new FileWriter("C:\\Fabricio\\IA\\_numeros.pat");
        PrintWriter gravarArq = new PrintWriter(arq);                        
        String cabecalho = 
                "SNNS pattern definition file V3.2" +
                "\n" + 
                "generated at Mon Apr 25 15:58:23 1994" + 
                "\n" + 
                "\n" + 
                "\n" + 
                "No. of patterns : " + patterns +
                "\n" + 
                "No. of input units : " + inputs +
                "\n" + 
                "No. of output units : " + outputs +
                "\n" + 
                "\n";                
        gravarArq.printf(cabecalho);                
        arq.close();                                               
    };
    
    public void cabecalhoAluno(int patterns, String inputs, String outputs) throws IOException {                
        FileWriter arq = new FileWriter("C:\\Fabricio\\IA\\_alunos.pat");
        PrintWriter gravarArq = new PrintWriter(arq);                        
        String cabecalho = 
                "SNNS pattern definition file V3.2" +
                "\n" + 
                "generated at Mon Apr 25 15:58:23 1994" + 
                "\n" + 
                "\n" + 
                "\n" + 
                "No. of patterns : " + patterns +
                "\n" + 
                "No. of input units : " + inputs +
                "\n" + 
                "No. of output units : " + outputs +
                "\n" + 
                "\n";                
        gravarArq.printf(cabecalho);                
        arq.close();                                               
    };
    
    public void imprimir(byte[][] imagem, String aluno, String caracter, String tipo) throws IOException {                                 
        this.imprimirAluno(imagem, aluno, caracter, tipo);
        this.imprimirImagem(imagem, aluno, caracter, tipo);
    }   
    
    public void imprimirImagem(byte[][] imagem, String aluno, String caracter, String tipo) throws IOException {                                 
        Imagem imp = new Imagem();
        try (FileWriter arq = new FileWriter("C:\\Fabricio\\IA\\_numeros.pat", true)) {
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf("#Entrada: " + caracter + " - " + aluno);
            gravarArq.printf("\n");
            for (int i = 0; i < imagem.length; i++) {
                for (int j = 0; j < imagem[i].length; j++) {
                    gravarArq.printf(imagem[j][i] + " ");
                }                      
                gravarArq.printf("\n");
            }
            gravarArq.printf("#Saída: " + caracter + " - " + aluno);
            gravarArq.printf("\n");
            gravarArq.printf(imp.buscarBinarioImagem(caracter));
            gravarArq.printf("\n");
            gravarArq.printf("\n");
        }
    }
    
    public void imprimirAluno(byte[][] imagem, String aluno, String caracter, String tipo) throws IOException {                                 
        Imagem imp = new Imagem();
        try (FileWriter arq = new FileWriter("C:\\Fabricio\\IA\\_alunos.pat", true)) {
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf("#Entrada: " + caracter + " - " + aluno);
            gravarArq.printf("\n");
            for (int i = 0; i < imagem.length; i++) {
                for (int j = 0; j < imagem[i].length; j++) {
                    gravarArq.printf(imagem[j][i] + " ");
                }                      
                gravarArq.printf("\n");
            }
            gravarArq.printf("#Saída: " + caracter + " - " + aluno);
            gravarArq.printf("\n");
            gravarArq.printf(imp.buscarBinarioAluno(aluno));
            gravarArq.printf("\n");
            gravarArq.printf("\n");
        }
    }
    
}

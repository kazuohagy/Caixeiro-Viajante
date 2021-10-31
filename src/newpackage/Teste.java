/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author kazuo
 */
public class Teste {

    public static void main(String[] args) {
        analise();
    }

    public static void analise() {
        int[][] matriz = new int[5][5];
        int[] vet = new int[6];

        matriz[0][0] = 0;
        matriz[0][1] = 9;
        matriz[0][2] = 10;
        matriz[0][3] = 15;
        matriz[0][4] = 17;

        matriz[1][0] = 9;
        matriz[1][1] = 0;
        matriz[1][2] = 11;
        matriz[1][3] = 7;
        matriz[1][4] = 15;

        matriz[2][0] = 10;
        matriz[2][1] = 11;
        matriz[2][2] = 0;
        matriz[2][3] = 14;
        matriz[2][4] = 6;

        matriz[3][0] = 15;
        matriz[3][1] = 7;
        matriz[3][2] = 14;
        matriz[3][3] = 0;
        matriz[3][4] = 16;

        matriz[4][0] = 17;
        matriz[4][1] = 15;
        matriz[4][2] = 6;
        matriz[4][3] = 16;
        matriz[4][4] = 0;
        vet[0] = matriz[0][0];
        int y = 0;
        int x = 0;
        int n = 0;
        int guardaN = x;
        int guarda =0;
        boolean verdade = true;

        // System.out.print((char) (97 + a) + " " + vet[a] + " :");
        for (n = 0; n < matriz.length; n++) {
            int valorInicial = Integer.MAX_VALUE;
            System.out.println(n);
            while (y < matriz.length) {
                
                System.out.println(guardaN + "guardaN " +y+"y");
                if (matriz[guardaN][y] < valorInicial && matriz[guardaN][y] != 0&&!busca(matriz[guardaN][y],vet)) {
                    valorInicial = matriz[guardaN][y];
                     guarda = y ;
                     System.out.println(guardaN + "guarda//////////");
                    System.out.println(valorInicial+" n valor matriz");
                    vet[y + 1] = valorInicial;
                    
                }
                System.out.println(matriz[n][y]+" x");
             
                y++;
                
                if (y == 5) {
                    verdade = false;
                }
            }guardaN=guarda;
            
            y =0;

        }
        System.out.println(vetores(vet));
        System.out.println(matrizes(matriz));
    }

    public static String vetores(int[] vet) {
        for (int a = 0; a < vet.length; a++) {
            System.out.println("Caminho " + (char) (97 + a) + ": " + vet[a] + " ");
        }
        return "///////////////";
    }

    public static String matrizes(int mat[][]) {
        for (int a = 0; a < mat.length; a++) {
            for (int b = 0; b < mat.length; b++) {
                System.out.print(mat[a][b] + " ");
            }
            System.out.println();
        }
        return "FIM";
    }
        static boolean busca(int x, int [] vetor){
        for(int i= 0; i< vetor.length;i++){
            if(vetor[i] == x){
                return true;
            }
        }
        return false;
    }
}

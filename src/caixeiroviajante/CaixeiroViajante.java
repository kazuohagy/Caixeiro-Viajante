/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixeiroviajante;

/**
 *
 * @author kazuo
 */
public class CaixeiroViajante {

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
        int guarda = 0;
        char[] caminho = new char[6];

        // System.out.print((char) (97 + a) + " " + vet[a] + " :");
        for (n = 0; n < matriz.length; n++) {
            int valorInicial = Integer.MAX_VALUE;
            while (y < matriz.length) {

               // System.out.println(guardaN + "guardaN " + y + "y");
                if (guardaN == vet.length - 1) {
                    vet[n + 1] = matriz[guardaN][0];
                    break;
                }
                if (matriz[guardaN][y] < valorInicial && matriz[guardaN][y] != 0 && !busca(matriz[guardaN][y], vet)) {
                    valorInicial = matriz[guardaN][y];
                    guarda = y;
  
                 //   System.out.println(valorInicial + " n valor matriz");
                    vet[n + 1] = valorInicial;
                    caminho[n] = (char) (guardaN + 97);

                }
                if (vet[vet.length - 1] != 0) {
                    vet[vet.length - 1] = matriz[guardaN][0];
                    caminho[caminho.length - 1] = (char) (97);

                }
                //System.out.println(matriz[guardaN][y] + " x");

                y++;

            }
            guardaN = guarda;

            y = 0;

        }
        System.out.println("MATRIZ");
        System.out.println(matrizes(matriz));
        for (int m = 0; m < caminho.length; m++) {
            System.out.print("--> " + caminho[m] + " ");
        }
        System.out.println();
        System.out.println(vetores(vet));
        System.out.println(soma(vet));
    }

    public static String vetores(int[] vet) {
        for (int a = 0; a < vet.length; a++) {
            System.out.print("--> " + vet[a] + " ");
        }
        return "";
    }

    public static String soma(int[] vet) {
        int somador = 0;
        for (int a = 0; a < vet.length; a++) {
            somador += vet[a];
        }
        return "Total:" + somador;
    }

    public static String matrizes(int mat[][]) {
        for (int a = 0; a < mat.length; a++) {
            for (int b = 0; b < mat.length; b++) {
                System.out.print(mat[a][b] + " ");
            }
            System.out.println();
        }
        return "CAMINHO";
    }

    static boolean busca(int x, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                return true;
            }
        }
        return false;
    }
}
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] mat = new int[5][5];
        mat[0][0] = 0;
        mat[0][1] = 9;
        mat[0][2] = 10;
        mat[0][3] = 15;
        mat[0][4] = 17;

        mat[1][0] = 9;
        mat[1][1] = 0;
        mat[1][2] = 11;
        mat[1][3] = 7;
        mat[1][4] = 15;

        mat[2][0] = 10;
        mat[2][1] = 11;
        mat[2][2] = 0;
        mat[2][3] = 14;
        mat[2][4] = 6;

        mat[3][0] = 15;
        mat[3][1] = 7;
        mat[3][2] = 14;
        mat[3][3] = 0;
        mat[3][4] = 16;

        mat[4][0] = 17;
        mat[4][1] = 15;
        mat[4][2] = 6;
        mat[4][3] = 16;
        mat[4][4] = 0;

        for (int a = 0; a < mat.length; a++) {
            for (int b = 0; b < mat.length; b++) {
                System.out.print(mat[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println(mat);
        System.out.println(mario());
    }
    public static String mario(){
        return "Ola";
    }

}

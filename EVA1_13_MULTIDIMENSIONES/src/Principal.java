/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abel_
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        int aMatriz [][][][][]=new int [3][2][4][5][6];
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                for (int k = 0; k < aMatriz[i][j].length; k++) {
                    for (int l = 0; l < aMatriz[i][j][k].length; l++) {
                        for (int m = 0; m < aMatriz[i][j][k][l].length; m++) {
                            aMatriz[i][j][k][l][m]=(int)(Math.random()*100);                           
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                for (int k = 0; k < aMatriz[i][j].length; k++) {
                    for (int l = 0; l < aMatriz[i][j][k].length; l++) {
                        for (int m = 0; m < aMatriz[i][j][k][l].length; m++) {
                            System.out.println("["+aMatriz[i][j][k][l][m]+"]");                           
                        }
                    }
                }
            }
        }
    }
    
}

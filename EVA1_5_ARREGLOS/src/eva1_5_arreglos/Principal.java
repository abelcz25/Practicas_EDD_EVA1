/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_arreglos;

/**
 *
 * @author abel_
 */
public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int aiDatos[] = new int [10]; //4bytes de int, por 10 valores del array
        
        //N --># DE ELEMENTOS
        //0 -->1ER ELEMENTO
        //N-1 --> ULTIMO ELEMENTO
        
        for (int i = 0; i < aiDatos.length; i++){
            aiDatos [i] = (int)(Math.random() * 100) + 1;
        }
        System.out.println("FOR NORMAL");
        for (int i = 0; i < aiDatos.length; i++){
            System.out.println(aiDatos [i]);
        }
        System.out.println("FOR EACH");
        for (int aiDato : aiDatos) {
            System.out.println(aiDato);    
        }               
    }    
}

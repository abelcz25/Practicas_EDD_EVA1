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
        int arreglo[] = new int [15];
        System.out.println(arreglo);
        llenarArreglo(arreglo);
        madrearArreglo(arreglo);
        System.out.println(arreglo);
        imprimirArreglo(arreglo);
        
    }
    
    public static void llenarArreglo(int [] arre){
        for (int i = 0; i < arre.length; i++) {           
            arre[i]=(int)(Math.random()*100);                   
        }
        System.out.println(arre);
    }    
    public static void madrearArreglo (int [] arre){
        arre = new int [100];
        System.out.println(arre);
    }
    public static void imprimirArreglo(int [] arre){
        for (int i = 0; i < arre.length; i++) {           
            System.out.println("["+arre[i]+"]");                  
        }System.out.println("");
    }
}

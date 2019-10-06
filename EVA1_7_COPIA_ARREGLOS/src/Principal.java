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
        
        int aiDatos[] = new int[10];
        int aiCopia[] = new int[10];
       
        for (int i = 0; i < aiDatos.length; i++){
            System.out.println("DATOS ORIGINALES");
            aiDatos [i] = (int)(Math.random() * 100) + 1;
            System.out.println("["+aiDatos[i]+"]");
        }aiCopia=aiDatos;
            for (int i = 0; i < aiCopia.length; i++){
                System.out.println("DATOS COPIADOS");
            aiDatos [i] = (int)(Math.random() * 100) + 1;
            System.out.println("["+aiDatos[i]+"]");}
    }
    
}

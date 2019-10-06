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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Prueba apArreglo[] = new Prueba [5];
        Prueba apCopia[] = new Prueba[5];
        System.out.println(apArreglo);
        
        for (int i = 0; i < apArreglo.length; i++) {
            
            apArreglo[i] = new Prueba();
            apCopia[i]=new Prueba();
            apArreglo[i].x=(int)(Math.random() * 100) + 1;
            System.out.println(apArreglo[i]);
            
            //apArreglo[i]=apCopia[i];//no funciona, pasamos direcciones
            apArreglo[i].x=apCopia[i].x;
            
            System.out.println("copia" + i+" = "+apCopia[i]);
            System.out.println("arreglo" + i+" = "+apArreglo[i]);
        }
        System.out.println(apArreglo);
        System.out.println(apCopia);        
        
    }
    
}
class Prueba{
    int x;
}
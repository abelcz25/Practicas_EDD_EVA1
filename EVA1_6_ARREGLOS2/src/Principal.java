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
        // TODO code application logic here
        
        //DECLARACION
        int aiDatos[], a, b;
        int[] aiDatos2, x, y;
        //
        int aiCopia[];
        //INICIALIZACION DEL ARREGLO
        int tama = 100;
        aiDatos = new int[tama];
        for (int i = 0; i < aiDatos.length; i++){
            aiDatos [i] = (int)(Math.random() * 100) + 1;
        }
        tama = 200;
        aiDatos = new int[tama];
        for (int i = 0; i < aiDatos.length; i++){
            aiDatos [i] = (int)(Math.random() * 100) + 1;
        }
        //son objetos
        //la memeoria es consecutiva
        //son de acceso aleatorio
        aiDatos[4] = 5000;
        aiDatos[69] = 500;
        //SON RAPIDOS
        //SON INMUTABLES - NO SE PUEDE CAMBIAR EL TAMA;O DEL ARREGLO       
        
        for (int i : aiDatos) {
            
        }
    }
    
}

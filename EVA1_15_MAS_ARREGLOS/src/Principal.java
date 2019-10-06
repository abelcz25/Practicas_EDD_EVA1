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
        int iNume = 10;
        System.out.println("Valor = " + iNume);
        incrementa(iNume);
        System.out.println("Valor = " + iNume);
        
        //--
        
        Prueba obj = new Prueba();
        obj.iVal=10;
        System.out.println("Valor = " + obj.iVal);
        incrementa2(obj);
        System.out.println("Valor = " + obj.iVal);
    }
    public static void incrementa(int iVal){
        iVal++;
    }
    
    public static void incrementa2(Prueba obj){
        obj.iVal++;
    }
    
}

class Prueba{
    int iVal;
}
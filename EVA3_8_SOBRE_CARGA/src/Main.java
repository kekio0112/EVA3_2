/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola");
        System.out.println(7);
        System.out.println(true);
        System.out.println(new Main());//objeto
        System.out.println(suma(5,8));
        System.out.println(suma("hola" , "mundo¡"));
    }
    public static int suma(int iVal1,int iVal2){
        return iVal1 + iVal2;  
    }
     public static String suma(String sCadel, String sCadel2){
        return sCadel + sCadel2; 
    }
     public static void suma(int iVal){
     }
}

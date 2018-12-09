/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_do.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Paola Xochitl Carrillo Ortiz 18550693
 */
public class EVA3_DOWHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //#NUMEROS ENTRE EL 1 Y EL 12 y MOSTRAR EL MES
        Scanner input = new Scanner (System.in);
        int mes = 0;
        do{//hacer
            System.out.println("introduce el numero del mes");
            mes = input.nextInt();
        
        }while((mes < 1)||(mes > 12));
        
        
        switch (mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2: 
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4: 
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6: 
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8: 
                System.out.println("Agosoto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10: 
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12: 
                System.out.println("Diciembre");
                break;
            
        }
    }
    
}

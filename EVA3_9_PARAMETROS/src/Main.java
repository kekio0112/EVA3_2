/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SERGIO IVAN PIÑON PEÑA
 */
public class Main { //CLASE --> TIPO DE DATO ABTRACTO

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new Main());
        Main mObjeto = new Main();
        System.out.println(mObjeto);
        unaClase unObjeto2 = new unaClase();
        System.out.println(unObjeto2);
        //
        int iValor = 5;
        incrementa (iValor);
        System.out.println("El valor es=: "+ iValor);
        Valor vObjetoValor = new Valor();
        vObjetoValor.iValor=5;
        incrementa(vObjetoValor);
        System.out.println("El valor es:" + vObjetoValor.iValor);
    }
    public static void incrementa(int iVal){
    iVal++;
    }
    public static void incrementa(Valor vValor){
    vValor.iValor++;
    }
}
class unaClase {}

class Valor{
    int iValor;
}

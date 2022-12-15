
package boletin2_5;

import java.util.Scanner;


public class Boletin2_5 {

   
    public static void main(String[] args) {
        float millasmariñas, metros;
        Scanner obxScaner = new Scanner (System.in);
        System.out.println("Teclea las millas");
        millasmariñas = obxScaner.nextFloat();
        metros=millasmariñas*1852;
        System.out.println("Los metros resultado son="+metros);
    }
    
}

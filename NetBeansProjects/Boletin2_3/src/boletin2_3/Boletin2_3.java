
package boletin2_3;

import java.util.Scanner;


public class Boletin2_3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        float precioDolar, cambio;
        Scanner obxScaner = new Scanner (System.in);
        System.out.println("Teclea el dinero a cambiar");
        cambio = obxScaner.nextFloat();
        System.out.println("Teclea el precio del dolar");
        precioDolar=obxScaner.nextFloat();
        float dineroResultado=precioDolar*cambio;
        System.out.println("El dinero resultado es ="+dineroResultado);
    }
    
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package boletin3_1;

import java.util.Scanner;
public class App {
   

    public static void main(String[] args) {
        double pt, pp;
      Scanner obxScaner = new Scanner (System.in);
      System.out.println("Teclea o precio da tarifa");
      pt = obxScaner.nextDouble();
      System.out.println("Teclea o precio pagado");
      pp = obxScaner.nextDouble();
      System.out.println("o porcentaje de descuento e="+(pt-pp)*(100)/pt+"%");
    }
}
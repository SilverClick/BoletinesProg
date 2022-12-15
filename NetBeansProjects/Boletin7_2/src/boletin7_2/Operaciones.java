
package boletin7_2;


public class Operaciones {
      public void Suma(short numero1,short numero2){
 short resultado=(short) (numero1+numero2);
          System.out.println("La suma es igual a "+resultado);
}
     public void Resta(short numero1,short numero2){
          if(numero1>=numero2){
 short resultado=(short) (numero1-numero2);  
              System.out.println("La resta es igual a "+resultado);
          }
}
}

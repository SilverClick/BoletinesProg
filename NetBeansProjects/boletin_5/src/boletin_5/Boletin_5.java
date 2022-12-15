
package boletin_5;


public class Boletin_5 {

    
    public static void main(String[] args) {
         Consumo cons1 = new Consumo();
         cons1.setLitros(15);
           cons1.setPGas(1.57);
           Consumo cons2 = new Consumo(15,20,2.34,3.15);
          cons2.consumoMedio();
          System.out.println("El consumo medio es "+cons2.consumoMedio());
          cons2.setLitros(15);
          System.out.println("La velocidad media es "+cons2.getvMed());
    }
    
}

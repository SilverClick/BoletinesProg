
package boletn8_1;


public class Almacen {
     public void consultarVendas(int vendas){
        if(vendas<=100){
         System.out.println(" O producto é de tipo baixo");  
         }
        else if(vendas>100&&vendas<=500){
        System.out.println(" O producto é de tipo medio " ); 
         }
        else if(vendas>500&&vendas<=1000){
         System.out.println(" O producto é de tipo alto " ); 
        }
         else if(vendas>1000){
            System.out.println(" O producto é de primeira necesidade " );
         }
         }
}

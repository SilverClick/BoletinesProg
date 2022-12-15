
package boletin12;
import javax.swing.JOptionPane;

public class Metodoos {
    int numIntentos=pedirNumeroIntentos();
     int numeroAdiv=pedirNumeroAAdivinar();
    public void metodosJugadores(){

do{  
   if(numIntentos<0){
        JOptionPane.showMessageDialog(null," Sigue las normas y pon por lo menos un intento ");
    break;
    }
    if(numeroAdiv<1||numeroAdiv>50){
        JOptionPane.showMessageDialog(null," Sigue las normas de entre 1 y 50 ");
    break;
    }
   int intento=pedirNumero();
     
  
        
            if(intento>numeroAdiv){
                JOptionPane.showMessageDialog(null," El numero a adivinar es menor que ese ");
                numIntentos--;
            }
             if(intento<numeroAdiv){
                JOptionPane.showMessageDialog(null," El numero a adivinar es meyor que ese ");
                numIntentos--;
            }
             if(intento==numeroAdiv){
                 JOptionPane.showMessageDialog(null," Ganaste y adivinaste felicidades ");
                break;
            }
        
         if(intento<1||intento>50){ 
            JOptionPane.showMessageDialog(null," El intento debe estar entre 1 y 50 ");
    break;
         }
    
    
    
}
    while(numIntentos>0);   
if(numIntentos==0)
       JOptionPane.showMessageDialog(null," Te quedaste sin intentos perdiiste F ");
        
    }
     public static int pedirNumeroAAdivinar(){
  
     return Integer.parseInt(JOptionPane.showInputDialog(" Jugador 1 teclea el numero a adivinar entre 1 y 50 "));
     }
     public static int pedirNumeroIntentos(){
  
     return Integer.parseInt(JOptionPane.showInputDialog(" Jugador 1 teclea el número de intentos "));
     }
     public static int pedirNumero(){
  
     return Integer.parseInt(JOptionPane.showInputDialog(" JUgador 2 teclea un numero entre 1 y 50 "));
     }
}

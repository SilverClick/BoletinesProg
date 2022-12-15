
package boletin17;

import javax.swing.JOptionPane;


public class Boletin17 {
    

    

    public static void main(String[] args) {
             int repeat;
        do{
        CalculoNotas notas=new CalculoNotas();
        notas.calcularPractica();
        notas.calcularTeoria();
        notas.calcularBoletins();
        notas.calcularNotaTotal();
        
       repeat= JOptionPane.showConfirmDialog(null, "Dexeas calcular otra nota?");
        }while (repeat==0);
              
       
    }
    
}

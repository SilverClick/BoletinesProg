
package boletin7_4;
import javax.swing.JOptionPane;

public class Boletin7_4 {

   
    public static void main(String[] args) {
        Peso obx1 = new Peso();
         String peso1 =JOptionPane.showInputDialog("teclea o peso de Lorenzo ");
          String peso2 =JOptionPane.showInputDialog("teclea o peso de Ruben ");
         double pes1=Double.parseDouble(peso1);
         double pes2=Double.parseDouble(peso2);
         obx1.consultarPeso(pes1, pes2);
         
    }
    
}

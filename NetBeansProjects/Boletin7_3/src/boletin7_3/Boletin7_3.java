
package boletin7_3;
import javax.swing.JOptionPane;

public class Boletin7_3 {

   
    public static void main(String[] args) {
        Operacioness obx = new Operacioness();
      String numero =JOptionPane.showInputDialog("teclea o numero ");
     int  num=Integer.parseInt(numero);
     obx.consultarNumero(num);
    }
    
}


package boletin7_1;
import javax.swing.JOptionPane;

public class Boletin7_1 {

    
    public static void main(String[] args) {
         NumeroEnt obx = new NumeroEnt();
String numero =JOptionPane.showInputDialog("teclea o numero");
     int num=Integer.parseInt(numero);
     obx.consultarNum(num);
     
    }
    
}

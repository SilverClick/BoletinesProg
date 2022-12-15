
package boletin7_2;
import javax.swing.JOptionPane;

public class Boletin7_2 {

    
    public static void main(String[] args) {
         Operaciones obx = new Operaciones();
String numero1 =JOptionPane.showInputDialog("teclea o numero1");
String numero2 =JOptionPane.showInputDialog("teclea o numero2");
    short num1=Short.parseShort(numero1);
    short num2=Short.parseShort(numero2);
     obx.Suma(num1,num2);
     obx.Resta(num1,num2);
    }
    
}

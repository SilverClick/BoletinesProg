
package boletin7_5;

import javax.swing.JOptionPane;
public class Boletin7_5 {

    
    public static void main(String[] args) {
        Comparacion obx1 = new Comparacion();
         String nume1 =JOptionPane.showInputDialog("teclea el primer numero ");
          String nume2 =JOptionPane.showInputDialog("teclea el segundo numero ");
          String nume3 =JOptionPane.showInputDialog("teclea el tercer numero ");
         int num1=Integer.parseInt(nume1);
      int num2=Integer.parseInt(nume2);
      int num3=Integer.parseInt(nume3);
      obx1.comparaMayor(num1, num2, num3);
    }
    
}

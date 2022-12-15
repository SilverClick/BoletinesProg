
package boletn8_1;

import javax.swing.JOptionPane;
public class Boletn8_1 {

    
    public static void main(String[] args) {
        Almacen obx1 = new Almacen();
       String nom =JOptionPane.showInputDialog(" teclea o nome do producto ");
       String vend =JOptionPane.showInputDialog(" teclea o numero de vendas ");
        int vendas=Integer.parseInt(vend);
        obx1.consultarVendas(vendas);
    }
    
}


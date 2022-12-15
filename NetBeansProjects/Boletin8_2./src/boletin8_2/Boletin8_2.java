
package boletin8_2;

import javax.swing.JOptionPane;


public class Boletin8_2 {

    public static void main(String[] args) {
         Menu obx1 = new Menu();
       String bot =JOptionPane.showInputDialog(" teclea o numero do boton ");
        int boton=Integer.parseInt(bot);
        obx1.abrirMenu(boton);
    }
    
}

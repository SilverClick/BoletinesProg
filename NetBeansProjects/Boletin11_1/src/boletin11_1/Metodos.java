
package boletin11_1;

import javax.swing.JOptionPane;


public class Metodos {
    
    public void calcularNumeros(){
        int num;
        int acPos=0;
        int acNeg=0;
        int acCer=0;
        for( int i=0;i<10;i++){
           num=pedirEnteiro();
           if (num>0)
           acPos++;
           else if (num<0)
           acNeg++;
           else
            acCer++;
           
        }
        System.out.println(" Los positivos son="+acPos+" Los negativos son= "+acNeg+" Los ceros son="+acCer);
    }
     public static int pedirEnteiro(){
  
     return Integer.parseInt(JOptionPane.showInputDialog("teclea numero enteiro")); 
     }

}

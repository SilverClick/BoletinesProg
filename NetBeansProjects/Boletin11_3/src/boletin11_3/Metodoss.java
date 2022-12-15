
package boletin11_3;

import javax.swing.JOptionPane;

public class Metodoss {
    public void calcularArea(){
        float area;
         float base;
         float altura;
        
        do{
       base=pedirPositivo();  
       altura=pedirPositivo();
        
        }
       while(base<0||altura<0);
        area=base*altura;
          System.out.println(" El area es= "+area);
        }
    
    public static float pedirPositivo(){
  
     return Float.parseFloat(JOptionPane.showInputDialog("teclea numero positivo")); 
}
   
}

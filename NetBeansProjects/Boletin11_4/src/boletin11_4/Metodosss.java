
package boletin11_4;

import javax.swing.JOptionPane;


public class Metodosss {
    public void calcularTablas(){
        int num;
        int tabla1=1;
        int tabla2=2;
        int tabla3=3;
        int tabla4=4;
        int tabla5=5;
        int tabla6=6;
        int tabla7=7;
        int tabla8=8;
        int tabla9=9;
        int tabla10=10;
        num=pedirPositivo();
             
            if(num!=0){
           System.out.println(" Las tablas del numero "+num+" son:\n" +tabla1*num+"\n" +tabla2*num+"\n"+tabla3*num+"\n"+tabla4*num+"\n"+tabla5*num+"\n"+tabla6*num+"\n"+tabla7*num+"\n"+tabla8*num+"\n"+tabla9*num+"\n"+tabla10*num);
            num=pedirPositivo();
    }
        else
       System.out.println(" FIN ");
    }
        
    
     public static int pedirPositivo(){
  
     return Integer.parseInt(JOptionPane.showInputDialog("teclea numero positivo"));
     }
}

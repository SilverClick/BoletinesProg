
package boletin17;

import javax.swing.JOptionPane;


public class CalculoNotas {
    private float notaPractica;
    private float notaTeorica1;
     private float notaTeorica2;
     private float boletins;
     private float mediaTeórica;
     private float notaTotal;
     private float porcentaxe;
     
     public void calcularPractica(){
         notaPractica=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota práctica entre 0 y 10"));
           notaPractica=(float) (notaPractica*0.4); 
             this.notaPractica=notaPractica;
       while (notaPractica<0||notaPractica>10){
        
         notaPractica=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota práctica entre 0 y 10"));
          
         }
         
          System.out.println("La nota Práctica es igual a= "+notaPractica);
          
         
     }
     public void calcularTeoria(){
         notaTeorica1=Float.parseFloat(JOptionPane.showInputDialog("Introduce la primera nota teórica entre 0 y 10"));
          notaTeorica2=Float.parseFloat(JOptionPane.showInputDialog("Introduce la segunda nota teórica entre 0 y 10"));
        float mediaTeórica=(float) (((notaTeorica1+notaTeorica2)/2)*0.4);
         this.notaTeorica1=notaTeorica1;
          this.notaTeorica2=notaTeorica2;
           this.mediaTeórica=mediaTeórica;
          while (notaTeorica1<0&&notaTeorica1>10){
               while (notaTeorica2<0&&notaTeorica2>10){
         notaTeorica1=Float.parseFloat(JOptionPane.showInputDialog("Introduce la primera nota teórica entre 0 y 10"));
          notaTeorica2=Float.parseFloat(JOptionPane.showInputDialog("Introduce la segunda nota teórica entre 0 y 10"));         
          
          }
              
      }
            System.out.println("La nota Teórica es igual a= "+mediaTeórica);
     }
     public void calcularBoletins(){
        porcentaxe=Float.parseFloat(JOptionPane.showInputDialog("Introduce el porcentaje de boleines entre 0 y 100"));
     
         
         if (porcentaxe>90)
             boletins=2;
         if (porcentaxe>=70&&porcentaxe<=90)
             boletins=1;
         if (porcentaxe<70)
             boletins=0;
               
     
     while (porcentaxe<0||porcentaxe>100){
         porcentaxe=Float.parseFloat(JOptionPane.showInputDialog("Introduce el porcentaje de boleines entre 0 y 100"));
         }
     System.out.println("La nota de los boletins es igual a= "+boletins); 
     }
     
     public void calcularNotaTotal(){
         notaTotal=boletins+mediaTeórica+notaPractica;
          System.out.println("La nota total es igual a= "+String.format("%.2f",notaTotal));
     }
             
}
            



package boletin6_3;


public class Circulo {
    //atributos
   private double radio ;
   final private double pi=3.14;
    
   //constructores
     public Circulo ( ) {
     }
     
     public Circulo ( double r, double p)  {
radio=r;
     }
 public void setR (double ra){ 
     radio=ra;  
   }
     public double getR (){ 
     return radio;
   }
    public double calcularArea (){
    double area= Math.pow(radio, 2);
    return area;
    }
   public double calcularLonxitude (){
    double lonxitude=(2*pi)*radio;
    return lonxitude;
    } 
}

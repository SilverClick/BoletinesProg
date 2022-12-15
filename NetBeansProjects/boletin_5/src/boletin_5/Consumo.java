
package boletin_5;


public class Consumo {
    //declaro atributos
   private int km ;
   private int litros;
   private double vMed;
    private double pGas;
  
    
    //contructores:
    public Consumo(){ //contructor por defecto
    }
     public Consumo(int kmR, int lit,double velocidad,double precioGas){ //constructor parametrizado
       km=kmR;
       litros=lit;
       vMed=velocidad;
       pGas=precioGas;
   }
    //metodos de acceso
     public void setKms(int KmRe){ 
   km=KmRe;
   }
     public void setLitros(int litr){ 
     litros=litr;  
   }
     public void setvMed(double vel){
       vMed=vel;
   }
      public float getvMed(){
       return (float) vMed;
      }
     public void setPGas (double gas){ 
     pGas=gas;  
   }
    public double getTempo (){
    double tempo= km/vMed;
    return tempo;
    }
    public float consumoMedio(){
        float cMedio=litros/(km/100);
        return cMedio;
    }
   
     
    public float consumoMedio€(){
        float cMedio=(float) (pGas/(km/100));
        return cMedio;
    }
}


package com.gonzalo.Partes;


public class Monitor {
     private float pulgadas;
    
    public void setPulgadas (float pulga){
        pulgadas = pulga;
    }
    
    public float getPulgadas(){
        float pulga=pulgadas;
        return pulga;
    }

    @Override
    public String toString() {
        return "As pulgadas do monitor é " + pulgadas;
    }
}

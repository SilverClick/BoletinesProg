
package com.gonzalo.Partes;


public class CPU {
    private int velocidade;
    
    public void setVelocidade(int velo){
        velocidade = velo;
    }
    
    public int getVelocidade(){
        int velo = velocidade;
        return velo;
    }

    @Override
    public String toString() {
        return "A velocidade de CPU é de " + velocidade;
    }
}

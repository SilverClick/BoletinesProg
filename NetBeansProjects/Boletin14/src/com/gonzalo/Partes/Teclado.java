
package com.gonzalo.Partes;


public class Teclado {
      private String marca;
    
    public void setMarca(String mar){
        marca = mar;
    }
    
    public String getMarca(){
        String mar = marca;
        return mar;
    }

    @Override
    public String toString() {
        return "A marca do teclado é " + marca;
    }
}

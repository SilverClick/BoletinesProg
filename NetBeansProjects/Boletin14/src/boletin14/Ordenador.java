package boletin14;


import com.gonzalo.Partes.*;

public class Ordenador {
     private float precio;
    
    private Monitor obxMo = new Monitor();
    private Teclado obxTe = new Teclado();
    private CPU obxCpu = new CPU();
    
    
    public Ordenador(){}
    
    public Ordenador(float mo, String te, int pro, float preci){
        obxMo.setPulgadas(mo);
        obxTe.setMarca(te);
        obxCpu.setVelocidade(pro);
        precio = preci;
    }

    @Override
    public String toString() {
        return "O precio do teu ordenador é de " + precio + "\n"+
               obxMo+"''" + "\n" + obxTe + "\n" + obxCpu + " MHz\n";
    }
    
    public Monitor getMonitor(){
        return obxMo;
    }
 
    public Teclado getTeclado(){
        return obxTe;
    }
    
    public CPU getCpu(){
        return obxCpu;
    }
    
    public float getPrecio(){
        return precio;
    }
}


package boletin14;


public class Boletin14 {

    public static void main(String[] args) {
         Ordenador obx = new Ordenador(21.4f, "corsair", 3, 1030.5f);
        System.out.println(obx.toString());
        System.out.println(obx.getPrecio());
        System.out.println(obx.getTeclado().getMarca());
        System.out.println(obx.getCpu().getVelocidade()+"\n\n");
   
        
        
        Ordenador obx1 = new Ordenador(24.0f, "logitech",3 ,1005.2f);
        System.out.println(obx1.toString());
    }
    
}

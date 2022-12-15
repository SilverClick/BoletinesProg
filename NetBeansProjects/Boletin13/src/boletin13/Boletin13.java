
package boletin13;

import boletin13._2.Persoal;


 
public class Boletin13 {

  
    public static void main(String[] args) {
          Persoal alumm = new Persoal("678979713","Elgoncho1@gmail.com");
        Academica alum =  new Academica("gonzalo",6,alumm);
        System.out.println(alum.toString()+"\n"+alumm.toString());
    }
    
}

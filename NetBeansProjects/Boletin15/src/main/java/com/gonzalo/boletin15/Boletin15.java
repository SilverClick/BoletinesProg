

package com.gonzalo.boletin15;

import javax.swing.JOptionPane;


public class Boletin15 {

    public static void main(String[] args) {
       String actorprin=pedirString("Escribe el actor pricipal");
        String actrizprin=pedirString("Escribe la actriz principal");
         String titulo=pedirString("Escribe el titulo");
          String autor=pedirString("Escribe el autor");
           String formato=pedirString("Escribe el formato de la película");
            String duracion=pedirString("Escribe la duración de la película");
             String xenero=pedirString("Escribe o xenero do disco");
              String tituloDis=pedirString("Escribe el titulo del disco");
               String autorDis=pedirString("Escribe el autor del disco");
                String formatoDis=pedirString("Escribe el formato del disco");
                 String duracionDis=pedirString("Escribe la duracion del disco");
        
       
   Película pe= new Película (actorprin,actrizprin,titulo,autor,formato,duracion);
        System.out.println(pe.toString());
     
        Disco dis=new Disco(xenero,tituloDis,autorDis,formatoDis,duracionDis);
        System.out.println(dis.toString());
      
                
    }
      public static String pedirString (String mensaxe){
           return JOptionPane.showInputDialog( mensaxe);
        }
}

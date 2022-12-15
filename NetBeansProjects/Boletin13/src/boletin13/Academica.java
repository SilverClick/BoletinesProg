
package boletin13;

import boletin13._2.Persoal;
import javax.swing.JOptionPane;


public class Academica {
    public static int numReferencia=2018;
    private String nome;
    private int nota;
    private Persoal alum;
    
     public Academica(){ //constructor por defecto
         numReferencia ++;
   }
     public Academica(String nome, int nota, Persoal alum){ //constructor parametrizado
         Academica.numReferencia ++;
         this.alum=alum;
       this.nota=nota;
       this.nome=nome;
       
   }
      //métodos de acceso getters e setters
   public void darValorNome(String nome){ //corresponde a setNome
   this.nome=nome;
   }
   public String devolverValorNome(){ //equivale a getNome
     return nome;  
   }
   
   public void setNota(int nota){
       this.nota=nota;
   }
   public int getNota(){
       return nota;
   }
   public static int setNumReferencia(){
       return numReferencia;
   }
   public static void setNumReferencia(int numReferencia){
       Academica.numReferencia=numReferencia;
   }

  
    @Override
      public String toString(){
       return " nota="+nota+" Nome="+nome+"Alumno="+alum;
   }
     
           public int pedirEnteiro(){
               do{
               nota=Integer.parseInt(JOptionPane.showInputDialog("teclea nota entre 0 e 10"));
               }
               while(nota<0 || nota>10);
               return nota;
               }
          
      }


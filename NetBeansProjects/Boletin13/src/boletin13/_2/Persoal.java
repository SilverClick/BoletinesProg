
package boletin13._2;

public class Persoal {
    private String telefono;
    private String correo;
    
    public Persoal(){ //constructor por defecto
   }
     public Persoal(String telefono, String correo){ //constructor parametrizado
       this.telefono=telefono;
       this.correo=correo;
       
   }
      //métodos de acceso getters e setters
   public void darValorCorreo(String correo){ //corresponde a setNome
   this.correo=correo;
   }
   public String devolverValorCorreo(){ //equivale a getNome
     return correo;  
   }
   
   public void setTelefono(String telefono){
       this.telefono=telefono;
   }
   public String getTelefono(){
       return telefono;
   }

  
    @Override
      public String toString(){
       return " telefono="+telefono+" correo="+correo;
   }
}

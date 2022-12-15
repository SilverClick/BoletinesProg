
package boletin_4;


public class Libro {
     //declaro atributos
   private float valoracion ;
   private short numPaginas;
   private int ano;
    private String titulo;
    private String autor;
    
    //contructores:
    public Libro(){ //contructor por defecto
    }
     public Libro(short numP, String tit,String aut,int an){ //constructor parametrizado
       ano=an;
       titulo=tit;
       numPaginas=numP;
       autor=aut;
   }
     //metodos de acceso
     public void setValoracion(float val){ 
   valoracion=val;
   }
     public float getValoracion(){ 
     return valoracion;  
   }
     public void setNumPaginas(short numPa){
       numPaginas=numPa;
   }
     public short getNumPaginas(){ 
     return numPaginas;  
   }
      public void setAno(int a){
       ano=a;
   }
     public int getAno(){ 
     return ano;  
   }
      public void setTitulo(String titu){
       titulo=titu;
   }
     public String getTitulo(){ 
     return titulo;  
   }
     public void setAutor(String auto){
       autor=auto;
   }
     public String getAutor(){ 
     return autor;  
   }
     //defino metodos
   
    public void amosar(){
        System.out.println(" Titulo do libro= "+titulo);
        System.out.println(" Valoracion do libro= "+valoracion);
        System.out.println(" Número de páginas= "+numPaginas);
        System.out.println(" Autor del libro= "+autor);
        System.out.println(" Ano do libro= "+ano);
}
}

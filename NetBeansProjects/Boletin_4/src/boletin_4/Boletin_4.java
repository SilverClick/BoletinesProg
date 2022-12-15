
package boletin_4;


public class Boletin_4 {

    
    public static void main(String[] args) {
        
         Libro obxLib1 = new Libro((short) 1,"hola","adios",856);
            obxLib1.amosar();
            Libro lib2 = new Libro();
            lib2.amosar();
            lib2.setAutor("rgjrg");
            lib2.setTitulo("titulo");
            lib2.setAno(2020);
            lib2.setNumPaginas((short)320);
            lib2.setValoracion(7.5f);
            lib2.amosar();
    }
    
}

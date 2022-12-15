
package boletin11_2;
import java.math.BigInteger;

public class Metodoos {
    public void CalcularNumeros(){
        long suma=0;
        BigInteger prod=BigInteger.ONE;
        for(long i=10;i<90;i++){
      suma=suma+i;
      prod=prod.multiply(BigInteger.valueOf(i));
            
        }
        System.out.println(" La suma= "+suma+" El producto es igual a= "+prod);
    }
    
}

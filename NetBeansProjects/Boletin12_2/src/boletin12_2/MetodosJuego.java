
package boletin12_2;

import javax.swing.JOptionPane;


public class MetodosJuego {
    
        int numIntentos = pedirNumeroIntentos();

        public void metodosJugadores() {
            int numeroAdiv = (int) (Math.random() *(50-1)+1);
            do {
                if (numIntentos<0){
                    JOptionPane.showMessageDialog(null, " Sigue las normas y pon por lo menos un intento ");
                    break;
                }
                int intento = pedirNumero();
                if (intento >= 1 && intento <= 50) {
                    if (Math.abs(numeroAdiv - intento) > 20) {
                        JOptionPane.showMessageDialog(null, " El numero a adivinar está muy lejos ");
                        numIntentos--;
                    } else if (Math.abs(numeroAdiv - intento)>10){
                        JOptionPane.showMessageDialog(null, " El numero a adivinar está lejos ");
                        numIntentos--;
                    }else if (Math.abs(numeroAdiv - intento)>5)  {
                        JOptionPane.showMessageDialog(null, " El numero a adivinar está cerca ");
                        numIntentos--;
                    } else if (Math.abs(numeroAdiv - intento)>=1) {
                        JOptionPane.showMessageDialog(null, " El numero a adivinar está muy cerca ");
                        numIntentos--;
                    } else if (intento==numeroAdiv) {
                        JOptionPane.showMessageDialog(null, " Ganaste y adivinaste felicidades ");
                        break;
                    }


                }
                else{
                    JOptionPane.showMessageDialog(null, " El intento debe estar entre 1 y 50 ");
                    break;
                }

            }
            while (numIntentos > 0);
            if (numIntentos == 0) {
                JOptionPane.showMessageDialog(null, " Te quedaste sin intentos perdiste F ");
            }
        }


        public static int pedirNumeroIntentos () {

            return Integer.parseInt(JOptionPane.showInputDialog(" Jugador 1 teclea el número de intentos "));
        }
        public static int pedirNumero () {

            return Integer.parseInt(JOptionPane.showInputDialog(" Jugador 1 teclea un numero entre 1 y 50 "));
        }
    }


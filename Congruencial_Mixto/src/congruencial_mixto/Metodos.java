/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congruencial_mixto;

/**
 *
 * @author aron
 */
public class Metodos {
    
    
    
           
    // VERIFICAR SI UN NUMERO ES PRIMO
        public static boolean num_primo(int num) { // se realiza el metodo donde me reciba un numero entero
        int cont = 2;   // se declara un contador que nos servira para la condicion
        boolean num_primo = true;
        while ((num_primo) && (cont != num)) {//se reaiza un ciclo donde num_primo sea true y el contador no llegue a tope. 
            if (num % cont == 0) {// se realiza un if donde el residuo entre el numero(num) y el contador(cont) sea 0 
                num_primo = false; // si se cumple la condicion cambia a false
            }
            cont++;
        }
        return num_primo; // retorna el numero primo.
    }

    // Se escoge un num. primo con respecto a M 
    public static double num_Primo_M(double num) {// se crea un metodo que me reciba un numero decimal.
        int cont = 2;
        boolean num_primo = true;

        while ((num_primo) && (cont != num)) {// se realiza la misma condicion que en el metodo anterior
            if (num % cont == 0) {
                num_primo = false;
            }
            cont++;
        }

        if (num_primo) {// Si se cumple la condicion(true)
            return num; // retorna el numero.
        } else {//caso contrario
            return num_Primo_M(num - 1);// retorna el numero(num) restado 1 (num-1) 
        }

    }
    
    
}

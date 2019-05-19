/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congruencial_mixto;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aron
 */
public class Congruencial_Mixto extends Metodos {

   

    public static void main(String[] args) {
       
        //VARIABLES    
        //g  --> generador que nos servira para calcular el MODULO
        //n --> Resuktado de la congruencia mixta Xn+1=(aXn+c)mod m
        //mod --> MODULO
        //Xo --> SEMILLA
        //k --> es el valor que nos servira para calcular el MULTIPLICADOR
        //a --> MULTIPLICADOR
        //c --> CONSTANTE ADITIVA
        
        int k, a, c; 
        double n = 0,g = 0, xo, mod;
        
       
        
    //***--CONDICIONES---***//
        
        //SELECCIONAR EL MODULO (mod)
        
                    boolean entero = true; // declaramos una variable boolean que sea verdadera para verificar un num entero.
                    int v = 0;  //declaramos una varible que nos servira para validar un numero entero
                    while (entero) {//mientras entero sea verdadera va a estar ejecutandose
                        try {
                            v = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de g para calcular el MODULO", "MODULO", JOptionPane.INFORMATION_MESSAGE)); //Se pide del valor de g para validar que sea numero entero.
                            entero = false;
                        } catch (NumberFormatException e) {

                        }
                    }

                                    // g va a tomar el valor del numero validado
                                    g = v;
                                    //Para determinar el valor el modulo se realiza la siguiente operacion:
                                    mod= Math.pow(2, g);

        //SELECCIONAR EL VALOR DEL MULTIPLICADOR (a)
                    
                    entero = true;
                    v = 0;
                    while (entero) {
                        try {
                            //Se pide el valor de k para calcular el MULTIPLICADOR a=1+4k
                            v = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese k para el calculo del Multiplicador(a):", "MULTIPLICADOR", JOptionPane.INFORMATION_MESSAGE));
                            entero = false;
                        } catch (NumberFormatException e) {

                        }
                    }
                    k = v;// de igual manera se le asigna k el valor que se valido(v)
                        
                    a = 1 + (4 * k); // se aplica la formula para calcular le MULTIPLICADOR
        
                    
        //SELECCIONAR EL VALOR DE LA CONSTANTE ADITIVA (c)
        
        
                    c = (int) num_Primo_M(mod);// Llamamos al metodo y realizamos un cast de double a entero para la variable c.

                    JOptionPane.showMessageDialog(null, "El valor primo relativo a M es: " +c);//presentamos en una ventana el valor primo relativo al MODULO
                    xo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de Xo", "SEMILLA", JOptionPane.INFORMATION_MESSAGE));//Se pide el valor de la semilla

                    boolean validar_X = true;
                    while (validar_X) {
                        if (xo > 0) {// se aplica la condicion de que la semilla tiene que ser mayor a 0 (Xo>0)
                            validar_X = false;
                        } else {// en caso de que no se cumpla la condicion se pide de nuevo el valor de la semila (Xo)
                            xo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de X", "SEMILLA", JOptionPane.INFORMATION_MESSAGE));
                        }
                    }

        //GENERACION DE LA TABLA CON LOS VALORES OBTENIDOS
        
   
                    System.out.println("Contador (n)" + "\t\t" + "Semilla(Xn)" + "\t\t" + "Xn+1" + "\t\t" + "Numeros Uniformes");
                    double periodo = xo / mod; //varible para calcular el periodo

                    for (int i = 0; i < mod; i++) { //aplicamos un for para controlar que los valores no se vuelvan a repetir-- 1 solo periodo.
                        int cont = 1;// declaramos un contador que nos serviara cuantos periodos tiene la serie.
                        
                        //Aplicamos la formula de la congruencia mixta.
                        n = (a * xo + c) % mod;
                        System.out.println(i+ "\t\t\t" + xo+ "\t\t\t" + n + "\t\t" + n + "/" + mod);
                        xo = n; // en la siguiente vuelta la semlla(X0) tomara el valor de n(Xn+1) 
                        if (periodo == n / mod) { // condicion para que me cuente los peridos
                            System.out.println(cont +" PERIODO");
                            cont++;
                        }

                    }
    }
}
    


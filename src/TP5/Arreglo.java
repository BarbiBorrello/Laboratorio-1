/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP5;

/**
 *  
 * @author Barbara
 */
public class Arreglo {
  

    private final int suma = 0;
    private final int promedio = 0;
    private final int mayor = 100;
    private final int filaMayor = 0;
    private final int colMayor = 0;
    private final int contador = 0;

    private String string;
    private char caracteres;

    public static int sumarLista(int numeros[]) {
        int suma = 0;
        int promedio = 0;

//    suma= int numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4]+numeros[5];
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            promedio = suma / 5;

//      suma todos los valores de los indices del arreglo numeros 
        }
        System.out.println("La suma es :" + suma);
        System.out.println("La promedio es :" + promedio);
        return suma;

    }

    public static int buscarMayor(int numeros2[][]) {
        int mayor = 100;
        int filaMayor, colMayor = 0;

        for (int filas = 0; filas < numeros2.length; filas++) {
            for (int columnas = 0; columnas < numeros2[filas].length; columnas++) {
                if (numeros2[filas][columnas] > mayor) {
                    mayor = numeros2[filas][columnas];
                    filaMayor = filas;
                    colMayor = columnas;

                }
            }
        }
        System.out.println("El numero mayor es: " + mayor);
        return 0;
    }

    public static int cuentaVocales(String str) {
        int contador = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')) {
                contador++;
            }

        }

        return contador;
    }

    public static int cuentaCaracter(String str, char caracter) {
        int contador = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == caracter) {
                contador++;
            }

        }

        return contador;
    }

}

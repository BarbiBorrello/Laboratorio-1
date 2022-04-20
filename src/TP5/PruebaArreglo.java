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
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arreglo a = new Arreglo();
        int numeros[] = {1, 10, 11, 100, 40};
        a.sumarLista(numeros);

        Arreglo a1 = new Arreglo();
        int numeros2[][] = {{467, 2}, {54, 90, 38}, {7, 1, 0, 18}};
        a1.buscarMayor(numeros2);

        Arreglo a2 = new Arreglo();
        String cVocales[] = new String[4];
        cVocales[0] = new String("Hola");
        cVocales[1] = new String("Adios");
        cVocales[2] = new String("Hello");
        cVocales[3] = new String("Goodbye");
        for (int i = 0; i < cVocales.length; i++) {
            System.out.println("La cantidad de vocales en la posicion " + i + " es  " + a2.cuentaVocales(cVocales[i]) + " vocales");
        }
        for (int i = 0; i < cVocales.length; i++) {
            System.out.println("La cantidad de veces que se repite el caracter L en la posicion " + i + " es " + a2.cuentaCaracter(cVocales[i], 'l') + " veces");
        }

    }

}

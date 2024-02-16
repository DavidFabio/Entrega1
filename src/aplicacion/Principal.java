package aplicacion;

import java.util.Arrays;

import mates.Funciones;

public class Principal{
    public static void main(String[] args) {
        System.out.println("La suma de los 10 primeros números es de "+ Funciones.sumanaturales(10));
        System.out.println("El factorial de 10 es: " + Funciones.factorial(10));
        System.out.println("La potencia del número 2 elevado a 2: " + Funciones.potencia(2, 4));
        int [] lista = {4,5,6};
        System.out.println("La suma de todos los elementos de la lista es: " + Funciones.sumalista(lista));
        System.out.println("La media aritmética de los elementos de la lista es: " + Funciones.media(lista));
        System.out.println("La desviación típica de los elementos de la lista es: " + Funciones.desviacion(lista));
        System.out.println("La suma de los 5 primeros números es: " + Funciones.sumaPares(5));
        System.out.println("La suma de los números pares de la lista es: " + Funciones.sumaPares(lista));
        System.out.println("El array de números pares de la lista es: " + Arrays.toString(Funciones.obtenerListaPar(lista)));
        System.out.println("El array de números pares hasta el 5: " + Arrays.toString(Funciones.listaPar(5)));
        int [] lista2 = {1,2,3};
        System.out.println("La suma de la multiplicacion de los elementos del la lista 1 y la lista 2 es: " + Funciones.ProductoEscalar(lista, lista2));
    }
}
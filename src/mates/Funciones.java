package mates;

import java.util.Arrays;

public class Funciones{

    //Ejercicio1
    
    public static int sumanaturales(int n){
        int acumulado=0;
        for (int i=0;i<=n;i++){
            acumulado+=i;
        }
        return acumulado;
    }

    //Ejercicio2

    public static int factorial(int n){
        int acumulado=1;
        for (int i=1;i<=n;i++){
            acumulado*=i;
        }
        return acumulado;
    }
    
    //Ejercicio3

    public static int potencia(int num, int n){
        int potencia=1;
        for (int i=1;i<=n;i++){
            potencia*=num;
        }
        return potencia;
    }

    //Ejercicio4

    public static int sumalista(int[] lista){
        int resultado=0;

        for(int i=0;i<lista.length;i++){
            resultado+=lista[i];
        }
        return resultado;
    }

    //Ejercicio5

    public static int media(int[] lista){
        int suma=0;
        for(int i=0;i<lista.length;i++){
            suma+=lista[i];
        }
        return suma/lista.length;
    }
    
    //Ejercicio6

    public static double desviacion(int[] lista) {
        double media = media(lista);
        double sum = 0;
        for (int i = 0; i < lista.length; i++) {
            sum += Math.pow(lista[i] - media, 2);
        }
        return Math.sqrt(sum / lista.length);
    }

    //Ejercicio7

    public static int sumaPares(int n) {
        int suma=0;
        for (int i=2;i<n;i++){
            if(i%2==0){
                suma+=i;
            }
        }
        return suma;
    }

    //Ejercicio8

    public static int sumaPares(int [] lista) {
        int suma=0;
        for (int i=0;i<lista.length;i++){
            if(lista[i]%2==0){
                suma+=lista[i];
            }
        }
        return suma;
    }

    //Ejercicio9

    public static int[] obtenerListaPar(int [] lista) {
        int [] lista3 = new int [lista.length];
        int j= 0;
        for (int i=0;i<lista.length;i++){
            if(lista[i]%2==0){
                lista3[i]=lista[i];
                j++;
            }
        }
        int[] lista2 =Arrays.copyOf(lista3, j);
        return lista2;
    }

    //Ejercicio10

    public static int[] listaPar(int n){
        int j = 0;
        int l = 0;
        int [] lista = new int [n];
        for (int i=2;i<n;i++){
            if(i%2==0){
                j++;
                lista[j]=i;
            }
            l++;
        }
        int[] lista2 =Arrays.copyOf(lista, l);
        return lista2; 
    }

    //Ejercicio11

    public static int ProductoEscalar(int [] lista,int [] lista2){
        int resultado=0;
        for(int i=0;i<lista.length;i++){
            resultado+=lista[i]*lista2[i];
        }
        return resultado;

    }

}
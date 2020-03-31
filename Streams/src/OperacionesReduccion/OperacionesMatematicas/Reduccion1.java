package OperacionesReduccion.OperacionesMatematicas;

import java.util.stream.IntStream;

public class Reduccion1 
{
    public static void main(String[] args) 
    {
        int[] numeros = {4, 6, 8, 10, 12, 15, 55, 7, 9, 2, 5, 8, 10, 33, 66, 58, 24, 97, 99, 25};
        
        //Suma Elementos tradicional 
        int suma = 0;
        int maximo = 0;
        int minimo = numeros[0];
        
        for (Integer numero : numeros)
        {
            suma += numero;
            if(maximo < numero)
                maximo = numero;
            
            if(minimo > numero)
                minimo = numero;
        }
        
        
        System.out.println("Suma es : " + suma);
        System.out.println("Canidad de numeros : " + numeros.length);
        System.out.println("Primedio es : " + suma/numeros.length);
        System.out.println("Maximo numero es : " + maximo);
        System.out.println("Minimo numero es : " + minimo);
        
        System.out.println("-----------------------------------------------");
        
        //Suma con Operaciones Lambda :
        Integer suma2 = IntStream.of(numeros).sum();
        Double promedio2 = IntStream.of(numeros).average().getAsDouble();
        Integer minimo2 = IntStream.of(numeros).min().getAsInt();
        Integer maximo2 = IntStream.of(numeros).max().getAsInt();
        Long cantidad2 = IntStream.of(numeros).count();
        
        System.out.println("Suma es : " + suma2);
        System.out.println("Promedio es : " + promedio2);
        System.out.println("Minimo numero :  " + minimo2);
        System.out.println("Maximo es : " + maximo2);
        System.out.println("Cantidad de numeros es : " + cantidad2);
    }
}

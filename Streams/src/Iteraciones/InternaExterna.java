package Iteraciones;

import java.util.Arrays;
import java.util.List;

public class InternaExterna 
{
    public static void main(String[] args) 
    {
        //Iteracion Externa
        List<Integer> listaNumeros1 = Arrays.asList(1, 2, 3, 4, 5);
        
        int suma = 0;
        
        for(Integer numero : listaNumeros1)
            if(numero % 2 == 1)
            {
                int cuadrado = numero * numero;
                suma = suma + cuadrado;
            }
        
        System.out.println("Suma de los numeros es : " + suma);
        
        System.out.println("----------------------------------------");
        
        //Iteracion Interna
        
        List<Integer> listaNumeros2 = Arrays.asList(1, 2, 3, 4, 5);
        
        Integer suma2 = listaNumeros2.stream()
                .filter(n -> n%2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer :: sum);
        
        System.out.println("Suma de los numeros es :  " + suma2);
    }
}

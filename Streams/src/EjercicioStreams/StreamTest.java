package EjercicioStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest 
{
    public static void main(String[] args) 
    {
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5);
        
        Stream<Integer> numStream = listaNumeros.stream();
        
        int suma = numStream
                    .filter(numero -> numero % 2 == 1) // {1, 3, 5}
                    .map(numero -> numero * numero)  //{1, 9, 25}
                    .reduce(0, Integer :: sum);
        
        System.out.println("Suma de numeros impares es : " + suma);
    }
}

package CrearStreams.StreamDeFunciones;

import java.util.Random;
import java.util.stream.Stream;

public class CrearStream 
{
    public static void main(String[] args) 
    {
        Stream<Long> primerosDiez = Stream.iterate(1L, numero -> numero + 1)
                                          .limit(10);
        
        primerosDiez.forEach(System.out :: println);
        
        System.out.println("------------------------------------------------");
        
        Stream.iterate(1L, numero -> numero + 1)
              .filter(numero -> numero % 2 == 0)
              .limit(20)
              .forEach(System.out :: println);
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Despues de los 100 primeros pares : ");
        Stream.iterate(1L, numero -> numero + 1)
              .skip(100)
              .filter(numero -> numero % 2 == 0)
              .limit(5)
              .forEach(System.out :: println);
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Numeros aleatorios : ");
        Stream.generate(Math :: random)
              .limit(5)
              .forEach(System.out :: println);
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Enteros Aleatorios : ");
        new Random().ints()
                .limit(5)
                .forEach(System.out :: println);
    }
}

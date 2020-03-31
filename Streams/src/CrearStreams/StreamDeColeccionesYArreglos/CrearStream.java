package CrearStreams.StreamDeColeccionesYArreglos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStream 
{
    public static void main(String[] args) 
    {
        IntStream numStream = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7});
        numStream.forEach(System.out :: println);
        
        System.out.println("----------------------------------------------");
        
        Stream<String> nombres = Arrays.stream(new String[]{"Anderson", "Carol"});
        nombres.forEach(System.out :: println);
        
        System.out.println("----------------------------------------------");
        
        Set<String> lenguajes = new HashSet<>();
        lenguajes.add("Java");
        lenguajes.add("C++");
        lenguajes.add("C#");
        lenguajes.add("Python");
        
        Stream<String> lenguajeStream = lenguajes.stream();
        lenguajeStream.forEach(System.out :: println);
    }
}

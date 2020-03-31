package CrearStreams.StreamDeValores;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreaStream 
{
    public static void main(String[] args) 
    {
        Stream<String> stream1 = Stream.of("Curso de Programacion");
        stream1.forEach(System.out :: println);
        
        System.out.println("-----------------------------------------");
        
        Stream<String> stream2 = Stream.of("Curso1", "Curso2", "Curso3", "Curso4");
        stream2.forEach(System.out :: println);
        
        System.out.println("-----------------------------------------");
        
        String[] arregloString = {"java", "C++", "C#", "Python", "NodeJS", "Ruby"};
        //List<String> arregloString = Arrays.asList("java");
        Stream<String> stream3 = Stream.of(arregloString);
        stream3.forEach(System.out :: println);
        
        System.out.println("-----------------------------------------");
        
        Stream<Estudiante> streamEstudiante = Stream.<Estudiante>builder()
                                             .add(new Estudiante("N01", 17, 1.6, 15.0))
                                             .add(new Estudiante("N02", 20, 1.8, 10.0))
                                             .add(new Estudiante("N03", 25, 1.85, 12.0))
                                             .build();
        
        streamEstudiante.forEach(estudiante -> System.out.println("Identificador : " + estudiante.getDNI()));
        
        System.out.println("-----------------------------------------");
        
        IntStream unoAVeinte = IntStream.rangeClosed(1, 20);
        unoAVeinte.forEach(System.out :: println);
    }
}

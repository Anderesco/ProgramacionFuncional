package CrearStreams.StreamDeArchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CrearStream 
{
    public static void main(String[] args) 
    {
        Path path1 = Paths.get("Test//Parrafo.txt");
        
        try (Stream<String> lineas = Files.lines(path1))
        {
            lineas.forEach(linea -> {
                System.out.println("Linea ... ");
                System.out.println(linea);
            });
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
            
        System.out.println("---------------------------------------------"); 
        
        Path directorio = Paths.get(".");
        System.out.printf("%nEl arbol de archivos "
                + "de proyectos para "
                + "%s es %n", directorio.toAbsolutePath());
        
        try (Stream<Path> paths = Files.walk(directorio))
        {
            paths.forEach(System.out :: println);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}

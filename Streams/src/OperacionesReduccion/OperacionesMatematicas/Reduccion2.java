package OperacionesReduccion.OperacionesMatematicas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduccion2 
{
    public static void main(String[] args) 
    {
        int[] numeros = {4, 6, 8, 10, 12, 15, 55, 7, 9, 2, 5, 8, 10, 33, 66, 58, 24, 97, 99, 25};
        
        int suma = IntStream.of(numeros)
                            .reduce(numeros[0], Integer :: sum);
        
        System.out.println("La suma es : " + suma);
        
        Path path1 = Paths.get("Test/Parrafo.txt");
        
        String texto = "";
        
        try (Stream<String> lineas = Files.lines(path1))
        {
            texto =  lineas.map(linea -> linea.replace(".", ""))
                    .reduce("", (linea1, linea2) -> linea1.concat("\n").concat(linea2));
        } 
        catch (IOException e) { e.printStackTrace();}
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Test/Parrafo.txt")))
        {
            bw.write(texto);
        } 
        catch (Exception e) { e.printStackTrace(); }
    }
}

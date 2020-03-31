package CrearStreams.StreamDeString;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CrearStream 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        String entrada = leer.nextLine();
        
        IntStream streamChars = entrada.chars();
        streamChars.filter(numero -> !Character.isDigit((char) numero)
                                      && !Character.isWhitespace((char)numero))
                   .forEach(numero -> System.out.print((char) numero));
        
        System.out.println("\n------------------------------------------------");
        
        String cadena = "JAVA, HTML, CSS, C++, C#, Python, Ruby";
        
        Pattern.compile(", ")
               .splitAsStream(cadena)
               //.limit(1)
               .forEach(System.out :: println);
    }
}

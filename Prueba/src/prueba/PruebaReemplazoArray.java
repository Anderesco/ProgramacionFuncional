package prueba;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.lang.StringUtils;

public class PruebaReemplazoArray 
{
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {
        String personaIDs = "-1";
        String persona2 ="123,1456,1256";
        String persona3 = "4523";
        Scanner leer = new Scanner(System.in);
        
        int[] numbers1 = Arrays.stream(personaIDs.split(",")).filter(StringUtils::isNumeric).mapToInt(Integer::parseInt).toArray();
        int[] numbers2 = Arrays.stream(persona2.split(",")).filter(StringUtils::isNumeric).mapToInt(Integer::parseInt).toArray();
        int[] numbers3 = Arrays.stream(persona3.split(",")).filter(StringUtils::isNumeric).mapToInt(Integer::parseInt).toArray();
        
        List<Integer> list = IntStream.of(numbers1).boxed().collect(Collectors.toList());
        List<Integer> list2 = IntStream.of(numbers2).boxed().collect(Collectors.toList());
        List<Integer> list3 = IntStream.of(numbers3).boxed().collect(Collectors.toList());
        
        System.out.println("numbers 1:" + numbers1.length);
        System.out.println("numbers 2:" + numbers2.length);
        System.out.println("numbers 3:" + numbers3.length);
        
        System.out.println("-----------------------------");
        System.out.println("prueba -1:" + list);
        
        System.out.println("-----------------------------");
        System.out.println("prueba 2:" + list2);
        
        System.out.println("-----------------------------");
        System.out.println("prueba 3:" + list3);
        
        System.out.println("----------------------------------------------------");
        System.out.println("PersonaID: ");
        String idPersona = leer.next();
        int[] numeroPrueba = null;
        List<Integer> lista = null;
        
        if("-1".equals(idPersona))
        {
            lista = IntStream.of(Integer.parseInt(idPersona)).boxed().collect(Collectors.toList());
            System.out.println("Lista -1: " + lista);
        }
        
        else
        {
            numeroPrueba = Arrays.stream(idPersona.split(",")).filter(StringUtils::isNumeric).mapToInt(Integer::parseInt).toArray();
            lista = IntStream.of(numeroPrueba).boxed().collect(Collectors.toList());
            
            System.out.println("Lista normal" + lista);
        }
        
    }
}

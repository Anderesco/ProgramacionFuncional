package metodosreferenciados.Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class NuevoEjercicio 
{
    public static List<Integer> getResult(List<String> listaString, Function<String, Integer> funcion)
    {
        List<Integer> resultados = new ArrayList<>();
        
        listaString.forEach(stringNumeros -> resultados.add(funcion.apply(stringNumeros)));
        
        return resultados;
    }
    
    public static void main(String[] args) 
    {
        List<String> numero = Arrays.asList("10", "20", "30", "40", "50", "60", "70", "80", "90", "100");
        
        getResult(numero, Integer :: new).forEach(numeros -> System.out.println(numeros * 10));
    }
}

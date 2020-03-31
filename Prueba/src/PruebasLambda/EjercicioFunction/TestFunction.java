package PruebasLambda.EjercicioFunction;

import java.util.function.Function;

public class TestFunction 
{
    public static void main(String[] args) 
    {
        Function<Integer, String> convertidor = (x) -> {
            return Integer.toString(x);
        };
        
        System.out.println("Convertir: " + convertidor.apply(3).length());
        System.out.println("Convertir: " + convertidor.apply(30).length());
    }
}

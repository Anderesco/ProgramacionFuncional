package PruebasLambda.EjercicioBiFunction.Ejercicio1BiFuncional;

import java.util.function.BiFunction;

public class EjercicioBiFunction 
{
    public static void main(String[] args) 
    {
        BiFunction <String, String, String> biFuncion = (x, y) -> x + " + " + y ;
        
        System.out.println("Concatenacion: " + biFuncion.apply("Hola", "Mundo"));
    }
}

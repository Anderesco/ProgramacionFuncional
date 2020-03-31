
package PruebasLambda.EjercicioBiFunction.Ejercicio1BiFuncional;

import java.util.function.BiFunction;

public class Calculadora 
{
    public String calcular (
            BiFunction<Integer, Integer, String> bifuncion, 
            Integer numero1,
            Integer numero2)
    {
        return bifuncion.apply(numero1, numero2);
    }
}

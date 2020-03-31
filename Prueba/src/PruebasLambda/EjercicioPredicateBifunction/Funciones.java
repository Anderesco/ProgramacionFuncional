package PruebasLambda.EjercicioPredicateBifunction;

import java.util.function.BiFunction;

public class Funciones 
{
    public Double incrementoSalario(
            Empleado empleado, 
            Double incremento,
            BiFunction<Double, Double, Double> bifuncion)
    {
        return bifuncion.apply(empleado.getSalario(), incremento);
    }
}

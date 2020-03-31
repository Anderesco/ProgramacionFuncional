package PruebasLambda.EjercicioBiFunction.Ejercicio2BiFuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculadora2
{
    public List<Double> calcular2 (
            BiFunction<Double, Double, Double> bifuncion,
            List<Empleado> listaEmpleado,
            Double incremento)
    {
        List<Double> listaMonto = new ArrayList<>();
        
        for(Empleado objEmpleado : listaEmpleado)
            listaMonto.add(bifuncion.apply(objEmpleado.getMonto(), incremento));
        
        return listaMonto;
    }
} 

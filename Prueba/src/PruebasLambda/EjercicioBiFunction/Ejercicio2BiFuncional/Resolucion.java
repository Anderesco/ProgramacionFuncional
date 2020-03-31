package PruebasLambda.EjercicioBiFunction.Ejercicio2BiFuncional;

import java.util.Arrays;
import java.util.List;

public class Resolucion 
{
    public static void main(String[] args) 
    {
        List<Empleado> listaEmpleado = 
                Arrays.asList(
                new Empleado("Anderson", 1000.0),
                new Empleado("Carol", 1500.0),
                new Empleado("Anabell", 2000.0)
                );
        
        Calculadora2 calculadora = new Calculadora2();
        
        List<Double> listTotalMonto = calculadora.calcular2(
                (salario, incremento) -> salario + (salario * incremento/100), 
                listaEmpleado, 16.0);
        
        System.out.println("Montos totales son : ");
        
        for(Double montos : listTotalMonto)
            System.out.println(montos);
    }
}

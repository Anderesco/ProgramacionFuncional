package PruebasLambda.EjercicioBiPredicate.Complejo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Principal 
{
    public static void main(String[] args) 
    {
        List<Empleado> listaEmpleado = Arrays.asList(
        new Empleado("Anderson", 25, 1000.5, "Cobranzas"),
        new Empleado("Carol", 23, 900.5, "Ventas"),
        new Empleado("Miguel", 15, 500.0, "Marketing"),
        new Empleado("Susana", 30, 2000.0, "Mostrador"),
        new Empleado("Lili", 28, 1500.0, "Produccion"),
        new Empleado("Ambar", 20, 950.0, "Mostrador"),
        new Empleado("Maria", 32, 4000.0, "Produccion"),
        new Empleado("Luis", 18, 1000.0, "Ventas"),
        new Empleado("Ana", 26, 2000.0, "Mostrador"),
        new Empleado("Beatriz", 40,5000.0, "Ventas"),
        new Empleado("Manuel", 28, 1500.0, "Marketing"),
        new Empleado("Cristian", 24, 1000.0, "Mostrador")
        );
        
        Evaluador evaluador = new Evaluador();
        
        BiPredicate<Integer, String> primerCriterio = 
                (edad, departamento) -> (edad >= 25) && (departamento.equals("Ventas"));
        
        BiPredicate<Integer, String> segundoCriterio = 
                (edad, departamento) -> (edad >= 25) && (departamento.equals("Mostrador"));
        
        BiPredicate<Integer, String> criterioTotal = primerCriterio.or(segundoCriterio);
        
        System.out.println("Empleado de mostrador o ventas mayores de 25 años: ");
        
        List<Empleado> listaFiltradaEmpleado = evaluador.evaluar(listaEmpleado, criterioTotal);
        Integer i = 1;
        
        for(Empleado empleados : listaFiltradaEmpleado)
        {
            System.out.println(i + ".\n" + empleados.toString() + "\n");
            i++;
        }
        
    }
}

package PruebasLambda.EjercicioPredicate.PredicateComplejo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        new Empleado("Ambar", 20, 950.0, "Desarrollo")
        );
        
        Evaluador evaluador = new Evaluador();
        
        System.out.println("Empleados con salarios mayor a 1000");
        List<Empleado> empleadoLista = evaluador.evaluar(
                listaEmpleado, 
                empleado -> empleado.getSalario() > 1000);
        
        for(Empleado empleados : empleadoLista)
            System.out.println(empleados.toString() + "\n");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Nombres que empiezan con A : ");
        List<Empleado> empleadosConA = evaluador.evaluar(
                listaEmpleado, 
                empleado -> empleado.getNombre().startsWith("A"));
        
        for(Empleado empleado : empleadosConA)
            System.out.println(empleado.getNombre());
    }
}

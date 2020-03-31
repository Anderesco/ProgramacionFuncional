package PruebasLambda.EjercicioPredicateBifunction;

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
        Funciones funcion = new Funciones();
        
        System.out.println("Empleados Jovenes:  ");
        List<Empleado> listaEmpleadoJovenes = evaluador.evaluar(
                listaEmpleado, empleado -> empleado.getEdad() < 25);
        
        for(Empleado empleado : listaEmpleadoJovenes)
        {
            Double empleadoConIncremento = funcion.incrementoSalario(
                empleado, 
                10.0, 
                (salario, incremento) -> salario + (salario*incremento/100));
            System.out.print("Empleado : " + empleado.getNombre() + "\t");
            System.out.print("Su salario era: " + empleado.getSalario() + "\t");
            System.out.println("Ahora es: " + empleadoConIncremento);
        }
        
        System.out.println(" ------------------------------------------------- ");
        System.out.println("Empleados Mayores:  ");
        List<Empleado> listaEmpleadoMayores = evaluador.evaluarNegacion(
                listaEmpleado, empleado -> empleado.getEdad() < 25);
        
        for(Empleado empleado : listaEmpleadoMayores)
            System.out.println(empleado.toString() + "\n");
    }
}

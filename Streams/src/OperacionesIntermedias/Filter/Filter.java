package OperacionesIntermedias.Filter;

import java.util.List;
import java.util.function.Predicate;

public class Filter 
{
    public static void main(String[] args) 
    {
        List<Empleado> listaEmpleado = Empleado.listaEmpleado();
        
        System.out.println("Empleados hombres : ");
        listaEmpleado.stream()
                     .filter(empleado -> empleado.getGenero() == true)
                     .forEach(System.out :: println);
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Empleados mujeres : ");
        listaEmpleado.stream()
                     .filter(empleado -> empleado.getGenero() == false)
                     .forEach(System.out :: println);
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Empleados mayores de 25 años : ");
        listaEmpleado.stream()
                     .filter(empleado -> empleado.getEdad() > 25)
                     .forEach(System.out :: println);
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Empleados hombres y empiecen con A : ");
        listaEmpleado.stream()
                     .filter(empleado -> empleado.getGenero() == true)
                     .filter(empleado -> empleado.getNombre().startsWith("A"))
                     .forEach(System.out :: println);
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Empleados hombres que ganen mas de 500 : ");
        listaEmpleado.stream()
                     .filter(empleado -> empleado.getGenero() == true &&
                                         empleado.getIngreso() > 500)
                     .forEach(System.out :: println);
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Cantidad de empleados mujeres que ganen menos de 500 : ");
        Predicate<Empleado> empleadoFemenino = empleado -> empleado.getGenero() == false;
        Predicate<Empleado> esMenor = empleado -> empleado.getIngreso() < 500;
        Predicate<Empleado> condicion = empleadoFemenino.and(esMenor);
        
        listaEmpleado.stream()
                     .filter(condicion)
                     .forEach(System.out :: println);
        
        System.out.println("Cantidad total : " + listaEmpleado.stream().filter(condicion).count());
    }
}

package OperacionesIntermedias.Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted 
{
    public static void main(String[] args) 
    {
        System.out.println("Nombres ordenados : ");
        Arrays.asList("Anderson", "Liliana", "Cristian", "Luis", "Carol")
                .stream()
                .sorted()
                .forEach(System.out :: println);
        
        System.out.println("-----------------------------------------------");
        
        List<Empleado> listaEmpleado = Empleado.listaEmpleado();
        
        System.out.println("Ordenar por nombre : ");
        listaEmpleado.stream()
                     .sorted()
                     .forEach(System.out :: println);
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Ordenar por edad :");
        listaEmpleado.stream()
                     .sorted(new Comparator<Empleado>(){
                                @Override
                                public int compare(Empleado o1, Empleado o2) {
                                    return o1.getEdad() - o2.getEdad();
                                }   
                        })
                      .forEach(System.out :: println);
        
        System.out.println("-----------------------------------------------");
           
        System.out.println("Ordenar por edad mayores de 25 :");
        listaEmpleado.stream()
                     .filter(empleado -> empleado.getEdad() > 25)
                     .sorted((empleado1, empleado2) -> (int)(empleado1.getEdad() - empleado2.getEdad()))
                     .forEach(System.out :: println);
    }
}

package OperacionesReduccion.Collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collect 
{
    public static void main(String[] args) {
        List<String> nombreEmpleado = Empleado.listaEmpleado()
                                               .stream()
                                               .map(Empleado :: getNombre)
                                               .collect(ArrayList :: new, ArrayList :: add, ArrayList :: addAll);
        
        System.out.println("Empleados : " + nombreEmpleado);
        
        System.out.println("----------------------------------------------");
        
        List<String> nombreEmpleado2 = Empleado.listaEmpleado()
                                               .stream()
                                               .map(Empleado :: getNombre)
                                               .collect(Collectors.toList());
        
        System.out.println("Empleados : " + nombreEmpleado2);
    }
}

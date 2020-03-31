package OperacionesReduccion.Collect;

import java.util.Map;
import java.util.stream.Collectors;

public class Collect2 
{
    public static void main(String[] args) {
        Map<Long, String> idNombreMapa = Empleado.listaEmpleado()
                .stream()
                .collect(Collectors.toMap(
                                Empleado :: getId, Empleado :: getNombre));
        
        System.out.println(idNombreMapa);
        
        System.out.println("------------------------------------------------");
        
        Map<Boolean, String> idNombreMapa2 = Empleado.listaEmpleado()
                .stream()
                .collect(Collectors.toMap(
                                Empleado :: getGenero, 
                                Empleado :: getNombre,
                                (nombre1, nombre2) -> String.join(",\n", nombre1, nombre2)));
        
        System.out.println(idNombreMapa2);
    }
}

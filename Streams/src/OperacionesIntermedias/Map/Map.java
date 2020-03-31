package OperacionesIntermedias.Map;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Map 
{
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5)
                 .map(new IntUnaryOperator(){
                        @Override
                        public int applyAsInt(int numero) {
                            return numero * numero;
                        } 
                  })
                 .forEach(System.out :: println);
        
        System.out.println("-----------------------------------------------");
        
        IntStream.rangeClosed(1, 10)
                 .map(numero -> numero * 2)
                 .forEach(System.out :: println);
        
        System.out.println("-----------------------------------------------");
        
        List<Empleado> listaEmpleado = Empleado.listaEmpleado();
        
        System.out.println("Promedio ingresos personal femenino mayor de 25 años :");
        
        double suma = listaEmpleado.stream()
                     .filter(empleado -> empleado.getGenero() == false)
                     .filter(empleado -> empleado.getEdad() > 25)
                     .mapToDouble(empleado -> empleado.getIngreso())
                     .sum();
        
        long cantidad = listaEmpleado.stream()
                        .filter(empleado -> empleado.getGenero() == false)
                        .filter(empleado -> empleado.getEdad() > 25)
                        .mapToDouble(empleado -> empleado.getIngreso())
                        .count();
        
        System.out.println("Suma es : " + suma);
        System.out.println("Cantidad es : " + cantidad);
        System.out.println("Promedio es : " + suma/cantidad);

    }
}

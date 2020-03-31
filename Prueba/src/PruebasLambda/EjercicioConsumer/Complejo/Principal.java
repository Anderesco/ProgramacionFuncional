package PruebasLambda.EjercicioConsumer.Complejo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Principal 
{
    public static void main(String[] args) 
    {
        List<Estudiante> listaEstudiantes = Arrays.asList(
                new Estudiante("Anderson", 18.0),
                new Estudiante("Carol", 20.0),
                new Estudiante("Luis", 12.0),
                new Estudiante("Ana", 5.0),
                new Estudiante("Maria", 11.0),
                new Estudiante("Miguel", 15.0),
                new Estudiante("Leslie", 14.0),
                new Estudiante("Lili", 13.0),
                new Estudiante("Mario", 7.0),
                new Estudiante("Susana", 9.0),
                new Estudiante("Cristian", 13.0),
                new Estudiante("Veronica", 10.0));
        
        OperacionEstudiantes operacionEstudiantes = new OperacionEstudiantes();
        
        Consumer<Estudiante> condicion1 = estudiante -> System.out.println(estudiante.toString() + "\n");
        
        operacionEstudiantes.aceptarTodos(listaEstudiantes, condicion1);
        
        System.out.println("--------------------------------------------");
        
        Consumer<Estudiante> condicion2 = estudiante -> estudiante.setCalificacion(estudiante.getCalificacion()*2);
    
        /*operacionEstudiantes.aceptarTodos(listaEstudiantes, condicion2);
        operacionEstudiantes.aceptarTodos(listaEstudiantes, condicion1);*/
        
        System.out.println("--------------------------------------------");
        
        Consumer<Estudiante> condicion3 = condicion2.andThen(condicion1);
        
        operacionEstudiantes.aceptarTodos(listaEstudiantes, condicion3);
    }
}

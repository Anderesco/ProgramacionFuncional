package PruebasLambda.EjercicioConsumer.Complejo;

import java.util.List;
import java.util.function.Consumer;

public class OperacionEstudiantes 
{
    public void aceptarTodos(
            List<Estudiante> listaEstudiantes,
            Consumer<Estudiante> consumidorEstudiante)
    {
        for (Estudiante estudiante : listaEstudiantes) 
            consumidorEstudiante.accept(estudiante);
        
    }
}

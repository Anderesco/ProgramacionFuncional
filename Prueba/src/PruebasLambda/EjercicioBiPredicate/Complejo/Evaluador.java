package PruebasLambda.EjercicioBiPredicate.Complejo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Evaluador 
{
    public List<Empleado> evaluar (
            List<Empleado> empleado, 
            BiPredicate<Integer, String> biPredicado)
    {
        List<Empleado> listaEmpleadoNueva = new ArrayList<>();
        
        for(Empleado empleadosEvaluar : empleado)
            if(biPredicado.test(empleadosEvaluar.getEdad(), empleadosEvaluar.getDepartamento()))
                listaEmpleadoNueva.add(empleadosEvaluar);
        
        
        return listaEmpleadoNueva;
    }
}

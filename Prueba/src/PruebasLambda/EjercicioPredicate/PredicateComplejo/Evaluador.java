package PruebasLambda.EjercicioPredicate.PredicateComplejo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Evaluador 
{
    public List<Empleado> evaluar(
            List<Empleado> listaEmpleado, 
            Predicate<Empleado> predicado)
    {
        List<Empleado> listaNuevaEmpleado = new ArrayList<>();
        
        for(Empleado objEmpleado : listaEmpleado)
            if(predicado.test(objEmpleado))
                listaNuevaEmpleado.add(objEmpleado);
                
        return listaNuevaEmpleado;
    }
}

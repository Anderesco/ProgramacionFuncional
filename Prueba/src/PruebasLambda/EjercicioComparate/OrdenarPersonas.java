package PruebasLambda.EjercicioComparate;

import java.util.Comparator;

public class OrdenarPersonas implements Comparator<Persona>
{

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getId() - o2.getId();
    }
    
}

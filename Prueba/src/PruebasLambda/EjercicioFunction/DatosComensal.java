package PruebasLambda.EjercicioFunction;

import java.util.function.Function;

public class DatosComensal 
{
    public static Object getDataComensal(
            Comensal comensal, 
            Function<Comensal, Object> funcion)
    {
        return funcion.apply(comensal);
    }
    
    public static void main(String[] args) 
    {
        Comensal comensal = new Comensal("Anderson", 300.5, 10);
        
        String nombreComensal = (String) getDataComensal(comensal, nombre -> nombre.getNombre());
        
        System.out.println("Nombre comensal: " + nombreComensal);
    }
}

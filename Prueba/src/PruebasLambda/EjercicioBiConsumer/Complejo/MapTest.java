package PruebasLambda.EjercicioBiConsumer.Complejo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapTest 
{
    public static void main(String[] args) 
    {
        Map<String, String> map = new HashMap<String, String>();
    
        String [][] arreglo = {
            {"Chris", "USA"},
            {"Raju", "India"},
            {"Lynda", "Canada"},
        };
    
        for(int i = 0; i < arreglo.length ; i++)
            map.put(arreglo[i][0], arreglo[i][1]);
        
        System.out.println("Tradicional, imprimir clave y valor de un mapa: ");
        Iterator<Map.Entry<String, String>> iterador = map.entrySet().iterator();
        
        if(iterador != null)
            while(iterador.hasNext())
            {
                Map.Entry<String, String> entry = iterador.next();
                System.out.println("Clave : " + entry.getKey() + "\t" + "Valor : " + entry.getValue());
            }
        
        
        System.out.println("\nUsando BiConsumer y expresiones Lambda : ");
        
        map.forEach((key, value) -> System.out.println("Clave : " + key + "\t" + "Valor : " + value));
    }
    
}

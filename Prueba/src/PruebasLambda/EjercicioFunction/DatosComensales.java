package PruebasLambda.EjercicioFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class DatosComensales 
{
    public static List<Object> getDataComensales(List<Comensal> comensales, Function<Comensal, Object> funcion)
    {
        List<Object> listaObjetos = new ArrayList<>();
        
        for(Comensal comensal : comensales)
            listaObjetos.add(funcion.apply(comensal));
        
        return listaObjetos;
    }

    public static void main(String[] args) 
    {
        List<Comensal> listaComensales = new ArrayList<>();
        
        Comensal comensal[] = {new Comensal("Anderson", 300.5, 10), 
                               new Comensal("Carol", 500.2, 5),
                               new Comensal("Luis", 30.5, 4),
                               new Comensal("Liliana", 100.3, 3)
                              };
        
        for(int i = 0; i < comensal.length; i++)
            listaComensales.add(comensal[i]);
        
        List<Object> listaObjetosNombre = getDataComensales(listaComensales, nombresComensales -> nombresComensales.getNombre());
        
        System.out.println("Lista de Nombres Comensales: " + listaObjetosNombre);
        System.out.println("Por separado: ");
        int i = 1;
        
        for(Object nombreComensal : listaObjetosNombre)
        {
            System.out.println("N° " + i + " :  " + nombreComensal);
            i++;
        }
    }
}

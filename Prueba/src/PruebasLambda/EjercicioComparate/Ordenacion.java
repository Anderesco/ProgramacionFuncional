package PruebasLambda.EjercicioComparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenacion 
{
    public static void main(String[] args) 
    {
        List<String> nombres = Arrays.asList(
                "Carlos", "Ana", "Andres", "German");
        
        System.out.println("Lista a ordenarse : " + nombres);
        
        Collections.sort(nombres);
        
        System.out.println("Lista ordenada : " + nombres);
        
        System.out.println("-------------------------------------------");
        
        List<Persona> listaPersonas = new ArrayList<>();
        
        listaPersonas.add(new Persona(1, "Anderson", 25));
        listaPersonas.add(new Persona(5, "Carol", 23));
        listaPersonas.add(new Persona(2, "Luis", 30));
        listaPersonas.add(new Persona(3, "Juana", 18));
        listaPersonas.add(new Persona(4, "Omar", 10));
        
        System.out.println("Lista Personas sin ordenar :\n " + listaPersonas + "\n");
        
        Collections.sort(listaPersonas);
        
        System.out.println("----------------");
        System.out.println("Lista personas ordenar nombre : \n" + listaPersonas + "\n" );
        
        System.out.println("-----------------------");
        
        OrdenarPersonas ordenarPersonas = new OrdenarPersonas();
        Collections.sort(listaPersonas, ordenarPersonas);
        
        System.out.println("Lista ordenada por ID : "  + listaPersonas);
    }
}

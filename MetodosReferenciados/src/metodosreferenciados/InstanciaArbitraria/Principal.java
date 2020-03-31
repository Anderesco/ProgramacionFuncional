package metodosreferenciados.InstanciaArbitraria;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal 
{
    public static void main(String[] args) 
    {
        List<Persona> listaPersonas = Arrays.asList(
                new Persona("Anderson", 25),
                new Persona("Carol", 23),
                new Persona("Lucy", 30),
                new Persona("Luis", 23),
                new Persona("Marco", 28),
                new Persona("Julia", 26),
                new Persona("Jin", 35),
                new Persona("Anabell", 22),
                new Persona("Juan", 18),
                new Persona("Pedro", 33),
                new Persona("Veronica", 40),
                new Persona("Ada", 29),
                new Persona("Cristian", 38)
                );
        
        System.out.println("Lista desordenada : ");
        listaPersonas.forEach(persona -> System.out.println(persona));
        
        System.out.println("--------------------------------------------");
        
        Collections.sort(listaPersonas, Persona :: CompararPorEdad2);
        
        System.out.println("Lista Ordenada por edad :  ");
        listaPersonas.forEach(System.out :: println);
    }
}

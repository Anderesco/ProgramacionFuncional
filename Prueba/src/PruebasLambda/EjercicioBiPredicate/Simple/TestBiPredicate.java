package PruebasLambda.EjercicioBiPredicate.Simple;

import java.util.function.BiPredicate;

public class TestBiPredicate 
{
    public static void main(String[] args) 
    {
        BiPredicate<Integer, Integer> biPredicado = 
                (valor1, valor2) -> valor1 < valor2;
        
        System.out.println("Comparando Valores : " + biPredicado.test(12, 10));
        System.out.println("Comparando Valores : " + biPredicado.test(3, 4));
    }
}

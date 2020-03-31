package PruebasLambda.EjercicioPredicate.PredicateSimple;

import java.util.function.Predicate;

public class TestPredicate 
{
    public static void main(String[] args) 
    {
        Predicate<Integer> predicado = valor -> valor > 0;
        
        System.out.println("Predicado: " + predicado.test(123));
        System.out.println("Predicado: " + predicado.test(-1));
    }
}

package PruebasLambda.EjercicioBiConsumer.Simple;

import java.util.function.BiConsumer;

public class BiConsumerTest 
{
    public static void main(String[] args) 
    {
        BiConsumer<Double, Double> biconsumer = 
                (num1, num2) -> {
                    double mult = num1 * num2;
                    System.out.println("Multiplicacion es:  " + mult);
                };
        
        biconsumer.accept(15.2, 10.0);
    }
}

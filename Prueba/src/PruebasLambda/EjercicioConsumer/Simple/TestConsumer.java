package PruebasLambda.EjercicioConsumer.Simple;

import java.util.function.Consumer;


public class TestConsumer 
{
    public static void main(String[] args) 
    {
        Consumer<String> consumidor = valor -> System.out.println("Valor es: " + valor);
        
        consumidor.accept("Hola Mundo");
    }
}

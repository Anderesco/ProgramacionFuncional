package PruebasLambda.EjercicioBinaryOperator;

import java.util.function.BinaryOperator;

public class TestBinaryOperator 
{
    public static void main(String[] args) 
    {
        BinaryOperator<Integer> binarioOperador = 
                (numero1, numero2) -> numero1 * numero2;
        
        Integer resultado = binarioOperador.apply(10,20);
        System.out.println("Resultado es : " + resultado);
        
        System.out.println("--------------------------------------");
        
        BinaryOperator<Integer> binarioMin = BinaryOperator.minBy((Integer numero1, Integer numero2) -> 
                    numero1.compareTo(numero2));
        
        Integer resultado2 = binarioMin.apply(20, 10);
        
        System.out.println("Resultado menor : " + resultado2);
        
        System.out.println("--------------------------------------");
        
        BinaryOperator<Integer> binarioMax = BinaryOperator.maxBy((Integer numero1, Integer numero2) -> 
                    numero1.compareTo(numero2));
        
        Integer resultado3 = binarioMax.apply(20, 10);
        
        System.out.println("Resultado mayor : " + resultado3);
    }
}

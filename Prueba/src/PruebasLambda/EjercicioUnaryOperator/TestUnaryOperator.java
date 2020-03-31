package PruebasLambda.EjercicioUnaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;


public class TestUnaryOperator 
{
    public static List<Integer> operadorUnary(
            UnaryOperator<Integer> unarioOperador,
            List<Integer> lista)
    {
        List<Integer> listaActualizada = new ArrayList<>();
        
        lista.forEach(num -> listaActualizada.add(unarioOperador.apply(num)));
        
        return listaActualizada;
    }
    
    public static void main(String[] args) 
    {
        List<Integer> lista = Arrays.asList(
                10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        
        List<Integer> listaAct = operadorUnary(
                num -> num * num, 
                lista);
        
        listaAct.forEach(numeros -> System.out.println("Numero multiplicado : " + numeros));
    }
}

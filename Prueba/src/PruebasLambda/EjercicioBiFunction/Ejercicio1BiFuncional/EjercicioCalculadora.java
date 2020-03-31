package PruebasLambda.EjercicioBiFunction.Ejercicio1BiFuncional;

public class EjercicioCalculadora 
{
    public static void main(String[] args) 
    {
        Calculadora calculadora = new Calculadora();
        
        String resultado = calculadora.calcular((num1, num2) -> ":  " + (num1 * num2), 5, 6);
        
        System.out.println("Resultado es " + resultado);
    }
}

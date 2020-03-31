/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasLambda.EjercicioSupplier;

import java.util.function.Supplier;

/**
 *
 * @author evarillast
 */
public class TestSupplier 
{
    
    public static void main(String[] args) 
    {
        Supplier<String> i = () -> "Anderson";
        
        System.out.println("Referencia Supplier : " + i.get());
    }
}

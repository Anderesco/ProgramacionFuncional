/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author evarillast
 */
public class Prueba1 
{
    public static void main(String[] args) 
    {
        List<Long> lista = new ArrayList<Long>();
        lista.add(Long.parseLong(String.valueOf(-1)));
        
        System.out.println("Lista: " + lista.get(0));
    }
}

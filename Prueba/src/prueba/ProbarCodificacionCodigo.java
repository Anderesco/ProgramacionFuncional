/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import org.apache.commons.lang.StringEscapeUtils;

/**
 *
 * @author evarillast
 */
public class ProbarCodificacionCodigo {    
   
    public static void main(String[] args) 
    {
        /*String afterDecoding = StringEscapeUtils.unescapeHtml("Applying's"); 
        System.out.println(afterDecoding);
        
        String palabra = StringEscapeUtils.unescapeHtml("Applying&#39;s"); 
        System.out.println(palabra);*/
        
        String[] palabras = {"Applying's", "Applying&#39;s", "P &&#38; G", "Impuesto%%&#127;ola", "Numeral#es", "A&#61;gua", "MB%/89#20'&#50;uor66447", 
                             "(gddhj)#%&/( &#91;&#35;", "Añaños", "<>=&#60;&#59;;;/&$", "Ábbb´bíóújjdds"};
        
        for(int i = 0; i< palabras.length; i++)
        { 
            String conversion = StringEscapeUtils.unescapeHtml(palabras[i]);
            System.out.println(conversion);
        }
        
        System.out.println("------------------------------");
        
    }   
}

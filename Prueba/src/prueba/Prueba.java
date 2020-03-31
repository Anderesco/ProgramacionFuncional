/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeUtility;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;
import static java.awt.PageAttributes.MediaType.B3;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.out;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;

/**
 *
 * @author evarillast
 */
public class Prueba {
    
    public void Prueba() throws UnsupportedEncodingException
    {
       // System.out.println(MimeUtility.decode("Applying#39;sñ$%/&/()¿¿¿¿¿¿"), "UTF-8");
        //System.out.println(MimeUtility.decode("Applying#39;s"));
        System.out.println(MimeUtility.encodeText("Applying#39;sñ$%/&/()¿¿¿¿¿¿", "ISO-8859-1", null));
        System.out.println(MimeUtility.decodeText("#39;"));
        
        System.out.println("ñññññññ");
    }
    
    

    public static void main(String[] args) throws UnsupportedEncodingException 
    {
        Prueba p = new Prueba();
       
        int num[] = {65, 120, 98, 75, 115, 39};
        String str =null;
        for(int i: num)
        {
            str = Character.toString((char)i);
            System.out.println(str);
        
        }

        
    }
    
}

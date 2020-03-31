
package prueba;

public class Prueba2 
{
    public static void main(String[] args) 
    {
        int x = 5;
        int y = 5;
    
        y *= x++;
        
        System.out.println(x);
        System.out.println(y);
    }
    
}

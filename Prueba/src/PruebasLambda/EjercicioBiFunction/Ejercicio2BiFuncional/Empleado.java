package PruebasLambda.EjercicioBiFunction.Ejercicio2BiFuncional;

public class Empleado 
{
    String nombre;
    Double monto;

    public Empleado(String nombre, Double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
    
    
}

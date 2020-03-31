package PruebasLambda.EjercicioFunction;

public class Comensal 
{
    String nombre;
    Double monto;
    Integer numeroMesa;

    public Comensal(String nombre, Double monto, Integer numeroMesa) {
        this.nombre = nombre;
        this.monto = monto;
        this.numeroMesa = numeroMesa;
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

    public Integer getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Integer numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    
    
}

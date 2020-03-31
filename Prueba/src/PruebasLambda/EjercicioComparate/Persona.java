package PruebasLambda.EjercicioComparate;

public class Persona implements Comparable<Persona>
{
    Integer id;
    String nombre;
    Integer edad;

    public Persona(Integer id, String nombre, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona o) {
        int resultado = this.nombre.compareTo(o.nombre);
        
        return resultado;
    }

    @Override
    public String toString() {
        return "Persona{" + 
                "id=" +  id + ",\n" + 
                "nombre=" + nombre + ",\n" +
                "edad=" + edad + "\n" +
                '}';
    }

    
}

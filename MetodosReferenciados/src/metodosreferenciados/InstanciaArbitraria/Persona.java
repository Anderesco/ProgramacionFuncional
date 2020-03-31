package metodosreferenciados.InstanciaArbitraria;

public class Persona 
{
    String nombre;
    Integer edad;

    
    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
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
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public static Integer CompararPoredad(Persona persona1, Persona persona2){
        return persona1.getEdad().compareTo(persona2.getEdad());
    }
    public Integer CompararPorEdad2(Persona persona){
        return this.getEdad().compareTo(persona.getEdad());
    }
    
}

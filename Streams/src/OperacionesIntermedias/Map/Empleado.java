package OperacionesIntermedias.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Empleado 
{
    private Long id;
    private String nombre;
    private Double ingreso;
    private Boolean genero;
    private Integer edad;

    public Empleado(Long id, String nombre, Double ingreso, Boolean genero, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.ingreso = ingreso;
        this.genero = genero;
        this.edad = edad;
    }

    public Empleado() {
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getIngreso() {
        return ingreso;
    }

    public void setIngreso(Double ingreso) {
        this.ingreso = ingreso;
    }

    public Boolean getGenero() {
        return genero;
    }

    public void setGenero(Boolean genero) {
        this.genero = genero;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "\nEmpleado{" + 
                "id=" + id + ",\n" +
                "nombre=" + nombre + ",\n" +
                "ingreso=" + ingreso + ",\n" +
                "genero=" + genero + ",\n" +
                "edad=" + edad + "\n" +
                '}';
    }
    
    
    public static List<Empleado> listaEmpleado()
    {
        List<Empleado> listaEmpleado = new ArrayList<>();
        Empleado[] empleados = {
            new Empleado(1L, "Anderson Estela", 300.0, true, 25),
            new Empleado(2L, "Carol Martinez", 350.0, false, 23),
            new Empleado(3L, "Luis Alvarado", 400.0, true, 24),
            new Empleado(4L, "Cristian Estela", 450.0, true, 24),
            new Empleado(5L, "Leslie Minaya", 500.0, false, 30),
            new Empleado(6L, "Liliana Ramirez", 550.0, false, 18),
            new Empleado(7L, "Andrea Luque", 600.0, false, 28),
            new Empleado(8L, "Pedro Garcia", 650.0, true, 35),
            new Empleado(9L, "Maria De La Cruz", 700.0, false, 20),
            new Empleado(10L, "Jose Quispe", 750.0, true, 40)
            };
        
        listaEmpleado.addAll(Arrays.asList(empleados));
        
        return listaEmpleado;
    }
    
}

package PruebasLambda.EjercicioBiPredicate.Complejo;

public class Empleado 
{
    private String nombre;
    private Integer edad;
    private Double salario;
    private String departamento;

    public Empleado(String nombre, Integer edad, Double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" + " \n" +
                "nombre=" + nombre + " ,\n" +
                "edad=" + edad + " ,\n" +
                "salario=" + salario + " ,\n" +
                "departamento=" + departamento + " \n" +
                '}';
    }
    
    
}

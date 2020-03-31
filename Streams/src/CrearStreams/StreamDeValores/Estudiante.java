package CrearStreams.StreamDeValores;

public class Estudiante 
{
    private String DNI;
    private Integer edad;
    private Double altura;
    private Double promedio;

    public Estudiante(String DNI, Integer edad, Double altura, Double promedio) {
        this.DNI = DNI;
        this.edad = edad;
        this.altura = altura;
        this.promedio = promedio;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + 
                "DNI=" + DNI + ",\n " +
                "edad=" + edad + ",\n " +
                "altura=" + altura + ",\n " +
                "promedio=" + promedio + "\n" +
                '}';
    }
    
    
}

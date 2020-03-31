package metodosreferenciados.InstanciaParticular;

public class ProveedorComparaciones 
{
    public Integer CompararPorNombre(Persona persona1, Persona persona2){
        return persona1.getNombre().compareTo(persona2.getNombre());
    }
    
    public Integer CompararPorEdad(Persona persona1, Persona persona2){
        return persona1.getEdad().compareTo(persona2.getEdad());
    }
}

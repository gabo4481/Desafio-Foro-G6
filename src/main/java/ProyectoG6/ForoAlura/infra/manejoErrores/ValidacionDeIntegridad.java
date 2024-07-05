package ProyectoG6.ForoAlura.infra.manejoErrores;

public class ValidacionDeIntegridad extends RuntimeException{
    public ValidacionDeIntegridad(String s) {
        super(s);
    }
}

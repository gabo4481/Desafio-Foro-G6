package ProyectoG6.ForoAlura.topicos.validaciones;

import ProyectoG6.ForoAlura.topicos.DatosRegistroTopicos;
import ProyectoG6.ForoAlura.topicos.DatosRespuestaTopicos;

import java.sql.SQLIntegrityConstraintViolationException;


public interface ValidadorDeTopicos {
    public void validar(DatosRegistroTopicos datos);
}

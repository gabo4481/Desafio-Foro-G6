package ProyectoG6.ForoAlura.topicos;

public record DatosRespuestaTopicos(
        String titulo,
        String mensaje,
        String autor,
        String curso
) {
    public DatosRespuestaTopicos(Topicos datos) {
        this(datos.getTitulo(),datos.getMensaje(), datos.getAutor(), datos.getCurso());
    }
}

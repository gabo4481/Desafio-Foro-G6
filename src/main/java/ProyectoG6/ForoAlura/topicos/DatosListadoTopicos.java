package ProyectoG6.ForoAlura.topicos;

import java.time.LocalDateTime;


public record DatosListadoTopicos(
        String titulo,
        String mensaje,
        LocalDateTime fecha,
        StatusTopico status,
        String autor,
        String curso
) {
    public DatosListadoTopicos(Topicos t) {
        this(t.getTitulo(),t.getMensaje(),t.getFecha(),t.getStatus(),t.getAutor(),t.getCurso());
    }
}

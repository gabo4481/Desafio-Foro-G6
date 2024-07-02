package ProyectoG6.ForoAlura.topicos;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopicos(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String autor,
        @NotBlank
        String curso
) {
}

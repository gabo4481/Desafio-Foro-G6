package ProyectoG6.ForoAlura.usuarios;

import jakarta.validation.constraints.NotBlank;

public record DatosUsuariosAuthenticatios(
        @NotBlank
        String email,
        @NotBlank
        String password
) {
}

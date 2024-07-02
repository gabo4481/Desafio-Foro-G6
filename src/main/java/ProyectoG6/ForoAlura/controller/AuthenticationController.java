package ProyectoG6.ForoAlura.controller;

import ProyectoG6.ForoAlura.infra.security.DatosJWTToken;
import ProyectoG6.ForoAlura.infra.security.TokenService;
import ProyectoG6.ForoAlura.usuarios.DatosUsuariosAuthenticatios;
import ProyectoG6.ForoAlura.usuarios.Usuarios;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    @Transactional
    public ResponseEntity login(@RequestBody @Valid DatosUsuariosAuthenticatios datos){
        Authentication authToken = new UsernamePasswordAuthenticationToken(datos.email(),
                datos.password());
        var usuarioAutenticado = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generarToken((Usuarios) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));

    }
}

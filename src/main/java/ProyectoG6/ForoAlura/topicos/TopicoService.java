package ProyectoG6.ForoAlura.topicos;

import ProyectoG6.ForoAlura.topicos.validaciones.ValidadorDeTopicos;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    @Autowired
    TopicosRepository topicosRepository;

    @Autowired
    List<ValidadorDeTopicos> validadores;

    public Topicos RegistrarTopico(@Valid DatosRegistroTopicos topicos){
    validadores.forEach(v->v.validar(topicos));
    return new Topicos(topicos);



    }


}

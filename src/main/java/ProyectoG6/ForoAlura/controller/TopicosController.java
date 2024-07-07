package ProyectoG6.ForoAlura.controller;

import ProyectoG6.ForoAlura.topicos.*;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicosRepository topicosRepository;

    @Autowired
    private TopicoService topicoService;


    @PostMapping
    @Transactional
    @Operation(summary = "registra un topico en la base de datos")
    public ResponseEntity registrarTopicos(@RequestBody @Valid DatosRegistroTopicos datos, UriComponentsBuilder uriComponentsBuilder) {
        Topicos topico = topicoService.RegistrarTopico(datos);
        DatosRespuestaTopicos datosRespuestaTopicos = new DatosRespuestaTopicos(topico);
        URI uri = uriComponentsBuilder.path("/medicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(datosRespuestaTopicos);
    }

    @PutMapping("/{id}")
    @Transactional
    @Operation(summary = "actualizar un topico en la base de datos")
    public ResponseEntity actualizarTopico(@PathVariable Long id,@RequestBody DatosActualizacionTopico datos) {
        Optional<Topicos> optionalTopico = topicosRepository.findById(id);

        if (optionalTopico.isPresent()) {
            Topicos topicos = topicosRepository.getReferenceById(id);
            topicos.actualizarDatos(datos);
            return ResponseEntity.ok(new DatosRespuestaTopicos(topicos));
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("/{id}")
    @Transactional
    @Operation(summary = "eliminar un topico en la base de datos")
    public ResponseEntity eliminarTopico(@PathVariable Long id) {
        Optional<Topicos> optionalTopico = topicosRepository.findById(id);

        if (optionalTopico.isPresent()) {
            topicosRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    @Transactional
    @Operation(summary = "obtener detaller de un solo topico en la base de datos")
    public ResponseEntity detalleTopico(@PathVariable Long id) {
        Topicos topicos = topicosRepository.getReferenceById(id);
        return ResponseEntity.ok(new DatosRespuestaTopicos(topicos));
    }

    @GetMapping
    @Operation(summary = "Obtiene el listado de topicos")
    public ResponseEntity<Page<DatosListadoTopicos>> listadoTopicos(@PageableDefault(size = 10, sort = "titulo") Pageable paginacion) {
        return ResponseEntity.ok(topicosRepository.findAllByOrderByTituloAsc(paginacion).map(DatosListadoTopicos::new));
    }

}

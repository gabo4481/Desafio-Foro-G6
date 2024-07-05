package ProyectoG6.ForoAlura.topicos;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;

import java.util.Optional;


@Repository
public interface TopicosRepository extends JpaRepository<Topicos, Long> {

    Page<Topicos> findAllByOrderByTituloAsc(Pageable paginacion);

    Optional<Topicos> findByTituloAndMensaje(String titulo, String mensaje);
}

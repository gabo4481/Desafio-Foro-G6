package ProyectoG6.ForoAlura.topicos;

import aj.org.objectweb.asm.commons.Remapper;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;


@Repository
public interface TopicosRepository extends JpaRepository<Topicos, Long> {

    Page<Topicos> findAllByOrderByTituloAsc(Pageable paginacion);
}

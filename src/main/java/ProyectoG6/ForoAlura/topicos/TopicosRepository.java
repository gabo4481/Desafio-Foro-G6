package ProyectoG6.ForoAlura.topicos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicosRepository extends JpaRepository<Topicos, Long> {

}

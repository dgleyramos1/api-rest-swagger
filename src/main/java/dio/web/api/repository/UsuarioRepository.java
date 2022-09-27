package dio.web.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dio.web.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
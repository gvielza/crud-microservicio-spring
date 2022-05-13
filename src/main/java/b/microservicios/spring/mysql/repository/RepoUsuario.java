package b.microservicios.spring.mysql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import b.microservicios.spring.mysql.entity.Usuario;
@Repository
public interface RepoUsuario extends CrudRepository<Usuario, Long> {

}

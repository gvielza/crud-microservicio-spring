package b.microservicios.spring.mysql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import b.microservicios.spring.mysql.entity.Usuario;
import b.microservicios.spring.mysql.repository.RepoUsuario;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UsuarioTest {
	
	@Autowired
	private RepoUsuario repositorio;
	
	
	@Test
	@Rollback(false)
	public void   testAddUser() {
		Usuario usuario= new Usuario("hhh",(long)4564654);
		repositorio.save(usuario);
		
		
	}

	
}
//agreago @AutoConfigureTestDatabase(replace = Replace.NONE) si voy a usar la base de datos real
//y le agrego ademas el rollback(false)

package b.microservicios.spring.mysql.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import b.microservicios.spring.mysql.entity.Usuario;
import b.microservicios.spring.mysql.repository.RepoUsuario;

@RestController
@RequestMapping("/users")
public class UsuarioController {
	
	@Autowired
	private RepoUsuario repository;
	@GetMapping
	private @ResponseBody Iterable<Usuario> findALL(){
		return repository.findAll();
	}
	@GetMapping("/{id}")
	private @ResponseBody Optional<Usuario> findbyId(@PathVariable Long id){
		
		return repository.findById(id);
	}
	
	@PostMapping
	public String addUser(@RequestBody Usuario user) {
		repository.save(user);
		return " Muy bien pelotudo";
	}
	@DeleteMapping("/{id}")
	public @ResponseBody void eliminar(@PathVariable Long id) {
		repository.deleteById(id);
	}
	

}

package com.adamcompany.datajpa.datajpa;

import java.text.SimpleDateFormat;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adamcompany.datajpa.datajpa.entities.Usuario;
import com.adamcompany.datajpa.datajpa.repositories.UsuarioRepository;

@SpringBootApplication
public class DatajpaApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(DatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		usuarioRepository.save(new Usuario("Corelli", sdf.parse("02/05/1950"), "corellitenor@gmail.com", 5.0));
		usuarioRepository.save(new Usuario("Hadley", sdf.parse("03/06/1940"), "hadelytenor@gmail.com", 2.0));
		usuarioRepository.save(new Usuario("Mirella Freni", sdf.parse("08/07/1930"), "mirela@gmail.com", 3.0));
		usuarioRepository.save(new Usuario("Calas", sdf.parse("10/05/1920"), "calas@gmail.com", 4.0));
	 	*/
		
		/*
		Long id = 1L;
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		
		if(usuario.isPresent()) {
			System.out.println(usuario.get());
		} else {
			System.out.printf("Não existe usuário com o id %d%n", id);
		}
		 */		
		
		/*
		Iterable<Usuario> usuarios = usuarioRepository.findAll();
		usuarios.forEach(u -> System.out.println(u.toString()));
		*/
		
		long registros = usuarioRepository.count();
		System.out.println("Quantidade de usuários " + registros);
	
		usuarioRepository.deleteById(1L);
		
		registros = usuarioRepository.count();
		System.out.println("Quantidade de usuários " + registros);
	}
}

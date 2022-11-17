package com.adamcompany.datajpa.datajpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.adamcompany.datajpa.datajpa.entities.Usuario;



public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}

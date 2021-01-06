package com.accenture.desafioApi.repository;

import com.accenture.desafioApi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}

package br.com.vgs.comecando_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vgs.comecando_spring.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}

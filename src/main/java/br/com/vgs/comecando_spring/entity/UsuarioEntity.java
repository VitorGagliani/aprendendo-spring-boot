package br.com.vgs.comecando_spring.entity;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import br.com.vgs.comecando_spring.dto.UsuarioDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ARQUSER")
public class UsuarioEntity {
	
	@Id // define a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // responsavel por gerar id automaticamente
	private Long id;
	
	@Column(nullable = false) //faz com que seja NOT_NULL
	private String nome;
	
	@Column(nullable = false, unique = true) //faz com que seja NOT_NULL e com que seja unico
	private String login;
	
	@Column(nullable = false) //faz com que seja NOT_NULL
	private String senha;
	
	@Column(nullable = false) //faz com que seja NOT_NULL
	private String email;
	
	public UsuarioEntity(UsuarioDTO usuario) {
		BeanUtils.copyProperties(usuario, this);
	}
	
	public UsuarioEntity() {
		
	}
	
	
	
	//getters e setters 
	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	// hash code
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	// equals

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioEntity other = (UsuarioEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	
}

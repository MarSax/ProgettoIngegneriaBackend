package com.example.MuseoBackend.models;

import java.util.Objects;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "Utente")
public class Utente {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;

	@Column(name = "Nome")
	private String nome;

	@Column(name = "Cognome")
	private String cognome;

	@Column(name = "Data_di_nascita")
	private String dataDiNascita;

	@Column(name = "Luogo_di_nascita")
	private String luogoDiNascita;

	@ManyToMany
	private Set<Role> roles;

	@Pattern(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)"
			+ "*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")"
			+ "@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9]"
			+ "[0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\"
			+ "x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
	@Column(name = "Email")
	private String email;

	@Column(name = "Password")
	private String password;

	@Column(name = "Username")
	private String username;

	@OneToOne
	@JoinColumn(name = "Id_museo", referencedColumnName = "Id", nullable = true)
	private Museo museo;
	
	public Utente() {}

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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}

	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Museo getMuseo() {
		return museo;
	}

	public void setMuseo(Museo museo) {
		this.museo = museo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Utente utente = (Utente) o;
		return Objects.equals(id, utente.id) &&
				Objects.equals(nome, utente.nome) &&
				Objects.equals(cognome, utente.cognome) &&
				Objects.equals(dataDiNascita, utente.dataDiNascita) &&
				Objects.equals(luogoDiNascita, utente.luogoDiNascita) &&
				Objects.equals(roles, utente.roles) &&
				Objects.equals(email, utente.email) &&
				Objects.equals(password, utente.password) &&
				Objects.equals(username, utente.username) &&
				Objects.equals(museo, utente.museo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, cognome, dataDiNascita, luogoDiNascita, roles, email, password, username, museo);
	}
}

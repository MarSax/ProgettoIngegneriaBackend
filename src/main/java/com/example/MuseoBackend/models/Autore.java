package com.example.MuseoBackend.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Autore")
public class Autore {

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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autore")
	private Set<Opera> opere = new HashSet<>();
	
	public Autore() { }

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

	public Set<Opera> getOpere() {
		return opere;
	}

	public void setOpere(Set<Opera> opere) {
		this.opere = opere;
	}

}

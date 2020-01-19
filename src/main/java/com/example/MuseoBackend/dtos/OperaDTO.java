package com.example.MuseoBackend.dtos;

public class OperaDTO {

	private String nome;

	private AutoreDTO autore;

	private MuseoDTO museo;

	private String descrizioneBreve;
	
	private String descrizioneLunga;

	public OperaDTO() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public AutoreDTO getAutore() {
		return autore;
	}

	public void setAutore(AutoreDTO autore) {
		this.autore = autore;
	}

	public String getDescrizioneBreve() {
		return descrizioneBreve;
	}

	public void setDescrizioneBreve(String descrizioneBreve) {
		this.descrizioneBreve = descrizioneBreve;
	}

	public String getDescrizioneLunga() {
		return descrizioneLunga;
	}

	public void setDescrizioneLunga(String descrizioneLunga) {
		this.descrizioneLunga = descrizioneLunga;
	}

	public MuseoDTO getMuseo() {
		return museo;
	}

	public void setMuseo(MuseoDTO museo) {
		this.museo = museo;
	}

}

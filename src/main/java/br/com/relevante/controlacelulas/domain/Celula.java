package br.com.relevante.controlacelulas.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Celula extends GenericDomain {
	@Column(length = 50, nullable = false)
	private String nome;	
	
	@Column(length = 100, nullable = false)
	private String endereco;
	
	@Column(length = 100, nullable = false)
	private String numero;
	
	@Column(length = 30, nullable = false)
	private String bairro;
	
	@Column(length = 10, nullable = false)
	private String cep;	
	
	@Column(length = 10, nullable = false)
	private String complemento;	
	
	@Temporal(TemporalType.DATE)
	private Date dataReuniao;	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}	
	
	public Date getDataReuniao() {
		return dataReuniao;
	}

	public void setDataReuniao(Date dataReuniao) {
		this.dataReuniao = dataReuniao;
	}
	
}

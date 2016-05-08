package br.com.relevante.controlacelulas.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericDomain {
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 14, nullable = false)
	private String cpf;
	
	//@Column(nullable = false)
	//@Temporal(TemporalType.DATE)
	//private Date nascimento;	
	
	@Column(length = 100, nullable = false)
	private String endereco;
	
	@Column(nullable = false)
	private Short numero;
	
	@Column(length = 30, nullable = false)
	private String bairro;
	
	@Column(length = 10, nullable = false)
	private String cep;	
	
	@Column(length = 10)
	private String complemento;
	
	@Column(length = 13, nullable = false)
	private String telefone;

	@Column(length = 14, nullable = false)
	private String celular;
	
	@Column(length = 100, nullable = false)
	private String email;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Cidade cidade;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Celula celula;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Tipo tipo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Short getNumero() {
		return numero;
	}

	public void setNumero(Short numero) {
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Celula getCelula() {
		return celula;
	}

	public void setCelula(Celula celula) {
		this.celula = celula;
	}
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
}

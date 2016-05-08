package br.com.relevante.controlacelulas.dao;


import org.junit.Test;

import br.com.relevante.controlacelulas.domain.Celula;
import br.com.relevante.controlacelulas.domain.Cidade;
import br.com.relevante.controlacelulas.domain.Pessoa;

public class PessoaDAOTest {

	@Test	
	public void salvar(){
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(new Long("1"));
		
		CelulaDAO celulaDAO = new CelulaDAO();
		Celula celula = celulaDAO.buscar(new Long("1"));
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Jose Carlos");
		pessoa.setCpf("360.083.018-03");
		//pessoa.setNascimento(null);
		pessoa.setEndereco("Rua 12");
		pessoa.setNumero(new Short("3002"));
		pessoa.setBairro("Centro");
		pessoa.setCep("15763-000");
		pessoa.setCidade(cidade);
		pessoa.setComplemento("Ap");
		pessoa.setTelefone("17-997268467");
		pessoa.setCelular("17-997268467");
		pessoa.setEmail("jrnin@hotmail.com");
		pessoa.setCelula(celula);		
		
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
		
		System.out.println("Pessoa salva com sucesso");
	}
}

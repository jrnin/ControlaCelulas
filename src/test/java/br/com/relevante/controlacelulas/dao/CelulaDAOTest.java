package br.com.relevante.controlacelulas.dao;


import org.junit.Ignore;
import org.junit.Test;

import br.com.relevante.controlacelulas.domain.Celula;


public class CelulaDAOTest {

	@Test	
	@Ignore
	public void salvar(){		
		
		Celula celula = new Celula();
		celula.setNome("Gaditas");
		celula.setEndereco("Avenida Brasil");
		celula.setNumero("294");
		celula.setBairro("centro");
		celula.setComplemento("casa");
		celula.setCep("15700000");					
		
		CelulaDAO celulaDAO = new CelulaDAO();
		celulaDAO.salvar(celula);
		
		System.out.println("Celula salva com sucesso");
	}
}

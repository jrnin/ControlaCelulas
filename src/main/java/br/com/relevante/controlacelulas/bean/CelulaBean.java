package br.com.relevante.controlacelulas.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import org.omnifaces.util.Messages;

import br.com.relevante.controlacelulas.domain.Celula;
import br.com.relevante.controlacelulas.dao.CelulaDAO;


@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class CelulaBean implements Serializable {
	private Celula celula;
	private List<Celula> celulas;
	
	public Celula getCelula() {
		return celula;
	}
	
	public void setCelula(Celula celula) {
		this.celula = celula;
	}
	
	public List<Celula> getCelulas() {
		return celulas;
	}
	
	public void setCelulas(List<Celula> celulas) {
		this.celulas = celulas;
	}
	
	@PostConstruct
	public void listar(){
		try{
			CelulaDAO celulaDAO = new CelulaDAO();
			celulas = celulaDAO.listar("dataReuniao");
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar listar as celulas");
			erro.printStackTrace();
		}
	}

	public void novo() {
		celula = new Celula();
	}

	public void salvar() {
		try {
			CelulaDAO celulaDAO = new CelulaDAO();
			celulaDAO.merge(celula);

			celula = new Celula();
			celulas = celulaDAO.listar("dataReuniao");

			Messages.addGlobalInfo("Celula salva com sucesso");
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar salvar a celula");
			erro.printStackTrace();
		}
	}
	
	public void excluir(ActionEvent evento) {
		try {
			celula = (Celula) evento.getComponent().getAttributes().get("celulaSelecionada");

			CelulaDAO celulaDAO = new CelulaDAO();
			celulaDAO.excluir(celula);
			
			celulas = celulaDAO.listar();

			Messages.addGlobalInfo("Celula removida com sucesso");
		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Ocorreu um erro ao tentar remover a celula");
			erro.printStackTrace();
		}
	}
	
	public void editar(ActionEvent evento){
		celula = (Celula) evento.getComponent().getAttributes().get("celulaSelecionada");
	}
}

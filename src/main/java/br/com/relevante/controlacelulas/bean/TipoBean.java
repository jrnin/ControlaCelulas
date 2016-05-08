package br.com.relevante.controlacelulas.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.com.relevante.controlacelulas.dao.TipoDAO;
import br.com.relevante.controlacelulas.domain.Tipo;


@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class TipoBean implements Serializable {
	private Tipo tipo;
	private List<Tipo> tipos;
	

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public List<Tipo> getTipos() {
		return tipos;
	}

	public void setTipos(List<Tipo> tipos) {
		this.tipos = tipos;
	}
	
	@PostConstruct
	public void listar() {
		try {
			TipoDAO tipoDAO = new TipoDAO();
			tipos = tipoDAO.listar("nome");
		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Ocorreu um erro ao tentar listar os tipos");
			erro.printStackTrace();
		}
	}

	public void novo() {		
			tipo = new Tipo();		
		
	}

	public void salvar() {
		try {
			TipoDAO tipoDAO = new TipoDAO();
			tipoDAO.merge(tipo);

			tipo = new Tipo();
			
			tipos = tipoDAO.listar();

			Messages.addGlobalInfo("Tipo salvo com sucesso");
		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Ocorreu um erro ao tentar salvar um novo tipo");
			erro.printStackTrace();
		}
	}

	public void excluir(ActionEvent evento) {
		try {
			tipo = (Tipo) evento.getComponent().getAttributes().get("tipoSelecionado");

			TipoDAO tipoDAO = new TipoDAO();
			tipoDAO.excluir(tipo);

			tipos = tipoDAO.listar("nome");

			Messages.addGlobalInfo("Tipo removido com sucesso");
		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Ocorreu um erro ao tentar remover o tipo");
			erro.printStackTrace();
		}
	}
	
	public void editar(ActionEvent evento){		
			tipo = (Tipo) evento.getComponent().getAttributes().get("tipoSelecionado");	
		
	}
}

package br.com.relevante.controlacelulas.main;

import org.hibernate.Session;

import br.com.relevante.controlacelulas.util.HibernateUtil;

public class HibernateUtilTest {
	public static void main(String[] args) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}
}

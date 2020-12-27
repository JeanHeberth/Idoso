package br.com.clinica.test;

import java.util.ArrayList;

import br.com.clinica.dao.ServicosDao;
import br.com.clinica.domain.Servicos;

public class Listar {

	public static void main(String[] args) {

		try {

			ServicosDao dao = new ServicosDao();
			ArrayList<Servicos> lista = dao.listar();
			for (Servicos s : lista) {
				System.out.println("Resultado: " + s);
			}
		} catch (Exception e) {
			System.err.println("ERRO");
			e.printStackTrace();
		}

	}

}

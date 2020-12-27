package br.com.clinica.test;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import br.com.clinica.dao.ServicosDao;
import br.com.clinica.domain.Servicos;

public class ServicosDaoTeste {

	@Test
	public void listar() throws SQLException {
		ServicosDao dao = new ServicosDao();

		ArrayList<Servicos> lista = dao.listar();

		for (Servicos s : lista) {
			System.out.println("Horário" + s.getHorario());
			System.out.println("Observações" + s.getObservacoes());
			System.out.println("Nome da Contratanre" + s.getPaciente().getNomeResponsavel());
			System.out.println("Nome da Contratanre" + s.getPaciente().getNomePaciente());
			System.out.println("Nome da Contratanre" + s.getCuidador().getNome());

		}

	}

}

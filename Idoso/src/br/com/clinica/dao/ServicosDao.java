/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.clinica.domain.Cuidador;
import br.com.clinica.domain.Paciente;
import br.com.clinica.domain.Servicos;
import br.com.clinica.factory.Conexao;

/**
 *
 * @author Jean Heberth
 */
public class ServicosDao {

	public void editar(Paciente paciente) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE paciente ");
		sql.append("SET nome_paciente = ?, telefone = ?, email  = ? ");
		sql.append("WHERE nome_responsavel = ? ");

		Connection conexao = Conexao.conectar();
		PreparedStatement comando = conexao.prepareStatement(sql.toString());

		comando.setString(1, paciente.getNomePaciente().trim());
		comando.setString(2, paciente.getTelefone().trim());
		comando.setString(3, paciente.getEmail().trim());
             	comando.executeUpdate();
	}

	public ArrayList<Servicos> listar() throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("select s.horario, s.observacoes, c.nome, p.nome_responsavel, p.nome_paciente ");
		sql.append("from servicos s ");
		sql.append("inner join paciente p on  s.cpf_paciente = p.cpf ");
		sql.append("inner join cuidador c on s.cpf_cuidador = c.cpf ");

		Connection conexao = Conexao.conectar();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());

		ResultSet resultado = comando.executeQuery();

		ArrayList<Servicos> itens = new ArrayList<Servicos>();
		while (resultado.next()) {

			Cuidador c = new Cuidador();
			c.setNome(resultado.getString("c.nome"));

			Paciente p = new Paciente();
			p.setNomeResponsavel(resultado.getString("p.nome_responsavel"));
			p.setNomePaciente(resultado.getString("p.nome_paciente"));

			Servicos s = new Servicos();

			s.setHorario(resultado.getString("s.horario"));
			s.setObservacoes(resultado.getString("s.observacoes"));
			s.setCuidador(c);
			s.setPaciente(p);
			itens.add(s);
		}

		return itens;
	}
        
        public void excluir(){
            
        }

}

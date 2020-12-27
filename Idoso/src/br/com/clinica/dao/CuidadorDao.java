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
import br.com.clinica.factory.Conexao;

/**
 *
 * @author Jean Heberth
 */
public class CuidadorDao {

    public void salvar(Cuidador cuidador) throws SQLException {

        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO CUIDADOR (cpf, nome, telefone, email, cursos ) values (?, ? , ?, ?, ?)");
        Connection conexao = Conexao.conectar();

        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        comando.setString(1, cuidador.getCpf());
        comando.setString(2, cuidador.getNome());
        comando.setString(3, cuidador.getTelefone());
        comando.setString(4, cuidador.getEmail());
        comando.setString(5, cuidador.getCursos());
        comando.executeUpdate();
    }

    public void excluir(Cuidador cuidador) throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE from cuidador WHERE cpf = ?");

        Connection conexao = Conexao.conectar();

        PreparedStatement comando = conexao.prepareCall(sql.toString());
        comando.setString(1, cuidador.getCpf());
        comando.executeUpdate();

    }
    
       /*
	 * 
	 * ######## Metodo para editar cliente no BD
	 * drogaria ################
	 * 
     */

    public void editar(Cuidador cuidador) throws SQLException {

        StringBuilder sql = new StringBuilder();

        sql.append("UPDATE cuidador SET nome = ?, telefone = ?, email = ?, cursos = ? WHERE cpf = ? ");

        Connection conexao = Conexao.conectar();

        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        comando.setString(1, cuidador.getNome());
        comando.setString(2, cuidador.getTelefone());
        comando.setString(3, cuidador.getEmail());
        comando.setString(4, cuidador.getCursos());
        comando.setString(5, cuidador.getCpf());

        comando.executeUpdate();
    }

    public Cuidador buscarPorCpf(Cuidador cuidador) throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT cpf, nome, telefone, email, cursos FROM cuidador WHERE cpf = ? ");

        Connection conexao = Conexao.conectar();
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        comando.setString(1, cuidador.getCpf());

        ResultSet resultado = comando.executeQuery();

        Cuidador retornoCuidador = null;

        if (resultado.next()) {

            retornoCuidador = new Cuidador();
            retornoCuidador.setCpf(resultado.getString("Cpf"));
            retornoCuidador.setNome(resultado.getString("Nome"));
            retornoCuidador.setTelefone(resultado.getString("Telefone"));
            retornoCuidador.setEmail(resultado.getString("Email"));
            retornoCuidador.setCursos(resultado.getString("Cursos"));
        }

        return retornoCuidador;
    }

    /*
	 * 
	 * ######## Metodo para buscar para listar cliente no BD
	 * drogaria ################
	 * 
     */
    public ArrayList<Cuidador> listar() throws SQLException {

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT cpf, nome, telefone, email, cursos FROM cuidador ORDER BY nome DESC ");

        Connection conexao = Conexao.conectar();

        PreparedStatement comando = conexao.prepareCall(sql.toString());
        ResultSet resultado = comando.executeQuery();

        ArrayList<Cuidador> listaCuidador = new ArrayList<Cuidador>();
        while (resultado.next()) {
            Cuidador cuidaDao = new Cuidador();
            cuidaDao.setCpf(resultado.getString("CPF"));
            cuidaDao.setNome(resultado.getString("Nome"));
            cuidaDao.setTelefone(resultado.getString("Telefone"));
            cuidaDao.setEmail(resultado.getString("Email"));
            cuidaDao.setCursos(resultado.getString("Cursos"));

            listaCuidador.add(cuidaDao);
        }
        return listaCuidador;
    }

    /*
	 * ######## Metodo para buscar por DescriÃƒÂ§ÃƒÂ£o lista Crescente cliente no BD
	 * drogaria ################
	 * 
	 * 
     */
    public ArrayList<Cuidador> buscaPorDescricao(Cuidador cuidador) throws SQLException {

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT cpf, nome, telefone, email, cursos FROM cuidador WHERE nome LIKE ? ");
        sql.append("ORDER BY nome ASC ");

        Connection conexao = Conexao.conectar();
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        comando.setString(1, "%" + cuidador.getNome()+ "%");

       ResultSet resultado = comando.executeQuery();

        ArrayList<Cuidador> lista = new ArrayList<Cuidador>();

        while (resultado.next()) {
            Cuidador itemCuidador = new Cuidador();
            itemCuidador.setCpf(resultado.getString("cpf"));
            itemCuidador.setNome(resultado.getString("nome"));
            itemCuidador.setTelefone(resultado.getString("telefone"));
            itemCuidador.setEmail(resultado.getString("email"));
            itemCuidador.setCursos(resultado.getString("cursos"));

            lista.add(itemCuidador);
        }
        return lista;

    }

}

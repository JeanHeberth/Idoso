/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jean Heberth
 */
public class Conexao {

    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String URL = "jdbc:mysql://localhost:3306/clinica?useTimezone=true&serverTimezone=UTC";

    public static Connection conectar() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        return conexao;
    }

    public static void main(String[] args) {
        try {
            Connection conexao = Conexao.conectar();
            System.out.println("Conexao realizada com sucesso!");
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao tentar conectar!");
            
        }

    }
}

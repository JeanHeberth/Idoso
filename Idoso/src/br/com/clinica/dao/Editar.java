/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.dao;

import br.com.clinica.domain.Cuidador;

/**
 *
 * @author Jean Heberth
 */
public class Editar {

    public static void main(String[] args) {

        Cuidador cuida = new Cuidador();
        cuida.setCpf("123.456.789-10");
        cuida.setNome("Jean Heberth");
        cuida.setTelefone("61-992062328");
        cuida.setEmail("jean@gmail.com");
        cuida.setCursos("JAVA");

        CuidadorDao cuidaDao = new CuidadorDao();

        try {
            cuidaDao.editar(cuida);
            System.out.println("Editado com sucesso");
        } catch (Exception e) {
            System.out.println("Falha ao editar");
            e.printStackTrace();
        }
    }
}

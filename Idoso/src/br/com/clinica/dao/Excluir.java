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
public class Excluir {

    public static void main(String[] args) {
        Cuidador cuida1 = new Cuidador();
        cuida1.setCpf("12345678910");

        CuidadorDao cuidaDao = new CuidadorDao();
        try {
            cuidaDao.excluir(cuida1);
            System.out.println("Excluido com sucesso!");
        } catch (Exception e) {
            System.out.println("Falha o excluir");
            e.printStackTrace();
        }

    }

}

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
public class Salvar {
    
    public static void main(String[] args) {
        Cuidador cuida1 = new Cuidador();
        cuida1.setCpf("123.456.789-10");
        cuida1.setNome("Josefina Alves");
        cuida1.setTelefone("99-9999.9999");
        cuida1.setEmail("josefina@gmail.com");
        cuida1.setCursos("Ressucitação Avançada");
        
        CuidadorDao cuidaDao = new CuidadorDao();
        try {
            cuidaDao.salvar(cuida1);
            System.out.println("Salvo com sucesso!");
        } catch (Exception e) {
            System.out.println("Falha ao salvar no banco!");
            e.printStackTrace();
        }
    }
    
}

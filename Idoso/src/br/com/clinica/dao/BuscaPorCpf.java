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
public class BuscaPorCpf {
    
    public static void main(String[] args) {
        
        Cuidador cuida = new Cuidador();
        cuida.setCpf("12345678910");
        
        CuidadorDao cuidaDao = new CuidadorDao();
        try {
            Cuidador cuida1 = cuidaDao.buscarPorCpf(cuida);
            System.out.println("Cliente 1: -----:" +cuida1);
        } catch (Exception e) {
            System.out.println("Erro ao tentar buscar");
        }
    }
    
}

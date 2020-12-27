/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.dao;

import java.util.ArrayList;

import br.com.clinica.domain.Cuidador;

/**
 *
 * @author Jean Heberth
 */
public class BuscaporDescricao {
    
    public static void main(String[] args) {
        Cuidador cuida1 = new Cuidador();
        cuida1.setNome("a");
        
        CuidadorDao cuidaDao = new CuidadorDao();
        
       
        try {
            ArrayList<Cuidador> listaCuidador = cuidaDao.buscaPorDescricao(cuida1);
            for(Cuidador c : listaCuidador){
                System.out.println("Resultado: " +c);
            }
        } catch (Exception e) {
            System.out.println("Falha ao buscar cliente");
            e.printStackTrace();
        }
        
        
    }
}

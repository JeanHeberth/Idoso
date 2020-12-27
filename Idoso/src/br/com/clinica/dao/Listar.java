/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.dao;

import br.com.clinica.domain.Cuidador;

import java.util.ArrayList;

/**
 *
 * @author Jean Heberth
 */
public class Listar {
    
    public static void main(String[] args) {
        try {
            CuidadorDao cuidaDao = new CuidadorDao();
            ArrayList<Cuidador> lista = cuidaDao.listar();
            for (Cuidador cuida : lista){
                System.out.println("Resultado "+cuida);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar");
            e.printStackTrace();
        }
    }
    
}

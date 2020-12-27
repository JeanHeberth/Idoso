/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.bean;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;

import br.com.clinica.dao.CuidadorDao;
import br.com.clinica.domain.Cuidador;

/**
 *
 * @author Jean Heberth
 */
@ManagedBean(name = "MBCuidador")
@ViewScoped
public class CuidadorBean {

    private ListDataModel<Cuidador> itensCuidadores;

    public ListDataModel<Cuidador> getItensCuidadores() {
        return itensCuidadores;
    }

    public void setItensCuidadores(ListDataModel<Cuidador> itensCuidadores) {
        this.itensCuidadores = itensCuidadores;
    }

    @PostConstruct
    public void preparPesquisa() {
        try {
            CuidadorDao cuidaDao = new CuidadorDao();
            ArrayList<Cuidador> listaCuidadores = cuidaDao.listar();
            itensCuidadores = new ListDataModel<Cuidador>(listaCuidadores);
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

}

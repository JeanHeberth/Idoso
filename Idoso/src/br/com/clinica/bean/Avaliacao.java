/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Jean Heberth
 */
@ManagedBean(name = "AvaliacaoMB")
@RequestScoped
public class Avaliacao {

    private Integer avaliacao = 5;
    private Integer avaliacao1 = 3;
    private Integer avaliacao2 = 1;

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Integer getAvaliacao1() {
        return avaliacao1;
    }

    public void setAvaliacao1(Integer avaliacao1) {
        this.avaliacao1 = avaliacao1;
    }

    public Integer getAvaliacao2() {
        return avaliacao2;
    }

    public void setAvaliacao2(Integer avaliacao2) {
        this.avaliacao2 = avaliacao2;
    }

}

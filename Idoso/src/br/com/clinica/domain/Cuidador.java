/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.domain;

/**
 *
 * @author Jean Heberth
 */
public class Cuidador {
    
    private String cpf;
    private String Nome;
    private String telefone;
    private String email;
    private String cursos;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        String saida = cpf + " - " +Nome+ " - " +telefone+ " - " +email+ " - " +cursos; 
        return saida;
    }
    
    
    
}

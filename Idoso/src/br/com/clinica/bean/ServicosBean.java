package br.com.clinica.bean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.clinica.dao.ServicosDao;
import br.com.clinica.domain.Cuidador;
import br.com.clinica.domain.Paciente;
import br.com.clinica.domain.Servicos;
import javax.annotation.PostConstruct;

@ManagedBean(name = "MBServicos")
@ViewScoped
public class ServicosBean {

    private Cuidador cuidador;
    private Paciente paciente;
    private ArrayList<Servicos> servicos;
    private ArrayList<Servicos> servicosFiltrados;

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ArrayList<Servicos> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servicos> servicos) {
        this.servicos = servicos;
    }

    public ArrayList<Servicos> getServicosFiltrados() {
        return servicosFiltrados;
    }

    public void setServicosFiltrados(ArrayList<Servicos> servicosFiltrados) {
        this.servicosFiltrados = servicosFiltrados;
    }

    /* Ação para carregar listagem */
    @PostConstruct
    public void carregarListagem() {
        try {
            ServicosDao servDao = new ServicosDao();
            servicos = servDao.listar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void prepararNovo() {

        paciente = new Paciente();
    }

    public void editar() {
        try {
            ServicosDao servDao = new ServicosDao();
            servicos = servDao.listar();
            System.out.println("Editado com sucesso!");
        } catch (Exception e) {
            System.out.println("Falha ao editar");
            e.printStackTrace();
        }
    }
}

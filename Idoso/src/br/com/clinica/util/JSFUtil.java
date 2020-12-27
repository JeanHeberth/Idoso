package br.com.clinica.util;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MBmensagem")
@ViewScoped
public class JSFUtil {
	
	public void salvar() {
        FacesMessage message = new FacesMessage("Salvo com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, message);
            }
    public void editar() {
        FacesMessage message = new FacesMessage("Editado com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
     public void excluir() {
        FacesMessage message = new FacesMessage("Excluido com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, message);
        
    }
    
     public void cancelar() {
        FacesMessage message = new FacesMessage("Cancelado com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, message);
        
    }
}

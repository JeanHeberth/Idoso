
package br.com.clinica.domain;

public class Servicos {

	private String horario;
	private String observacoes;

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	private Cuidador cuidador = new Cuidador();

	public Cuidador getCuidador() {
		return cuidador;
	}

	public void setCuidador(Cuidador cuidador) {
		this.cuidador = cuidador;
	}

	private Paciente paciente = new Paciente();

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	 @Override
	    public String toString() {
	        String saida = horario + " - " +observacoes+ " - " +cuidador.getNome()+ " - " +paciente.getNomeResponsavel()+ " - " +paciente.getNomePaciente(); 
	        return saida;
	    }
	    

}

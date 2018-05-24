package feevale.attendance;

import java.util.Calendar;

public class Attendance {
	/**
	 *         A classe Attendance eh responsavel por criar um 
	 *     novo atendimento, onde devem ser informados todos 
	 *     os dados referentes ao atendimento.
	 *     
	 *         A simulacao acontece com o conjunto de 
	 *     atendimentos que foram coletados.
	 *     
	**/
	
	public String nomeColaborador;
	public String problemaAtendido;
	public Calendar dataInicioAtendimento;
	public Calendar dataFimAtendimento;
	public Calendar horaInicioAtendimento;
	public Calendar horaFimAtendimento;
	public Calendar tempoTotalAtendimento;
	public Boolean problemaResolvido;
	
	public String getNomeColaborador() {
		return nomeColaborador;
	}
	public void setNomeColaborador(String nomeColaborador) {
		this.nomeColaborador = nomeColaborador;
	}
	
	public String getProblemaAtendido() {
		return problemaAtendido;
	}
	public void setProblemaAtendido(String problemaAtendido) {
		this.problemaAtendido = problemaAtendido;
	}
	
	public Calendar getDataInicioAtendimento() {
		return dataInicioAtendimento;
	}
	public void setDataInicioAtendimento(Calendar dataInicioAtendimento) {
		this.dataInicioAtendimento = dataInicioAtendimento;
	}
	
	public Calendar getDataFimAtendimento() {
		return dataFimAtendimento;
	}
	public void setDataFimAtendimento(Calendar dataFimAtendimento) {
		this.dataFimAtendimento = dataFimAtendimento;
	}
	
	public Calendar getHoraInicioAtendimento() {
		return horaInicioAtendimento;
	}
	public void setHoraInicioAtendimento(Calendar horaInicioAtendimento) {
		this.horaInicioAtendimento = horaInicioAtendimento;
	}
	
	public Calendar getHoraFimAtendimento() {
		return horaFimAtendimento;
	}
	public void setHoraFimAtendimento(Calendar horaFimAtendimento) {
		this.horaFimAtendimento = horaFimAtendimento;
	}
	
	public Calendar getTempoTotalAtendimento() {
		return tempoTotalAtendimento;
	}
	public void setTempoTotalAtendimento(Calendar tempoTotalAtendimento) {
		this.tempoTotalAtendimento = tempoTotalAtendimento;
	}
	
	public Boolean getProblemaResolvido() {
		return problemaResolvido;
	}
	public void setProblemaResolvido(Boolean problemaResolvido) {
		this.problemaResolvido = problemaResolvido;
	}
	
}

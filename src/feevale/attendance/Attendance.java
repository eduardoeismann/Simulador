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
	
	private String problemaAtendido;
	private String categoria;
	private Integer prioridade;
	private Calendar dataInicioAtendimento;
	private Calendar dataFimAtendimento;
	private Calendar horaInicioAtendimento;
	private Calendar horaFimAtendimento;
	private Calendar horaRecebido;
	private String nomeColaborador;
	private Boolean fila;
	private Calendar tempoTotalAtendimento;
	private Boolean problemaResolvido;
	
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	public Calendar getHoraRecebido() {
		return horaRecebido;
	}

	public void setHoraRecebido(Calendar horaRecebido) {
		this.horaRecebido = horaRecebido;
	}

	public Boolean getFila() {
		return fila;
	}

	public void setFila(Boolean fila) {
		this.fila = fila;
	}
	
}

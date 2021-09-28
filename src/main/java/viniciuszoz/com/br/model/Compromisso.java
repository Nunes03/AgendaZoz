package viniciuszoz.com.br.model;

import java.time.LocalTime;

public class Compromisso {
	private LocalTime hora;
	private String descricao;
	private Integer tempo;
	private Character prioridade;
	
	public Compromisso(LocalTime hora, String descricao, Integer tempo, Character prioridade) {
		this.hora = hora;
		this.descricao = descricao;
		this.tempo = tempo;
		this.prioridade = prioridade;
	}
	
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Integer getTempo() {
		return tempo;
	}
	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}
	
	public Character getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(Character prioridade) {
		this.prioridade = prioridade;
	}
	
	
}

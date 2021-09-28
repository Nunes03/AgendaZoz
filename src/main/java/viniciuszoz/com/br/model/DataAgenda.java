package viniciuszoz.com.br.model;

import java.time.LocalDate;
import java.util.List;

public class DataAgenda {
	private LocalDate data;
	private String enfermidade;
	private List<Compromisso> compromissos;
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public String getEnfermidade() {
		return enfermidade;
	}
	public void setEnfermidade(String enfermidade) {
		this.enfermidade = enfermidade;
	}
	
	public List<Compromisso> getCompromissos() {
		return compromissos;
	}
	public void setCompromissos(List<Compromisso> compromissos) {
		this.compromissos = compromissos;
	}
	
	
}
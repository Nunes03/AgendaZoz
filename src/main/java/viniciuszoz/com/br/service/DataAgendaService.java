package viniciuszoz.com.br.service;

import java.util.ArrayList;
import java.util.List;

import viniciuszoz.com.br.model.Compromisso;
import viniciuszoz.com.br.model.DataAgenda;

public class DataAgendaService {
	
	private DataAgenda dataAgenda;
	
	public DataAgendaService(DataAgenda dataAgenda) {
		this.dataAgenda = dataAgenda;
	}
	
	public Integer tempoMedio() {
		return 0;
	}
	
	public void addCompromisso(Compromisso compromisso) {
		dataAgenda.getCompromissos().add(compromisso);
	}
	
	public List<Compromisso> getCompromissosPrioridade(Character prioridade) {
		ArrayList<Compromisso> compromissos = new ArrayList<Compromisso>();
		for(Compromisso compromisso : dataAgenda.getCompromissos()) {
			if(compromisso.getPrioridade().equals(prioridade)) {
				compromissos.add(compromisso);
			}
		}
		return compromissos;
	}
	
	public Integer getQtdCompromissosPrioridade(Character prioridade) {
		return getCompromissosPrioridade(prioridade).size();
	}
}
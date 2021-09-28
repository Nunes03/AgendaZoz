package viniciuszoz.com.br.service;

import viniciuszoz.com.br.model.Agenda;
import viniciuszoz.com.br.model.Compromisso;
import viniciuszoz.com.br.model.DataAgenda;

public class AgendaService {
	
	private Agenda agenda;
	
	public AgendaService(Agenda agenda) {
		this.agenda = agenda;
	}

	public void addDataAgenda(DataAgenda dataAgenda) {
		agenda.getDatasAgenda().add(dataAgenda);
	}
	
	public Compromisso getMenorCompromisso() {
		Compromisso menorCompromisso = null;
		Integer tempo = 999999999;
		for(DataAgenda dataAgenda : agenda.getDatasAgenda()) {
			for(Compromisso compromisso : dataAgenda.getCompromissos()) {
				if(compromisso.getTempo() < tempo) {
					tempo = compromisso.getTempo();
					menorCompromisso = compromisso;
				}
			}
		}
		return menorCompromisso;
	}
}

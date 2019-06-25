package agenda;

import java.util.*;

public class Agenda {
	
	private ItemAgenda itemAgenda;
	private Evento eventos;
	private Meta metas;
	private Lembrete lembretes;
	
	List<ItemAgenda> agenda = new LinkedList<ItemAgenda>();
	
	public void adicionaItemAgenda() {
		agenda.add(itemAgenda);
	}
	
	
	
	////gets e sets
	public Evento getEventos() {
		return eventos;
	}

	public void setEventos(Evento eventos) {
		this.eventos = eventos;
	}

	public Meta getMetas() {
		return metas;
	}

	public void setMetas(Meta metas) {
		this.metas = metas;
	}

	public Lembrete getLembretes() {
		return lembretes;
	}

	public void setLembretes(Lembrete lembretes) {
		this.lembretes = lembretes;
	}

	public List<ItemAgenda> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<ItemAgenda> agenda) {
		this.agenda = agenda;
	}
	
	
}

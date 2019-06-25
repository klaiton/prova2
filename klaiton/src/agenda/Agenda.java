package agenda;

import java.util.*;

public class Agenda {
	
	Agenda(){
	}
	
	Agenda(List<Evento> eventos){
		this.setEventos(eventos);
	}
	
	Agenda(List<Evento> eventos,List<Meta> metas){
		this.setEventos(eventos);
		this.setMetas(metas);
	}
	
	Agenda(List<Evento> eventos,List<Meta> metas,List<Lembrete> lembretes){
		this.setEventos(eventos);
		this.setMetas(metas);
		this.setLembretes(lembretes);
		
	}
	
	List<Evento> eventos = new LinkedList<Evento>();
	List<Meta> metas = new LinkedList<Meta>();
	List<Lembrete> lembretes = new LinkedList<Lembrete>();
	
	
	
	public void insereEvento(String local) {
		eventos.add(new Evento(local));
	}
	
	public void insereMeta(int prioridade) {
		metas.add(new Meta(prioridade));
	}
	
	public void insereLembrete(int minutos, String alerta) {
		lembretes.add(new Lembrete(minutos, alerta));
	}
	
	
///	public void ordenaItens() 
	public void ordenaPorEvento() {
		Collections.sort(eventos);
		}

	public void ordenaPorPrioridade() {
		Collections.sort(metas);
	}
	
	public void ordenaPorAntecedencia() {
		Collections.sort(lembretes);
	}
	
	public void ordenaPorIntervaloDatas() {
		
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public List<Meta> getMetas() {
		return metas;
	}

	public void setMetas(List<Meta> metas) {
		this.metas = metas;
	}

	public List<Lembrete> getLembretes() {
		return lembretes;
	}

	public void setLembretes(List<Lembrete> lembretes) {
		this.lembretes = lembretes;
	}
	

}

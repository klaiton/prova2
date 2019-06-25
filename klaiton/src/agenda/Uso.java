package agenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author klaiton
 *
 */
public class Uso {
	
	public static void main(String[] args) {
			
			List<Evento> eventos = new LinkedList<Evento>();
			List<Meta> metas = new LinkedList<Meta>();
			List<Lembrete> lembretes = new LinkedList<Lembrete>();
			
			Agenda agenda = new Agenda(eventos,metas,lembretes);
			eventos.add(new Evento("local"));
			metas.add(new Meta(10));
			lembretes.add(new Lembrete(20,"tempo"));
			agenda.ordenaPorEvento();
			agenda.ordenaPorAntecedencia();
			agenda.ordenaPorPrioridade();
			
			
	}
}

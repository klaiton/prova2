package agenda;

import klaiton.Periodo;

public class Lembrete extends ItemAgenda implements Comparable<Lembrete>{
	int minutos;
	String alerta;
	
	Lembrete(int _minutos,String _alerta){
		
		this.setAlerta(_alerta);
		this.setMinutos(_minutos);
		
	}
	
	Lembrete(String registro,String descricao,Periodo periodo, int minutos,String alerta){
	    	super (registro,descricao,periodo);
	    	this.inserirLembrete(minutos,alerta);
	    }
	
	public void inserirLembrete(int _minutos, String _alerta) {
			this.setMinutos(_minutos);
			this.setAlerta(_alerta);
	}
	
	
	
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public String getAlerta() {
		return alerta;
	}
	public void setAlerta(String alerta) {
		this.alerta = alerta;
	}
	
	@Override
    public boolean equals(Object object){
        if(!(object instanceof Lembrete)) return false;
        
        Lembrete outrolembrete = (Lembrete) object;
        
       return (this.minutos == outrolembrete.minutos && this.alerta == outrolembrete.alerta);
    		         
    }
   
   @Override
   public String toString() {
		StringBuilder dados = new StringBuilder();
		
		dados.append(super.toString());
		dados.append(this.getMinutos());
		dados.append(" ");
		dados.append(this.getAlerta());
	
		return dados.toString();
	}
   
   public int compareTo(Lembrete _lembrete) {
		if(this.minutos > _lembrete.minutos) {
			return 1;
		}
		if(this.minutos < _lembrete.minutos) {
			return -1;
		}
		
		return 0;
	}
	
}

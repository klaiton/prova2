package agenda;

public class Lembrete extends ItemAgenda{
	int minutos;
	String alerta;
	
	Lembrete(int _minutos,String _alerta){
		
		this.setAlerta(_alerta);
		this.setMinutos(_minutos);
		
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
   
   public int compareTo(Lembrete _lembrete) throws Exception {
		if(this.minutos > _lembrete.minutos) {
			return 1;
		}
		if(this.minutos < _lembrete.minutos) {
			return -1;
		}
		else {
			if(this.alerta.compareTo(_lembrete.alerta)==1) {
				return 1;
			}
			if(this.alerta.compareTo(_lembrete.alerta)==-1) {
				return -1;
			}	
		}
		return 0;
	}
	
}

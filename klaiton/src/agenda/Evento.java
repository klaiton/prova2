package agenda;

public class Evento extends ItemAgenda{
	String local;
	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	///to string
	@Override
    public boolean equals(Object object){
        if(!(object instanceof Evento)) return false;
        
        Evento outroevento = (Evento) object;
        
       return (this.local == outroevento.local);
    		   
            
    }
   
   @Override
   public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(this.getLocal());
		
		return dados.toString();
	}
   
   public int compareTo(Evento _evento) throws Exception {
		if(this.local.compareTo(_evento.local)==1) {
			return 1;
		}
		if(this.local.compareTo(_evento.local)==-1) {
			return -1;
		}
		
		return 0;
	}
}

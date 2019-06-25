package agenda;

import klaiton.Periodo;

public class Evento extends ItemAgenda implements Comparable<Evento>{
	
	String local;
	
	
	
	Evento(String _local){
		this.setLocal(_local);
	}
	
	 Evento(String registro,String descricao,Periodo periodo, String local){
	    	super (registro,descricao,periodo);
	    	this.inserirEvento(local);
	    }
	 
	public void inserirEvento(String _local) {
		this.setLocal(_local);
	}
	
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
   
   public int compareTo(Evento outroevento) {
	   return this.local.compareTo(outroevento.local);
   }
   
}

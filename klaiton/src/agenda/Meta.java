package agenda;



public class Meta extends ItemAgenda{
	//prioridade da meta
	private int prioridade;
    private EscalaMeta meta;
	
    Meta(int _prioridade){
    	this.inserirPrioridade(_prioridade);
    }
    
    Meta(EscalaMeta _meta){
    	this.setMeta(_meta);
    }
    
	public enum EscalaMeta{
		MEGAIMPORTANTE(40), IMPORTANTE(20), REGULAR(10), POUCOIMPORTANTE(5);
		
		private int codigo;
		  	
		private EscalaMeta(int c) {  
		        	this.codigo = c;
		  	}
		  	public int getEscalaMeta() {
		        	return this.codigo;
		  	}
		}
		
	
	public void inserirPrioridade(int prioridade) {
		this.setPrioridade(meta.getEscalaMeta());
		
		}
	
	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	public EscalaMeta getMeta() {
		return meta;
	}

	public void setMeta(EscalaMeta meta) {
		this.meta = meta;
	}

////to string
	@Override
    public boolean equals(Object object){
        if(!(object instanceof Meta)) return false;
        
        Meta outrameta = (Meta) object;
        
       return (this.prioridade == outrameta.prioridade && this.meta == outrameta.meta);
    		   
            
    }
   
   @Override
   public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(" ");
		dados.append(this.getPrioridade());
		dados.append(" ");
		dados.append(this.getMeta());
		
		return dados.toString();
	}
   
   public int compareTo(Meta _meta) throws Exception {
		if(this.prioridade > _meta.prioridade) {
			return 1;
		}
		if(this.prioridade < _meta.prioridade) {
			return -1;
		}
		
		else {
			 if(this.meta.codigo > _meta.meta.codigo) {
				return 1;
			 }
			 if(this.meta.codigo < _meta.meta.codigo) {
				return -1;
			 }	
			}
		return 0;
	}
}


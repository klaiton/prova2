package agenda;

public class Meta extends ItemAgenda{
	//prioridade da meta
	private int prioridade;
    private EscalaMeta meta;
	
	
  

	Meta(){
    	
    }
    
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
	
}


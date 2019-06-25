package agenda;



import klaiton.Periodo;

public abstract class ItemAgenda {
	private String registro;
	private String descricao;
	private Periodo periodoItem;
	
	//// implementar Item Agenda
	ItemAgenda(){
		
	}
	
	ItemAgenda(String registro){
		setRegistro(registro);
	}
	
	ItemAgenda(String registro,String descricao,Periodo periodoItem){
		this.setRegistro(registro);
		this.setDescricao(descricao);
		this.setPeriodoItem(periodoItem);
	}
	
	
	public void setRegistro(String _registro) {
		this.registro = _registro;
	}
	
	public void setDescricao(String _descricao){
		this.descricao = _descricao;
	}
	
	
	public void setPeriodoItem(Periodo _periodo) {
		this.periodoItem =_periodo;
	}
	
	
	public String getRegistro() {
		return this.registro;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public String toString(){
	    StringBuilder dados = new StringBuilder();

	    dados.append(this.getRegistro());
	    dados.append(" , ");
	    dados.append(this.getDescricao());
	    dados.append(" , ");
	    dados.append(this.periodoItem.toString());
	    return dados.toString();
	  }
	
	//fazer comparacao com o perido//
	
	public boolean equals(Object objeto) {
		
		ItemAgenda aux = (ItemAgenda)objeto;
		
		return this.getRegistro() == (aux.getRegistro()) &&
                        this.getDescricao() == (aux.getDescricao());
	
	}
	
	  public int compareTo(ItemAgenda aux) throws Exception {
			if( this.getRegistro().compareTo(aux.getRegistro())==1) {
				return 1;
			}
			if( this.getRegistro().compareTo(aux.getRegistro())==-1) {
				return -1;
			}
			else {
				if( this.getDescricao().compareTo(aux.getDescricao())==1) {
					return 1;
				}
				if( this.getDescricao().compareTo(aux.getDescricao())==-1 ) {
					return -1;
				}
				
			}
			return 0;
		}
	
}

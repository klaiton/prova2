package klaiton;

public class Periodo {
	
	private Data dataInicio;
	private Data dataFim;

	private Horario horarioInicio;
	private Horario horarioFim;
	
	
	
	Periodo(){
		
	}
	
	Periodo(String dataIni, String horarioIni,String dataF,String horarioF)throws Exception{
		this.iserirPeriodoInicio(dataIni, horarioIni);
		this.iserirPeriodoFim(dataF, horarioF);
	}
	
	
	public void iserirPeriodoInicio(String dataInicio, String horarioInicio)throws Exception {
		Data _data = new Data(dataInicio);
		Horario _horario = new Horario(horarioInicio);
		
		this.setDataInicio(_data);
		this.setHorarioInicio(_horario);
		
	}
	
	public void iserirPeriodoFim(String dataFim, String horarioFim)throws Exception {
		Data _dataFim = new Data(dataFim);
		Horario _horarioFim = new Horario(horarioFim);
		
		this.setDataInicio(_dataFim);
		this.setHorarioInicio(_horarioFim);
		
	}
	
	public Data getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Data dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Data getDataFim() {
		return dataFim;
	}
	public void setDataFim(Data dataFim) {
		this.dataFim = dataFim;
	}
	public Horario getHorarioInicio() {
		return horarioInicio;
	}
	public void setHorarioInicio(Horario horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	public Horario getHorarioFim() {
		return horarioFim;
	}
	public void setHorarioFim(Horario horarioFim) {
		this.horarioFim = horarioFim;
	}
	
	
	///to string 
	@Override
    public boolean equals(Object object){
        if(!(object instanceof Periodo)) return false;
        
        Periodo outroperiodo = (Periodo) object;
        
       return (this.dataInicio == outroperiodo.dataInicio && this.horarioInicio == outroperiodo.horarioInicio && 
    		   this.dataFim == outroperiodo.dataFim && this.horarioFim == outroperiodo.horarioFim);
            
    }
   
   @Override
   public String toString() {
		StringBuilder dados = new StringBuilder();
		
		dados.append(super.toString());
		dados.append("Periodo Inicio: ");
		dados.append(this.getDataInicio());
		dados.append(" ");
		dados.append(this.getHorarioInicio());
		dados.append("Periodo Fim: ");
		dados.append(this.getDataFim());
		dados.append(" ");
		dados.append(this.getHorarioFim());
		
		return dados.toString();
	}
   
   public int compareTo(Periodo periodo) throws Exception {
		if(this.dataInicio.compareTo(periodo.dataInicio) == 1) {
			return 1;
		}
		if(this.dataInicio.compareTo(periodo.dataInicio) == -1) {
			return -1;
		}
		
		else {
			if(this.dataFim.compareTo(periodo.dataFim) == 1) {
				return 1;
			}
			if(this.dataFim.compareTo(periodo.dataFim) == -1) {
				return -1;
			}
			else {
				if(this.horarioInicio.compareTo(periodo.horarioInicio) == 1) {
					return 1;
				}
				if(this.horarioInicio.compareTo(periodo.horarioInicio) == -1) {
					return -1;
				}
				else {
					if(this.horarioFim.compareTo(periodo.horarioFim) == 1) {
						return 1;
					}
					if(this.horarioFim.compareTo(periodo.horarioFim) == -1) {
						return -1;
					}
					
				}
			}
			
		}
		return 0;
	}
}

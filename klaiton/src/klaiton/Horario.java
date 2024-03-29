package klaiton;

public class Horario {
	
	    private int hora;
	    private int minutos;
	    
	    Horario(int horas ,int minutos) throws Exception{
	        this.setHorario(horas, minutos);
	    }
	    
	    Horario(int horas) throws Exception{
	        this.setHorario(horas,0);
	    }
	    
	    Horario() throws Exception{
	        this.setHorario(0,0);
	    }
	    
	    Horario(String horario) throws Exception{
	    	this.setHorario(horario);
	    }
	    
	    public static boolean horavalida(int horas,int minutos){
	        if(horas<0 || horas>23) return false;
	        
	        if(minutos<0 || minutos>59) return false;
	        
	        return true;
	    }
	    
	    public class HorarioinvalidoException extends RuntimeException{
	        /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			HorarioinvalidoException(String message){
	            super(message);
	        }
	    }
	    
	    public void setHorario(String horario) throws Exception {
	    	int _hora = 0;
	    	int _minutos = 0;
	    	int cont;
	    	
	    	cont = horario.indexOf(":");
	    	
	    	if(cont==2) {
	    		_hora= Integer.parseInt(horario.substring(0,2));
	    		_minutos = Integer.parseInt(horario.substring(3,4));
	    	}
	    	this.setHorario(_hora,_minutos);
	    	
	    }
	    
	    public void setHorario(int horas, int minutos) throws Exception{
	        if (Horario.horavalida(horas,minutos)){
	            setHora(horas);
	            setMinutos(minutos);
	        }
	        else {
	            throw new HorarioinvalidoException("Data invalida");
	        
	        }
	    }
	    
	    public void setHora(int _hora) {
	    	this.hora=_hora;	
	    }
	    public void setMinutos(int _minutos) {
	    	this.minutos=_minutos;
	    }
	    
	    public int getHora() {
			return this.hora;
		}
		public int getMinutos() {
			return this.minutos;
		}
	    
	    @Override
	    public boolean equals(Object object){
	        if(!(object instanceof Horario)) return false;
	        
	        Horario outroHorario = (Horario) object;
	        
	       return (this.hora == outroHorario.hora && this.minutos == outroHorario.minutos);
	            
	    }
	   
	   @Override
	   public String toString() {
			StringBuilder dados = new StringBuilder();
			dados.append(this.getHora());
			dados.append("h");
			dados.append(this.getMinutos());
			dados.append("min");
			
			return dados.toString();
		}
	   
	   public int compareTo(Horario horas) throws Exception {
			if( this.getHora() > horas.getHora() ) {
				return 1;
			}
			if( this.getHora()< horas.getHora() ) {
				return -1;
			}
			else {
				if( this.getMinutos()> horas.getMinutos()) {
					return 1;
				}
				if( this.getMinutos() < horas.getMinutos() ) {
					return -1;
				}
				
			}
			return 0;
		}
	}



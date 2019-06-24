package klaiton;

public class Data {
	  private int dia, mes, ano;

	  public Data(){
	      this.setData();
	  }
	  
	  public Data(int _dia, int _mes, int _ano) throws Exception{
	    this.setData(_dia, _mes, _ano);
	  }

	  public Data(int _dia, String _mes, int _ano)throws Exception{
	    this.setData(_dia,_mes,_ano);
	  }
	  

	  public boolean isDataValida(int _dia, int _mes, int _ano){
	    
	    if (_dia > this.diasDoMes(_mes,_ano)){
	     
	      return false;
	    }
	    else if (_mes > 12){
	     
	      return false;
	    }
	    else if (_ano < 1000){
	     
	      return false;
	    }
	    else{
	      
	      return true;
	    }
	  }
	  
	  public void setData(){
	      this.dia= 1;
	      this.mes= 1;
	      this.ano= 1900;
	  }
	  
	  public void setData(int _dia, int _mes, int _ano){
	    if(this.isDataValida(_dia, _mes, _ano)){
	      this.dia = _dia;
	      this.mes = _mes;
	      this.ano = _ano;
	    }
	    else{
	      throw new DatainvalidaException("Data invalida");
	    }
	  }

	  public void setData(int _dia, String _mes, int _ano)throws Exception{
	    this.setData(_dia, this.converterMes(_mes), _ano);
	  }

	  private int converterMes(String _mes){ 
	    //Retorna o valor inteiro referente ao Mês
	    int m=0;
	    _mes = _mes.toLowerCase();

	      switch (_mes) {
	          case "janeiro":
	              m =1;
	              break;
	          case "fevereiro":
	              m =2;
	              break;
	          case "março":
	              m =3;
	              break;
	          case "abril":
	              m =4;
	              break;
	          case "maio":
	              m =5;
	              break;
	          case "junho":
	              m =6;
	              break;
	          case "julho":
	              m =7;
	              break;
	          case "agosto":
	              m =8;
	              break;
	          case "setembro":
	              m =9;
	              break;
	          case "outubro":
	              m =10;
	              break;
	          case "novembro":
	              m =11;
	              break;
	          case "dezembro":
	              m =12;
	              break;
	      }

	    return m;
	  }

	  private int getDia(){
	    return this.dia;
	  }

	  private int getMes(){
	    return this.mes;
	  }

	  private int getAno(){
	    return this.ano;
	  }

	  private boolean isBissexto(int _ano){
	      return _ano % 4 == 0 && _ano % 100 != 0 || _ano % 400 == 0;
	  }

	  private int diasDoMes(int _mes, int _ano){
	  
	    switch(_mes){
	      case 1: //Janeiro
	        return 31;
	      case 2: //Fevereiro
	        if (isBissexto(_ano)) return 29;
	        else return 28;
	      case 3: //Março
	        return 31;
	      case 4: //Abril
	        return 30;
	      case 5: //Maio
	        return 31;
	      case 6: //Junho
	        return 30;
	      case 7: //Julho
	        return 31;
	      case 8: //Agosto
	        return 31;
	      case 9: //Setembro
	        return 30;
	      case 10: //Outubro
	        return 31;
	      case 11: //Novembro
	        return 30;
	      case 12: //Dezembro
	        return 31;
	      default:
	        //System.out.println("EEROO");
	        return 0;
	    }
	  }

	  public void incrementa() {	
			try{
				this.setData(getDia()+1,getMes(),getAno());
			}
			catch(Exception dia){
				try{
					this.setData(1,getMes()+1,getAno());
				}
				catch(Exception mes){
					try {
						this.setData(1,1,getAno()+1);
					}
					catch(Exception ano) {
					}
				}
			}
			return;
		}
	  
	  public void incrementa(int n){
	      while(n>1){
	          incrementa();
	      }
	  }
	  
	  
	  
	  //tratamento de erro
	  
	  public class DatainvalidaException extends RuntimeException{
	        DatainvalidaException(String message){
	            super(message);
	        }
	    }
	  
	  public boolean equals(Object objeto) {
			Data aux = (Data)objeto;
			return this.getDia() == (aux.getDia()) &&
	                        this.getMes() == (aux.getMes()) &&
	                        this.getAno() == (aux.getAno());
		}
	  
	  public String toString(){
	    StringBuilder dados = new StringBuilder();

	    dados.append(this.getDia());
	    dados.append("/");
	    dados.append(this.getMes());
	    dados.append("/");
	    dados.append(this.getAno());
	    return dados.toString();
	  }

	public static Data verificaECriaData(int dia, int mes, int ano) throws Exception {
			Data data;
			try{
				data = new Data(dia,mes,ano);
			}
			catch(DatainvalidaException e){
				return null;
			}
			return data;
		}

	    /**
	     *
	     * @param date2
	     * @return
	     * @throws Exception
	     */
	    public int compareTo(Data date2) throws Exception {
			if( this.getAno() > date2.getAno() ) {
				return 1;
			}
			if( this.getAno() < date2.getAno() ) {
				return -1;
			}
			else {
				if( this.getMes() > date2.getMes() ) {
					return 1;
				}
				if( this.getMes() < date2.getMes() ) {
					return -1;
				}
				else {
					if(this.getDia() > date2.getDia()) {
						return 1;
					}
					if(this.getDia() < date2.getDia()) {
						return -1;
					}
				}
			}
			return 0;
		}


}


package questao8;


public class Endereco {

      private String cep;
	private String rua;
	
        public String getCep() {
 		return cep;
 	}
 	public void setCep(String cep) {
 		this.cep = cep;
 	}
 	
 	public String getRua() {
 		return rua;
 	}
 	public void setRua(String rua) {
 		this.rua = rua;
 	}
 	 	
        
        
        
        
        
        
        
        
        
 	public void FormaCep(int cep){
 		String stringCep = cep + "";
 		String PrimeiraSeparacao;
                PrimeiraSeparacao = stringCep.substring(3,8);
 		String UltimaSeparacao;
                UltimaSeparacao = stringCep.substring(2, 4);
 		this.cep = PrimeiraSeparacao + "-" + UltimaSeparacao;
 	}
 }
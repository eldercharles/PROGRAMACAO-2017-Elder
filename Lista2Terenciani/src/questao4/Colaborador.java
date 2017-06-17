package questao4;


public class Colaborador {
    
    
    

 	    private String nomes;
 	  private String cargo;
 	private Colaborador superiores;
 
 	public String getNome() {
 		return nomes;
 	}
 
          	public void setNome(String nome) {
 		this.nomes = nome;
 	}
 
 	        public String getCargo() {
 		return cargo;
 	}
 
 	        public void setCargo(String cargo) {
 		this.cargo = cargo;
 	}
 
 	@Override
 	        public String toString() {
 
            
            
            
            
            
            
 		return "Colaboradores: " + this.nomes + ", Cargos: " + this.cargo;
 	}
 
 }
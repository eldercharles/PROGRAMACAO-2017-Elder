
package questao5;



public class Autor {
	private String nome;
 	private String email;
 	private String sexo;
public  Autor(String nome, String email, String sexo) {
 	this.nome = nome;
 	this.email = email;
 	this.sexo = sexo;
 	}





 	public String getName() {
 		return nome;
 	}
        
        
        
        
 	public void setName(String name) {
 		this.nome = nome;
 	}
        
        
        
 	public String getEmail() {
 		return email;
 	}
        
        
        
 	public void setEmail(String email) {
 		this.email = email;
 	}
        
        
        
 	public String getSexo() {
 		return sexo;
 	}
        
        
        
        
 	public void setSexo(String sexo) {
 		this.sexo = sexo;
 	}
        
        
        
        @Override
  	public String toString() {
 	return "Autor:" + "" + this.nome + "\n" 
        + "email: " + this.email + "\n"
        + "sexo: " + this.sexo;
 	}
        
        
 	
 }
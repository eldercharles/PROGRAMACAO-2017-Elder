package questao1;


public class PrincipalPais {
    
public static void main(String[] args) {
		Pais Russia = new Pais("Russia", "Moscovo", 2.511);  
		Pais Franca = new Pais("Franca", "Paris", 105.4);       
		Pais Toquio = new Pais("Toquio", "Japao", 2.188);         
		Pais Portugal = new Pais("Portugal", "Lisboa", 100.0);     
		
                
                
                
                
                
                
	System.out.println("\n");
		System.out.println(Russia.equals(Russia));
		System.out.println(Russia.equals(Russia));
		System.out.println(Toquio.equals(Toquio));
		
		Russia.setFronteiras(Franca, Portugal);
		Franca.setFronteiras(Russia, Toquio);
		Toquio.setFronteiras(Franca, Toquio);
		Portugal.setFronteiras(Russia);
		
                
                
                
                
                
		System.out.println("\n");
		imprimeFronteira(Russia.getFronteiras());
		imprimeFronteira(Franca.getFronteiras());
		imprimeFronteira(Toquio.getFronteiras());
		imprimeFronteira(Portugal.getFronteiras());
		
                
                
                
                
                
                
		System.out.println("\n");
		imprimeFronteira(Russia.vizinhosEmComum(Toquio));
		imprimeFronteira(Portugal.vizinhosEmComum(Franca));
	}	
	
	private static void imprimeFronteira(Pais[] paises) {
		for(Pais pais : paises) {
			System.out.print(pais.getNome() + " ");
		}
		System.out.println();
	}
}
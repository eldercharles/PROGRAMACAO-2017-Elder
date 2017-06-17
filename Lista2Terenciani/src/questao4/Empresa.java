package questao4;


public class Empresa {
    
public Empresa[] arrayColaboradores; 	
 	
    public void mostrarColaboradores(){
 	if (arrayColaboradores != null){
 	for(int i = 0; i < arrayColaboradores.length; i++ ){
 	System.out.println(arrayColaboradores[i].toString());
 	}
            } 		
 	}
 	public void quantidade(int quantidade){
 		arrayColaboradores = new Empresa[quantidade];
 		
 	}
 	public void adicionaColaborador(int posicao,Empresa colaborador){
 		arrayColaboradores[posicao] = colaborador;
 	}

    void adicionaColaborador(int i, Colaborador novoColaborador) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
 	
}
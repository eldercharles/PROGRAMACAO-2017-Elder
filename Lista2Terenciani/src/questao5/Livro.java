
package questao5;

public class Livro {
 
 	private String nome;
 	private Autor autor;
 	private double preco;
 	private int estoque;
 	 
        
        
        
 	public Livro(String nome,Autor autor, double preco, int estoque) {
            this.nome = nome;
            this.autor = autor;
            this.preco = preco;
            this.estoque = estoque;
            
            
            
            
            
 	} 
 	public String getNome() {
 		return nome;
 	} 
 	public void setNome(String nome) {
 		this.nome = nome;
 	} 
 	public Autor getDiagramaAutorExercicio05() {
 		return autor;
 	} 
 	public void setDiagramaAutorExercicio05(Autor autor) {
 		this.autor = autor;
 	}
        public int getEstoque() {
 		return estoque;
 	} 
 	public void setEstoque(int estoque) {
 		this.estoque = estoque;
 	}        
 	public double getPreco() {
 		return preco;
 	} 
 	public void setPreco(double preco) {
 		this.preco = preco;
 	}
        
        
        
        
        
        
  	@Override
 	public String toString() {
 	return "Autor: " + this.nome + 
        "Preço: " + this.preco + 
        "Quantidade:  " + this.estoque;
 	} 
 }
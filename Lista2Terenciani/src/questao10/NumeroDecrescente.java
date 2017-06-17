
package questao10;

public class NumeroDecrescente {
    
 	public final int numero;
 	
 	public NumeroDecrescente(int numero)   {
 	this.numero = numero;
 	}
 
 	public void printNumero(){
 		int descNumero = numero + 1;
 		for(int q = numero; q >=0;   
                                q--){
 			      descNumero = descNumero - 1;
 			            System.out.println(descNumero);
 		}
 	}
 
 }
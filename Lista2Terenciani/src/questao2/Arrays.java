
package questao2;

public class Arrays {

    int[] inteiros;
    
    
    
    
    
    
    
    
public int[]getInt() {
        return inteiros;
 	}








    public void setInt(int[] inteiros) {
        this.inteiros = inteiros;
 	}
        
    
    
    
    
    
    
    public void numeros(int numero1, int numero2) {
        inteiros[numero1] = numero2;
        }    






    
    public void contador(int contador) {
 		inteiros = new int   [contador];
 	} 	
    
    
    
    
    
    
    
    
    public int soma() {
 	int tot = 0;
 	for (int i = 0;    i < inteiros.length; i++) {
 	tot = tot + inteiros[i];
 	}
        return tot;
 	}
 	 
}
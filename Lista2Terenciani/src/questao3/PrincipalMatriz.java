package questao3;

public class PrincipalMatriz {

  
    public static void main(String[] args) {
       
 	
 	Matriz matrizes = new Matriz();
 		
 	int[][] matriz1 = new int[3][3];
 	matriz1[0][0] = 1;
 	 matriz1[1][1] = 2;
 	  matriz1[0][1] = 3;
 	   matriz1[1][0] = 4;
    int[][] matriz2 = new int [3][3];
 	 matriz1[0][0] = 1;
 	   matriz1[1][0] = 2;
 	      matriz1[0][1] = 3;
 	         matriz1[1][1] = 4;
        
        System.out.println("Matriz Um");
 	matrizes.ImprimirMatriz(matriz1);        
        System.out.println("\n");
 		
        
        
        
        
        
        
        
 	   System.out.println("Matriz Dois");
 	 matrizes.ImprimirMatriz(matriz2); 
        System.out.println("\n");
        
        
        
 		
        
        
        
 	int[][] multiplicacao = new int [3][3];
 	 System.out.println("resultado: ");
 	  multiplicacao = matrizes.MultiplicarMatrizes (matriz1, matriz2, 3, 3);
 	    matrizes.ImprimirMatriz(multiplicacao);
 		
 	
 	}
 
 }
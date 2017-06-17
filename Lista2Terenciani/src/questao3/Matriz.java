
package questao3;

 class Matriz {
     
     
     
    
public void ImprimirMatriz(int[][] matriz){
        for (int[] matriz1 : matriz) {
            for (int b = 0; b < matriz1.length; b++) {
                System.out.println("|" + matriz1[b] + "|");
            }
        }
 	}



 	public int[][] MultiplicarMatrizes(int[][] matriz1, int[][] matriz2, int qtda, int qtdb){
 	int[][] resultado = new int[qtda][qtdb];
 	for (int i = 0; i < matriz1.length; i++ ){
 		for (int j = 0; j < matriz1.length; j++){
 		resultado[i][j] = (matriz1[i][j] * matriz2[i][j]);
 		}
 		}
 return resultado;
 	}
}
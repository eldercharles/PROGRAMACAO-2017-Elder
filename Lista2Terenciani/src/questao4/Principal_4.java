
package questao4;

import java.util.Scanner;


public class Principal_4 {

 public static void main(String[] args) {
      
 	Empresa empresa = new Empresa();
	Scanner sc = new Scanner(System.in);
 	System.out.println("Entre com o número de colaboradores: ");
 	int total = sc.nextInt();
 	empresa.quantidade(total);
 		
            for(int i = 0; i< total; i++ ){
            Colaborador novoColaborador = new Colaborador();
 			
            System.out.println("Nome: ");
            String nome = sc.next();
            novoColaborador.setNome(nome);
 			
            System.out.println("Cargo: ");
            String cargo = sc.next();
            novoColaborador.setCargo(cargo);
 			
            empresa.adicionaColaborador(i, novoColaborador);
 			
            }
 		empresa.mostrarColaboradores();
 		sc.close();
 	}
 }
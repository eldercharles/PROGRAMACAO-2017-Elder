
package questao12;

import java.util.Scanner;


 
public class TrocaNumeroPrincipal {

    
    public static void main(String[] args) {
     
 	TrocaNumero numero = new TrocaNumero();
 	Scanner sc = new Scanner (System.in);
 		
 	System.out.println("Numero 1: ");
 	int numero1 = sc.nextInt();
 		
 	System.out.println("Numero 2: ");
 	int numero2 = sc.nextInt();
 		
 	numero.numero3(numero1, numero2);
 	sc.close();
 		
    }
}
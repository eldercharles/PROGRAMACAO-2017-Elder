package questao11;

public class PareImpar {
    
    
    
    
    

    public static void main(String[] args) {
    int x = 0, impar=0,     t;
    double par = 0;
    
    for(t=0;      t < 30; t++)   {
           if(t%2==0){
	    if(t>2){
	    par = par*t;
	  }
          else{
	par = t;
	}
}
        else{
        impar = impar+t;
        }
    }
        System.out.printf("Soma dos numeros sao:: %d", impar);
        System.out.printf("A Multiplicação é: %.2f", par);
    }
}
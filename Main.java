import java.util.Scanner;
public class Main {
	public static int Grilo = 0;

	public static void main(String[] args) {
		Scanner pegaInfo = new Scanner(System.in);
		System.out.println("Insira quantidade de grilos ");
		Grilo = pegaInfo.nextInt();
		System.out.println("Quantos centimetros tem a pista?");
		DaSeusPulo.linhaChegada = pegaInfo.nextInt();
		System.out.println("A linha de chegada fica a " + DaSeusPulo.linhaChegada + " de distancia");
		
		IdThread idthread[] = null;
		Corredor[] corredor = new Corredor[Grilo];
		 
		  for ( int i = 0; i < Grilo; i++) {
	            corredor[i] = new Corredor("Grilo_" + (i+1));
	        }   
		 DaSeusPulo.Pista(Grilo,corredor, idthread);
		  
		   
	}

}

import java.util.Random; //grilo
public class Corredor extends Thread {

	Random random = new Random();
	public static int distanciaPulo = 0;
	public static int quantidadePulos = 0;
	public static int ondeGriloTa = 0;
	String nome;
	boolean acabou=false;
	public Corredor(String Nome) {
        this.nome = Nome;
    }
	
	public void run() {//pulo
		
		while(!acabou) {
			
			distanciaPulo = random.nextInt(25);
			ondeGriloTa += distanciaPulo;
			quantidadePulos++;
			System.out.println("O " + this.nome + " pulou " + distanciaPulo + "cm e já percorreu: " + ondeGriloTa + "cm"); 
			Corre();
		}
	
		
		if(acabou) {
        	System.out.println("O " + nome +" alcançou a linha de chegada em "+ quantidadePulos);   
		}
		
	//	System.out.println(quantidadePulos);
		
	 
		
		
	}
	public void Corre() {
		if(ondeGriloTa >= DaSeusPulo.linhaChegada) {
			acabou = true;
		}else {
			acabou = false;
		}
		
	}
	
	
	

}

//corrida
public class DaSeusPulo {

	public static int linhaChegada = 0;
	
	
	public static void Pista(int Grilo, Corredor[] corredor, IdThread[] idthread) {
		idthread = new IdThread[Grilo];
		for (int i = 0; i < Grilo; i++) {
			idthread[i] = new IdThread(corredor[i]);
	        corredor[i] = new Corredor("Grilo" + (i+1));
	        
	        corredor[i].start();
	        
	       
	    }   
		for (int i = 0; i < idthread.length; i++) 
        {
          try 
          {
        	  idthread[i].join();
          } 
          catch (InterruptedException e ) 
          {
              e.printStackTrace();
          }
        }
		
	}

}

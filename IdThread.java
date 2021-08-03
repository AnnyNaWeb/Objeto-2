
public class IdThread extends Thread{
	Corredor corredor;

	 public IdThread(Corredor corredor) 
	    {
	        this.corredor = corredor;
	    }

	    @Override
	    public void run() 
	    {
	    	corredor.run();
	    }

}

package SingletonDesignPattern;

public class Singelton   {
  
	 
	static Singelton s = null;
	
	
	private Singelton() throws Exception{
		// TODO Auto-generated constructor stub
		if(s!=null)
			throw new Exception();
		
	}
	
	
	static public Singelton getInstance() throws Exception{
		
		if(s==null)
			s=  new Singelton();
		return s;
	}

	Object readResolve() throws Exception{
		if(s==null)
			s=new Singelton();
		return s ;
	}
	
	
	
	
}

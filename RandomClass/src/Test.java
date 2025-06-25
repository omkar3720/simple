import java.util.Random;

public class Test 
{
	private final static Random r = new Random();
	
	public int createRandom()
	{

		   int i = r.nextInt(100000,999999);
		    System.out.println("This is Random Class No Logic");
		   return i;
		
	}
	
   public static void main(String[] args) 
   {
	   Test t = new Test();
	   int i1=t.createRandom();
	   System.out.println(i1);
	   
}
}

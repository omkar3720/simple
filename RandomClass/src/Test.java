import java.util.Random;

public class Test 
{
	private final static Random r = new Random();
	
	public int createRandom()
	{

		   int i = r.nextInt(100000,999999);
		
		   return i;
		
	}
   public static void main(String[] args) 
   {
	   System.out.println("This is main method");
	   Test t = new Test();
	   int i1=t.createRandom();
	   System.out.println(i1);
	   System.out.println("This is End");
	   
}
}

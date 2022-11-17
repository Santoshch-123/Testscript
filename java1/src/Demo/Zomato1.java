package Demo;
import java.util.Scanner;
public class Zomato1
{
    static void buy() throws ZomatoException
    {
    	Scanner Sc = new Scanner(System.in);
    	System.out.println("enter amount");
    	int cost = Sc.nextInt();
    	if((cost>=150)&&(cost<=300))
    	{
    		System.out.println("30% discount");
    	}
    	else
    	{
    		throw new ZomatoException("no discount");
    	}
    }
	public static void main(String[] args)
	{
	    try
	    {
	    	buy();
	    }
       catch(ZomatoException a)
	    {
    	   System.out.println(a.getresult());
	    }
	} 
}
class ZomatoException extends Exception
{
	String result;
	ZomatoException(String result)
	{
		this.result=result;
	}
	public String getresult()
	{
		return result;
	}
}

import java.util.*;
public class Exception {
	int num1,num2,result;
	
	public void getdata()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number 1:");
		num1= sc.nextInt();
		System.out.println("Enter the number 2:");
		num2= sc.nextInt();
		
	}
	public void division()
	{
		try
		{
			result = num1 / num2;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handle");
			e.printStackTrace();
			
		}
	
	}
	/*public void display()
	{
		System.out.println("Result:"+result);
	}*/

}

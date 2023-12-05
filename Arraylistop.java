import java.security.PublicKey;
import java.util.*;
public class Arraylistop {
	private	    ArrayList<Integer> numlist = new ArrayList<Integer>();	
	private	    ArrayList<Integer> evenlist = new ArrayList<Integer>();	
	private		ArrayList<Integer> oddlist = new ArrayList<Integer>();	
	private		ArrayList<Integer> primelist = new ArrayList<Integer>();
	private     ArrayList<String> Stringlist = new ArrayList<String>();
	private     ArrayList<String> Palindromelist = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	    
	public void addnumbers()
	{  
		 System.out.println("How Many Numbers You Want To Enter : ");
		 int num = sc.nextInt();
		 int element;
		 for(int i =0; i<num; i++)
		 {
			 System.out.println("Enter Number : ");
			 element = sc.nextInt();
			 numlist.add(element);
		 }
		 
		
	}
	
	public void get_even_numbers()
	{ 
		for(int i =0; i<numlist.size(); i++)
		 {
			if(numlist.get(i)%2 == 0)
			{
				evenlist.add(numlist.get(i));
				
			}
			else{
				oddlist.add(numlist.get(i));
			}
		 }
		
	}
	
	public void get_prime_numbers()
	{
		int flag;
		
		for(int i=0; i<numlist.size(); i++)
		{
			flag = 0;
			
			for(int j=2; j<=Math.sqrt(numlist.get(i)); j++)
			{
				if(numlist.get(i) % j == 0)  //if its is not a prime number set flag 1 and break
				{
					flag = 1;
					break;
					//primelist.add(numlist.get(i));
				}
			}
			
			if(flag == 0 &&  numlist.get(i) != 1) // if flag 0 then it is a prime number then add this to prime list
			{
				primelist.add(numlist.get(i));
			}
		}
	}
	
	public void display()
	{
		System.out.println("Numbers list : "+numlist);
		System.out.println("Even Numbers list : "+evenlist);
		System.out.println("Odd Numbers list : "+oddlist);
		System.out.println("Prime Numbers list : "+primelist);
	}
	
	
	public void addStrings()
	{
		 System.out.println("How Many Strings You Want To Enter : ");
		 int num = sc.nextInt();
		 String S1;
		 for(int i =0; i<num; i++)
		 {
			 System.out.println("Enter String : ");
			 S1 = sc.next();
			 Stringlist.add(S1);
		 }
		 
	}
	
	public void get_palindrome_String()
	{	
		for(int i =0; i<Stringlist.size(); i++)
		{
			String s1 = Stringlist.get(i);
			boolean ispalindrom = checkPalindrome(s1);
			if(ispalindrom)
			{
				Palindromelist.add(s1);
			}
		}
		System.out.println("Palindrome Strings : "+Palindromelist);
		
	}

	private boolean checkPalindrome(String s1) {
		// TODO Auto-generated method stub
		StringBuilder reversed = new StringBuilder(s1).reverse();
		return s1.equals(reversed.toString());
	}
		
		
}

	 
	
	


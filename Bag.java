import java.util.*;
public class Bag {
	private int weight;
	private String color;
	static int count,totalWeight;
	
	public Bag()			//default constructor #1
	{
		weight = 10;
		color = "White";
		count++;
		totalWeight = totalWeight + weight; 
	}
	
	public Bag(int weight)			//para constructor with def color #2
	{
		this.weight  = weight;
		color = "White";
		count++;
		totalWeight = totalWeight + weight;
	}
	
	public Bag(String color)         //para constructor with def weight #3
	{
		weight = 10;
		this.color = color;
		count++;
		totalWeight = totalWeight + weight;
	}
	
	public Bag(int weight,String color)  //parametertised constructor #4
	{
		this.weight = weight;
		this.color = color;
		count++;
		totalWeight = totalWeight +  weight;
	}
	
	public static void output()
	{
		System.out.println("The bag has "+count+" balls");
		System.out.println("The weight of bag is "+totalWeight);
	}
	
	public void display(int i) 
	{
		
			System.out.println((i+1)+" "+color+" "+weight);
	}
	
	public static void delete_record(Bag arr[])
	{
		int record;
		Scanner sc = new Scanner(System.in);
		System.out.println("Which record do you want to delete");
		record = sc.nextInt();
		totalWeight -= arr[record-1].weight;  //x=x-3
		
		for(int i = record;i < count; i++)
		{
			arr[i-1] = arr[i];
		}
		
		//System.out.println("Hi");
		
		
		//sc.close();
	}
}



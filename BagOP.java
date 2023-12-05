import java.util.*;
public class BagOP {

	public static void main(String[] args) {
		int choice,ch,wt,n=0;
		String color;
		Bag arr[] = new Bag[20];
		Scanner sc = new Scanner(System.in);
				
		do
		{
			System.out.println("1. Add ");
			System.out.println("2. Display ");
			System.out.println("3. Delete ");
			System.out.println("4. Display total weight and objects ");
			System.out.println("5. Exit ");
			System.out.println("Choice:");
			ch = sc.nextInt();
				
			switch(ch)
			{
			case 1:
				do
				{
					System.out.println("1.Default weight and color");
					System.out.println("2.Default weight and input color");
					System.out.println("3.Default color and Input weight");
					System.out.println("4.Input weight and Input color");
					System.out.println("5.Exit ");
					System.out.println("Enter choice:");
					choice = sc.nextInt();
				
					
					switch(choice)
					{
						case 1:
							arr[n] = new Bag();
							n++;
							break;
						case 2:
							System.out.println("Enter colour");
							color = sc.next();
							arr[n] = new Bag(color);
							n++;
							break;
						case 3:	
							System.out.println("Enter weight");
							wt = sc.nextInt();
							arr[n] = new Bag(wt);
							n++;
							break;
						case 4:
							System.out.println("Enter weight");
							wt = sc.nextInt();
							System.out.println("Enter color");
							color = sc.next();
							arr[n] = new Bag(wt,color);
							n++;
					}
				}while(choice!=5);	
				break;
			
				case 2:
					
					for(int i = 0; i < n; i++)
					{
						arr[i].display(i);
					}
					
					break;
					
				case 3:
					Bag.delete_record(arr);
					n--;
					break;
					
				case 4:
					Bag.output();
					break;
					
				case 5:
					break;
					
					default:
						System.out.println("Invalid choice");
				}
				
			}
			while(ch != 5);
			
		sc.close();
		} 
	}

	
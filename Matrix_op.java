import java.util.Scanner;
public class Matrix_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix m1 = new Matrix();
		Matrix m2 = new Matrix();
		Matrix m3 = new Matrix();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter Your First Matrix ! ");
		m1.getdata();
		m1.display();
		System.out.println("Enter Your Second Matrix ! ");
		m2.getdata();
		m2.display();
		do{
			System.out.println("Enter 1 to perform addition of matrices : ");
			System.out.println("Enter 2 to perform Substraction of matrices : ");
			System.out.println("Enter 3 to perform Multiplication of matrices : ");
			System.out.println("Enter 4 to perform Transpose of one of the matix : ");
			System.out.println("Enter 5 to exit : ");
			choice = sc.nextInt();

			switch(choice){
				case 1 :
				 m3.Addition(m1, m2);
				 m3.display();
				 break;
				case 2 :
				  m3.Substraction(m1, m2);
				  m3.display();
				  break;
				case 3:
				  m3.multiplication(m1, m2);
				  m3.display();
				  break;
				case 4:
				System.out.println("Enter 1 for first matrix's transpose or 2 for other matrix's transpose : ");				
				int ch = sc.nextInt();
				if(ch == 1)
				{   
				 m3.transpose(m1);
				 m3.display();
				 break;
				}
				else
				{
					m3.transpose(m2);
					m3.display();
					break;
				}  

			}
			
			

		}while(choice != 5);
	}

}
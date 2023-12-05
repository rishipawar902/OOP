import java.util.*;
public class Matrix{
    private int r,c;
    private int mat[][] = new int [50][50];
    
    public void getdata()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Row : ");
    	r = sc.nextInt();
    	System.out.println("Enter Column : ");
    	c = sc.nextInt();
    	System.out.println("Enter Elements  : ");
    	for(int i= 0; i<r; i++)
    	{
    		for(int j = 0; j<c; j++)
    		{
    			mat[i][j] = sc.nextInt();
    		}
    	}
    }
    
    public void Addition(Matrix x , Matrix y)
    { 
     if((x.r == y.r) && (x.c == y.c) )
      { 
       this.r = x.r;
       this.c = x.c;
       for(int i =0; i<r; i++)
       {
    	   for(int j =0; j<c; j++)
    	   {
    		  this.mat[i][j] =  x.mat[i][j] + y.mat[i][j];
    	   }
       }
       System.out.println();
       System.out.println("Addition iS : ");
    	
      }
    else{
      System.out.println("Addition not Possible because order is not same");
    }
    }


    public void Substraction(Matrix x , Matrix y)
    { 
     if((x.r == y.r) && (x.c == y.c) )
      { 
       this.r = x.r;
       this.c = x.c;
       for(int i =0; i<r; i++)
       {
    	   for(int j =0; j<c; j++)
    	   {
    		  this.mat[i][j] =  x.mat[i][j] - y.mat[i][j];
    	   }
       }
       System.out.println();
       System.out.println("Subtraction iS : ");
    	
      }
    else{
      System.out.println("Subtraction is not Possible because order is not same");
    }
    }

  

    
    
    public void multiplication(Matrix x , Matrix y)
    {  
        
      if(x.c == y.r)
      {
        this.r =x.r;
        this.c = y.c;
        int row2 = y.r;
       
        for(int i =0; i<r; i++)
        {
     	   for(int j =0; j<c; j++)
     	   { 
     		  for(int k =0 ; k<row2; k++)
     		  {
     			  int p = x.mat[i][k]*y.mat[k][j];
                  mat[i][j] = mat[i][j]+p;
          }
     	   }
        }
        System.out.println();
        System.out.println("Multiplication iS : ");
      }
      
      else{
        System.out.println("Multiplication is Not possible !! ");
      }
        
       
     	
    }

    public void transpose(Matrix x)
    {
      this.r = x.c;
      this.c= x.r;
    
        for(int i =0; i<r; i++)
        {
     	   for(int j =0; j<c; j++)
     	   { 
     		   mat[i][j] = x.mat[j][i];
     	   }
        }
        System.out.println();
        System.out.println("Transpose iS : ");
     


    }
    
    
    public void display()
    { System.out.println("Matrix : ");
    	for(int i= 0; i<r; i++)
    	{
    		for(int j = 0; j<c; j++)
    		{
    			
    			System.out.print(mat[i][j]+ " ");
    		}
    		System.out.println();
    	}
    	System.out.println();
    }
    
}

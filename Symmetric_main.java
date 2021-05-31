
import java.util.*;
class Symmetric
{
	int r,c,i,j,flag=1;
	int a[][]=new int[10][10];
	int t[][]=new int[10][10];
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row of matrix:");
		r=sc.nextInt();
		System.out.print("Enter the column of matrix:");
		c=sc.nextInt();
		if(r==c)
		{

			System.out.println("Enter elements of matrix:");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
					a[i][j]=sc.nextInt();
				System.out.println();
			}
		}
		else
		{
			System.out.println("Not possible! Not a Square Matrix");
		}
	}
	void disp()
	{
		System.out.println("MATRIX IS");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
	void transpose()
	{
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				t[j][i]=a[i][j];
			}
		}
		System.out.println("\n\nResultant matrix after transpose ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}

		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(a[i][j]!=t[i][j])
				{
					flag=0;
					break;
				}
			}
		}
		if(flag==1)
			System.out.println("Symmetric Matrix");
		else
			System.out.println("Not Symmetric Matrix");

	}
}
class Symmetric_main
{
	public static void main(String args[])
	{
		Symmetric s=new Symmetric();
		s.read();
		s.disp();
		s.transpose();
	}
}

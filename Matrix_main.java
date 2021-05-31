
import java.util.*;
class Matrix
{
	Scanner sc=new Scanner(System.in);
	int row,col,i,j;
	int[][] a=new int[10][10];
	void read()
	{
		System.out.print("Enter the Row :");
		row=sc.nextInt();
		System.out.print("Enter the Column :");
		col=sc.nextInt();
		System.out.println("\nEnter elements of matrix :");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				a[i][j]=sc.nextInt();
			System.out.println();
		}
	}

	void disp()
	{
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}
	}

	void add(Matrix m1,Matrix m2)
	{
		System.out.println("\n\nMATRIX AFTER ADDITION\n");
		if((m1.row==m2.row)&&(m1.col==m2.col))
		{
			for(i=0;i<m1.row;i++)
			{
				for(j=0;j<m1.col;j++)
				{
					a[i][j]=m1.a[i][j]+m2.a[i][j];
				}
			}
			row=m1.row;
			col=m1.col;
		}
		else
		{
			System.out.println("Addition not possible");
		}
	}

}

class Matrix_main
{
	public static void main(String args[])
	{
		System.out.println("\n\nREAD MATRICES\n\n");
		Matrix m1=new Matrix();
		m1.read();
		Matrix m2=new Matrix();
		m2.read();
		System.out.println("\nMATRIX 1\n");
		m1.disp();
		System.out.println("\nMATRIX 2\n");
		m2.disp();
		Matrix m3=new Matrix();
		m3.add(m1,m2);
		m3.disp();
	}

}

	import java.util.*;
	class Jagged
	{
		public static void main(String args[])
		{
		Scanner sc= new Scanner(System.in);
		int r,c,i,j;
		System.out.println("Enter number of rows");
		r=sc.nextInt();
		int a[][]= new int[r][];
		System.out.println("Length:"+a.length);
		for(i=0;i<a.length; i++)
		{
		System.out.println("Enter number of columns in row"+i);
		c=sc.nextInt();
		a[i]=new int[c];

		}
		for(i=0;i<a.length;i++)
		{
		for(j=0;j<a[i].length;j++)
		a[i][j]=sc.nextInt();
		}
		System.out.println("Jagged array");
		for(i=0;i<a.length;i++)
		{
		for(j=0;j<a[i].length;j++)
		System.out.print(a[i][j]+" ");
		System.out.print();
		}

		}
	}
import java.util.Scanner;
public class Sort_Array 
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int i,j,k,l,m,n,a[];
		n = obj.nextInt();
		a = new int [n];
		for(i=0;i<n;i++)
		{
			a[i] = obj.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					l=a[i];
					a[i]=a[j];
					a[j]=l;
				}
			}
		}
		System.out.println("After Sorting :");
		for(i=0;i<n;i++)
		{
		       System.out.println(a[i]);
			
		}
		
		
	}
}

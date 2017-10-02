import java.util.Scanner;

public class Problem3 
{
public static void main(String args[])
{
	Problem3 pb3=new Problem3();
	System.out.println("enter a string");
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	char[] c=str.toCharArray();
	pb3.subsets(c);
}
public void subsets(char[] s)
{
	int n=s.length;
	for(int i=0;i<(1<<n);i++)
	{
		for(int j=0;j<n;j++)
		{
			if((i & (1<<j))>0)
				System.out.print(s[j]);
		}
		System.out.println();
	}
}
}

import java.util.Scanner;

public class Problem2 
{
	public void per(String str,int l,int r)
	{
	        if (l == r)
	            System.out.println(str);
	        else
	        {
	            for (int i = l; i <= r; i++)
	            {
	                str = swap(str,l,i);
	                per(str, l+1, r);
	                str = swap(str,l,i);
	            }
	        }  
	}
	 public String swap(String a, int i, int j)
	    {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }
public static void main(String args[])
{
	Problem2 pb2=new Problem2();
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	pb2.per(str,0,str.length()-1);
}
}

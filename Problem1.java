import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Problem1 implements booleanExpression
{
	 String str=new String();
	 String str1=new String();
	 public void getValue()
	 {
		 System.out.println("enter the expression");
		 Scanner s=new Scanner(System.in);
			str=s.nextLine();
			str1=str.replace("AND", "&&");
			str1=str1.replaceAll("OR", "||"); 
			str1=str1.toLowerCase();
			System.out.println(str1);
	 }

    public boolean EvaluateExpression(String s)
    {
    	ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
			return (boolean) engine.eval(s);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
    }
public static void main(String args[])
{
	Problem1 pb=new Problem1();
	pb.getValue();
	boolean res=pb.EvaluateExpression(pb.str1);	
	System.out.println("result of expression is : "+res);
}

}

package Interface.ex;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionEx 
{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String string = sc.next();
		//to find the square
		Function<Integer, Integer> f = s-> s*s;		
		Function<String, Integer> f2 = string1-> string1.length();	
		System.out.println(f.apply(n));
		System.out.println(f2.apply(string));
		
	}
}

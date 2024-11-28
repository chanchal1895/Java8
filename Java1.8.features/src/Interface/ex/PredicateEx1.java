package Interface.ex;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numlist = new ArrayList<>();
		
		numlist.add(12);
		numlist.add(15);
		numlist.add(98);
		numlist.add(35);
		numlist.add(56);
		numlist.add(87);
		
		
		System.out.println(numlist);
		for(int i :numlist) {
			Predicate<Integer> p=j->j%2==0 && j>50;
			if(p.test(i))
				System.out.println(i);
			
		}
		
		
		
		
	}

}

package Interface.exStram.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamEx {
	
	public static void main(String args[]) {
		ArrayList<Integer> numlist = new ArrayList<>();
		
		numlist.add(12);
		numlist.add(15);
		numlist.add(98);
		numlist.add(35);
		numlist.add(56);
		numlist.add(87);
		
		List<Integer> list = numlist.stream().filter(i->i%2==0 && i>50).collect(Collectors.toList());
		List<Integer> list1 = numlist.stream().map(i->i=i+5).collect(Collectors.toList());
		
		System.out.print(list1);
		
		
	}

}

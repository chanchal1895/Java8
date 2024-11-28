package java8.stream.Collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplictaes {
	public static void main(String[] args) {
		
		List<Employee> listOfEmp = new ArrayList<>();		
		listOfEmp.add(new Employee("Chanchal Kumar", 25));
		listOfEmp.add(new Employee("Chandan Kumar", 26));
		listOfEmp.add(new Employee("Chanchal Kumar", 25));
		listOfEmp.add(new Employee("Abhinash Kumar", 27));
		listOfEmp.add(new Employee("Chahal Kumar", 28));
		listOfEmp.add(new Employee("Rohitl Kumar", 26));
		listOfEmp.add(new Employee("Pranaw Kumar", 25));
		listOfEmp.add(new Employee("Chandan Kumar", 25));
		
		List<String> name = listOfEmp.stream().map(emp->emp.getName()).collect(Collectors.toList());
		Set<String> uniqueName = new HashSet<>();
		Set<String> duplicateSet=name.stream().filter(name1-> !uniqueName.add(name1)).collect(Collectors.toSet());
		System.out.println(duplicateSet);
		System.out.println(uniqueName);		
		
		//Using GroupingBy
		//Converting list of name into map using groupingBy
		Map<String, Long> map = listOfEmp.stream().map(emp->emp.getName()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		Set<String> listOfName=map.entrySet().stream().filter(entry-> entry.getValue()>1).map(entry-> entry.getKey()).collect(Collectors.toSet());
		System.out.println(listOfName);
		
		//Using Collection.frequency(List list)
		Set<String> set = name.stream().filter(name2 -> Collections.frequency(name, name2)>1)
				.collect(Collectors.toSet());
		System.out.println(set);
		
		
		String str = "chanchal";
	
		System.out.println("First way of finding unique and duplicate character in a string");
		
		Map<Character, Long> map1 = str.chars().mapToObj(c-> (char)c).collect( 
				Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
		System.out.println(map1.entrySet().stream().filter(entry->entry.getValue()==1).
				map(entry->entry.getKey()).skip(1).limit(1).collect(Collectors.toList()));
		
		System.out.println(map1);
		System.out.println( map1.entrySet().stream().filter(entry-> entry.getValue()==1).
				map(entry->entry.getKey()).collect(Collectors.toSet()));
		System.out.println(map1.entrySet().stream().
				filter(entry->entry.getValue()>1).map(entry->entry.getKey()).collect(Collectors.toSet()));
		
	
		
	}

}

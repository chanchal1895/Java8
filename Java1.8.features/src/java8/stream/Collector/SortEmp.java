package java8.stream.Collector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmp {
	static List<Employee> listOfEmp = new ArrayList<>();
	static int i =9;
	
	public static void main(String[] args) {
		
		i=10;
		listOfEmp.add(new Employee("Chanchal Kumar", 25,30000));
		listOfEmp.add(new Employee("Chandan Kumar", 26,4500));
		listOfEmp.add(new Employee("Chanchal Kumar", 25,2000));
		listOfEmp.add(new Employee("Abhinash Kumar", 27,31000));
		listOfEmp.add(new Employee("Chahal Kumar", 28,11000));
		listOfEmp.add(new Employee("Rohitl Kumar", 26,21000));
		listOfEmp.add(new Employee("Pranaw Kumar", 25,3100));
		listOfEmp.add(new Employee("Chandan Kumar", 25,55000));
		 listOfEmp = new ArrayList<>();
		
		List<Employee> list =  listOfEmp.stream().sorted((o1,o2)->(int)(o2.getSal()-o1.getSal())).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(list.stream().limit(3).collect(Collectors.toList()));
		System.out.print(list.stream().filter(emp->emp.getSal()>30000).collect(Collectors.toList()));
	}

}

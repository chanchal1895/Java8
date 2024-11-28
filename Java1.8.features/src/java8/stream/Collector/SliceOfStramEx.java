package java8.stream.Collector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SliceOfStramEx {
	
	public static void main(String[] args) {
		
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee("Chanchal Kumar", 25));
		listOfEmp.add(new Employee("Chandan Kumar", 26));
		listOfEmp.add(new Employee("Chanchal Kumar", 25));
		listOfEmp.add(new Employee("Abhinash Kumar", 27));
		listOfEmp.add(new Employee("Chahal Kumar", 28));
		listOfEmp.add(new Employee("Rohitl Kumar", 26));
		listOfEmp.add(new Employee("Pranaw Kumar", 25));
		
		//Q find the second and third smallest from the list.
		List<Integer> sortedList=listOfEmp.stream().map(emp->emp.getAge()).sorted().collect(Collectors.toList());
		System.out.println(sortedList.stream().skip(1).limit(2).collect(Collectors.toList()));
		//Q. Converting stream to uppercase and join them with coma.
		
		String empName = listOfEmp.stream().map(emp->emp.getName().toUpperCase()).collect(Collectors.joining(",  "));
		System.out.println(empName);
		
	}

}

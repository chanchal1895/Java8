package java8.stream.Collector;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryStatistics {
	public static void main(String[] args) {
		
	
	
	List<Employee> listOfEmp = new ArrayList<>();
	
	listOfEmp.add(new Employee("Chanchal Kumar", 25));
	listOfEmp.add(new Employee("Chandan Kumar", 26));
	listOfEmp.add(new Employee("Chanchal Kumar", 25));
	listOfEmp.add(new Employee("Abhinash Kumar", 27));
	listOfEmp.add(new Employee("Chahal Kumar", 28));
	listOfEmp.add(new Employee("Rohitl Kumar", 26));
	listOfEmp.add(new Employee("Pranaw Kumar", 25));
	//Q. Statistics Ex: Get Count, min, max, sum, and the average for the numbers.
	List<Integer> listOfAgeOfEmp = listOfEmp.stream().map(emp -> emp.getAge()).collect(Collectors.toList());
	IntSummaryStatistics summary =listOfAgeOfEmp.stream().mapToInt(x->x).summaryStatistics();
	summary.getMax();
	System.out.println("Max age"+summary.getMax());
	System.out.println("Min age"+summary.getMin());
	System.out.println("Average of age"+summary.getAverage());
	System.out.println(summary.getCount());
	System.out.println(summary.getSum());
	System.out.println(summary);
	

	}
}

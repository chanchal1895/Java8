package problemsSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Interface.exStram.ex.Employee;

public class SortOnSalary {
	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		Employee e1 = new Employee(100, "Chanchal Kumar", 101200, "M");
		Employee e2 = new Employee(101, "Chandani Kumari", 10500, "F");
		Employee e3 = new Employee(102, "Rishav Kumar", 20565, "M");
		Employee e4 = new Employee(103, "Jyoti Kumari", 30456, "F");
		Employee e5 = new Employee(104, "Moti Kumar", 340023, "M");
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		
		//Sorting the emp on the basis of salary in desc order
		List<Employee> list1 = empList.stream().sorted((o1, o2) -> (int) (o2.empSal - o1.empSal))
				.collect(Collectors.toList());
		System.out.println(list1);
		//Fetching top n employee having highest salary
		
		 list1 = empList.stream().sorted((o1, o2) -> (int) (o2.empSal - o1.empSal)).limit(3)
				.collect(Collectors.toList());
		 
		 System.out.println(list1);
		 
		 //Fetching all the  employee having salary less than 3rd highest salary
		 
		 list1 = empList.stream().sorted((o1,o2)->(int)(o2.empSal-o1.empSal)).skip(3).collect(Collectors.toList());
		 System.out.println(list1);
		 
		
		
	}

}

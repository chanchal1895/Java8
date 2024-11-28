package java8.stream.Collector;

//Sigle parameter groupingBy internally call 2 parameter grouping by but by default the second parameter 
// will be toList. If you want to convert it to Set then you have to use 2 parameter groupingBy. Similarly 
// 2 parameter groupingBy internally call 3 parameter groupingBy and by default it will convert your map into
// HashMap. To convert as per your choice of Map, for ex TreeMap, you have to use 3 paramer groupingBy.


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupByEx {
	
	public static void main(String[] args) {
		List<Employee> listOfEmp = new ArrayList<>();
		
		listOfEmp.add(new Employee("Chanchal Kumar", 25));
		listOfEmp.add(new Employee("Chandan Kumar", 26));
		listOfEmp.add(new Employee("Chanchal Kumar", 25));
		listOfEmp.add(new Employee("Abhinash Kumar", 27));
		listOfEmp.add(new Employee("Chahal Kumar", 28));
		listOfEmp.add(new Employee("Rohitl Kumar", 26));
		listOfEmp.add(new Employee("Pranaw Kumar", 25));
		
		//Single parameter groupingBy
		Map<Integer, List<Employee>> mapofEmp1 =listOfEmp.stream().collect(Collectors.groupingBy(emp-> emp.getAge()));
		//Double parameter groupingBy
		Map<Integer, Set<Employee>> mapofEmp2 =listOfEmp.stream().collect(Collectors.groupingBy(emp-> emp.getAge(),Collectors.toSet()));
		//3  parameter groupingBy
		Map<Integer, Set<Employee>> mapofEmp3 =listOfEmp.stream().collect(Collectors.groupingBy(emp-> emp.getAge(),TreeMap::new,Collectors.toSet()));		
		//System.out.println(mapofEmp);
		for( Entry<Integer, List<Employee>> entity:mapofEmp1.entrySet()) {
			System.out.println("With duplicate name");
			System.out.println(entity);
		}
		for( Entry<Integer, Set<Employee>> entity:mapofEmp2.entrySet()) {
			System.out.println("without duplicate name");
			System.out.println(entity);
		}
		for( Entry<Integer, Set<Employee>> entity:mapofEmp3.entrySet()) {
			System.out.println("Sorted map");
			System.out.println(entity);
		}
	}
}


class Employee{
	
	private String name;
	private int age;
	private long sal;
	
	
	public Employee(String name, int age, long sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	//If name is same then we have consider the employee as equal.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
}
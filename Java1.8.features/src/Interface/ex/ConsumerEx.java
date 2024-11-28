package Interface.ex;

import java.util.function.Consumer;

public class ConsumerEx {
	
	public static void main(String args[]) {
		
		Consumer<Employee> consumer = s1->{
			System.out.println("Student Name --"+ s1.empName);
			System.out.println("Salary--"+ s1.empSal);
			System.out.println("Gender--"+ s1.gender);
			
		};
		
		consumer.accept(new Employee(1001, "Rohit Sharma", 10500, "Male"));
		
	}

}

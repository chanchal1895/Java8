package Interface.ex;

import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.Predicate;

class Employee
{
	public int empId;
	public String empName;
	public double empSal;
	public String gender;
	
	public Employee(int empId, String empName, double empSal, String gender ) {
		// TODO Auto-generated constructor stub
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
		this.gender=gender;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", gender=" + gender + "]";
	}

	
	
}
public class PredicateEx2 {
	
	public static void main(String args[]) {
		
		List<Employee> empList = new ArrayList<>();
		Employee e1= new Employee(100, "Chanchal Kumar", 101200, "M") ;
		Employee e2= new Employee(101, "Chandani Kumari", 10500, "F") ;
		Employee e3= new Employee(102, "Rishav Kumar", 20565,"M") ;
		Employee e4= new Employee(103, "Jyoti Kumari", 30456,"F") ;
		Employee e5= new Employee(104, "Moti Kumar", 340023,"M") ;
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		java.util.function.Predicate<Employee> p = em -> em.empSal>25000 && em.gender.equals("M");
		
		for(Employee em :empList) {
			if(p.test(em))
				System.out.println(em.toString());
		}
	}

}

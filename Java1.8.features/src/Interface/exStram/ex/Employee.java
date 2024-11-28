package Interface.exStram.ex;

public class Employee
{
	private int empId;
	private String empName;
	public long empSal;
	public String gender;
	
	public Employee(int empId, String empName, long empSal, String gender ) {
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

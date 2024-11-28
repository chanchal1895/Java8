package Interface.ex;

import java.util.function.Function;

class student{
	public int stdId;
	public String name;
	public int marks;
	public String grade;
	public student(int stdId, String name, int marks) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.marks = marks;
	}
	
	
}
public class FunctionEx2
{
	public static void main(String args[])
	{
		Function<student,String> grade = s->{
			if(s.marks>=80) s.grade="Distinction";
			else if(s.marks>=60) s.grade="First";
			else if(s.marks>=45) s.grade="Second";
			else if(s.marks>=45) s.grade="Third";
			else  s.grade="Failed";
			return s.grade;
		};
		
		System.out.println(grade.apply(new student(1,"Chanchal Kumar",89)));
	}
}

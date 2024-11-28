package Interface.exStram.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;





public class StreamEx2 {
	public static void main(String args[]) {
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
		
		

		// 1. filter() & 2. collect() example
		List<Employee> list = empList.stream()
				.filter(em -> em != null && em.gender != null && em.empSal > 25000 && em.gender.equals("M"))
				.collect(Collectors.toList());
		System.out.println(list);

		// 3.map() example
		List<Employee> list1 = empList.stream().map(em -> em).collect(Collectors.toList());
		System.out.println(list1);
		System.out.println(list.stream().count());
		long count = list1.stream().count();
		System.out.println(list1.stream().count());

		// 4.count() example
		long maleEmp = empList.stream().filter(em -> em.gender.equals("M")).count();
		System.out.println(maleEmp);

		// 5.sorted() example

		ArrayList<Integer> numlist = new ArrayList<>();
		numlist.add(12);
		numlist.add(15);
		numlist.add(98);
		numlist.add(35);
		numlist.add(56);
		numlist.add(87);
		System.out.println(numlist.stream().min((i1,i2)->i1.compareTo(i2)).get());

		// natural sorting
		List<Integer> sortedList = numlist.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		List<Integer> sortedList1 = numlist.stream().sorted((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0))
				.collect(Collectors.toList());
		System.out.println(sortedList1);

		//6.min() & max()
		
		
		numlist.stream().forEach(System.out::println);
		
	}
}


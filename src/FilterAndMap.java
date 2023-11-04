import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterAndMap 
{
	public static void main(String[] args)   
	{
		
			
			List<Student> lst=new ArrayList<>();
			lst.add(new Student(1, "sharan", Stream.of("java","sql").collect(Collectors.toList()))); 
			lst.add(new Student(2, "basava", Stream.of("Math","sql").collect(Collectors.toList()))); 
			lst.add(new Student(3, "manthu", Stream.of("java","Kannada").collect(Collectors.toList()))); 
			lst.add(new Student(4, "Dee", Stream.of("Kannada","English").collect(Collectors.toList()))); 


			System.out.println(lst);
			System.out.println("=========================================");
			String targetSub="Kannada";
			List<Student> FilteredStu=lst.stream().filter(stu -> stu.getSid()>2 && stu.getSco().contains(targetSub)).collect(Collectors.toList());

		System.out.println(FilteredStu);

		for (Student student : FilteredStu) {
			student.getSco().add("Science");		
			}
		System.out.println("===========================================");
		System.out.println(FilteredStu);
	}
	
	
}
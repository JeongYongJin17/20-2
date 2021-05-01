package job_12;
import java.util.*;

class Student implements Comparable<Student>{
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name =name;
	}
	
	public String toString() {
		return name;
	}
	public int compareTo(Student s) {
		return s.number - number;
	}
}

public class SortTest {
	public static void main(String[] args) {
		Student array[]= {
				new Student(2, "김철수"),
				new Student(3, "이철수"),
				new Student(1, "박철수"),
				
		};
		List<Student> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list);
	}

}

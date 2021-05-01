package job_12;
import java.util.*;

class Studenta{
	int number;
	String name;
	
	public Studenta(int number,String name) {
		this.number = number;
		this.name = name;
	}
	public String toString() { return name;}
}

public class SortTest2 {

	public static void main(String[] args) {
		Studenta array[]= {
				new Studenta(2, "김철수"),
				new Studenta(3, "이철수"),
				new Studenta(1, "박철수"),
				
		};
		List<Studenta> list = Arrays.asList(array);
		Collections.sort(list,(Studenta s1, Studenta s2)->{return (s1.number-s2.number);});
		
		System.out.println(list);
	}

}

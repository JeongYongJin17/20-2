package job_12;
import java.util.*;

public class VectorExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>(2);
		
		vec.add("Apple");
		vec.add("ORange");
		vec.add("Mango");
		
		System.out.println("∫§≈Õ¿« ≈©±‚: "+ vec.size());
		Collections.sort(vec);
		
		for(String s : vec)
			System.out.print(s +" ");
	}

}

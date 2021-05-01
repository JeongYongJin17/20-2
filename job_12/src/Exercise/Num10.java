package Exercise;

import java.util.*; 

public class Num10<T> {
	
	Random r = new Random(); 
	String[] sample = {"i", "walk", "the", "line"}; 
	List<T> list = (List<T>) Arrays.asList(sample);
	
	public void add(T item) {
		list.add(item);
	}
	public T select() {
		int num = r.nextInt(list.size()); 
		return list.get(num);
	}
	
	public Num10() {
		System.out.println(select());
	}
	public static void main(String[] args) {
		Num10<String> p = new Num10<String>();
	}
}
package Exercise;
import java.util.*;


public class Num9 {
	public String toString() {
		return " Lotto [set=" + set+"]";
	}
	
	HashSet<Integer> set = new HashSet<Integer>();
	
	public Num9() {
		int d;
		for(int i = 0; i< 6; i++) {
			do {
				d = (int)(Math.random() * 44.0 + 1.0);
			}while (set.contains(d));
			set.add(d);
		}
	}
	
	public static void main(String[] args) {
		Num9 lotto = new Num9();
		System.out.println(lotto);

	}

}

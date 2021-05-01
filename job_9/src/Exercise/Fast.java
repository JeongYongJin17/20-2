package Exercise;

import java.util.*;

public class Fast {
	public static void main(String[] args) {
		
		double mile;
		double km;
		
		System.out.print("마일을 입력하시오:");
		Scanner sc = new Scanner(System.in);
		
		mile=sc.nextDouble();
		km = 1.609344*mile;
		
		System.out.print(""+km);
	}

}

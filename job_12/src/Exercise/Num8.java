package Exercise;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Num8 {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.print("심사위원의 점수: ");
			double value = sc. nextDouble();
			list.add(value);
		}
		
		double max = Collections.max(list);
		double min = Collections.min(list);
		double sum = 0.0;
		double value = 0.0;
		for(int i =0; i<10; i++) {
			value = list.get(i);
			if(value != min && value != max)
				sum += value;
		}
		System.out.print("점수의 합: " + sum);
	}
}

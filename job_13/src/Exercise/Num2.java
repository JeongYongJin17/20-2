package Exercise;

import java.io.*;
import java.util.*;

public class Num2 {
	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		File file1 = new File("D:\\javajpg\\20-2\\number.txt");
		
		BufferedReader in = (new BufferedReader (new FileReader(file1)));
		
		String get_text = in.readLine();
		
		
		
		while(get_text != null) {
			int number=Integer.parseInt(get_text);
			list.add(number);
			get_text = in.readLine();
		}
		
		int arr[] = new int[list.size()];
		
		for(int i = 0; i < list.size(); i ++) {
			arr[i] = list.get(i);
		}
		
		Arrays.sort(arr);
		
		
		for(int i : arr) {
			System.out.println(i);
		}
		in.close();
	}
}

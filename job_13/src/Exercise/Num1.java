package Exercise;
import java.io.*;
import java.util.*;

public class Num1 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("D:\\javajpg\\hey.txt");
		File file2 = new File("D:\\javajpg\\heyout.txt");
		
		char CharCounter = 0;
		
		BufferedReader in = (new BufferedReader(new FileReader(file1)));
		PrintWriter out = (new PrintWriter(new FileWriter(file2)));
		
		int ch;
		
		while((ch=in.read())!= -1) {
			if (Character.isLowerCase(ch)) {
				ch=Character.toUpperCase(ch);
			}
			out.write(ch);
		}
		
		in.close();
		out.close();
	}

}

package Exercise;

import java.io.*;
import java.io.IOException;
import java.util.*;

public class Num7 {
	public static void main(String[] args) {
		try {
			File f = new File("D:\\javajpg\\input.txt");
			
			Scanner sc;
			sc = new Scanner(f);
			Map<String,Integer> wordCount = new TreeMap<String,Integer>();
			while(sc.hasNext()) {
				String word = sc.next();
				
				if(!wordCount.containsKey(word))
					wordCount.put(word, 1);
				else
					wordCount.put(word, wordCount.get(word) +1);
			}
			for(String word : wordCount.keySet())
				System.out.println(word + "-->" + wordCount.get(word));
			System.out.println("전체 단어 수 : "+ wordCount.size());
		}
		catch(IOException e) {
			System.out.println("Unable to read form file.");
		}
	}
}

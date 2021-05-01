package Exercise;
import java.io.*;
import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;


public class Num3 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\javajpg\\hey.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fr1 = new FileWriter("D:\\javajpg\\heyline.txt");
			PrintWriter br1 = new PrintWriter(fr1);
			
			int counter =0;
			while (true) {
				counter++;
				String line = br.readLine();
				if(line ==null)
					break;
				br1.println(""+counter+":"+line);
				System.out.println(""+ counter + ":"+ line);
			}
			fr.close();
			br1.flush();
			fr1.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

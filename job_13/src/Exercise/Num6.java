package Exercise;
import java.io.FileReader;

public class Num6 {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("D:\\javajpg\\input.txt");
		int value;
		byte key = 19;
		int value2 = 0;
		
		while ((value=fr.read()) != -1) {
			value2 = value^key;
			//value2 = value2^key;
			System.out.print((char) value2);	
		}
		fr.close();
	}

}

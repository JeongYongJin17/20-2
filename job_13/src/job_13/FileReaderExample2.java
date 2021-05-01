package job_13;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {

	public static void main(String[] args) throws Exception{
		try(FileReader fr = new FileReader("D:\\javajpg\\input.txt")){
		int ch;
		while ((ch=fr.read()) != -1)
			System.out.print((char) ch);
	} catch(IOException e) {
		e.printStackTrace();
	}
	}

}

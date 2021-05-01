package job_13;
import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("D:\\javajpg\\input.txt");
		int ch;
		while((ch = fr.read())!= -1)
			System.out.print((char) ch);
		fr.close();
	}

}

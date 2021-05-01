package job_13;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile1 {

	public static void main(String[] args) throws Exception{
		try (FileReader fr = new FileReader("D:\\javajpg\\input.txt");
				FileWriter out = new FileWriter("D:\\javajpg\\copy.txt")){
		int ch;
		while ((ch=fr.read()) != -1) {
		out.write(ch);
	}

	}
	}
}

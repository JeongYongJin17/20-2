package job_13;
import java.io.*;

public class FileStreamTest {

	public static void main(String[] args){
		byte list[] = {10,20,30,40,50,60};
		try(FileOutputStream out = new FileOutputStream("D:\\javajpg\\test.bin")){
			for (byte b:list)
				out.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

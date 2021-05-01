package job_13;
import java.io.*;
import java.util.*;

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException{
		
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		try {
			int c;
			
			out = new ObjectOutputStream(new FileOutputStream("D:\\javajpg\\object.dat"));
			out.writeObject(new Date());
			
			out.flush();
			in = new ObjectInputStream(new FileInputStream("D:\\javajpg\\object.dat"));
			Date d = (Date) in.readObject();
			System.out.println(d);
			
		}catch (ClassNotFoundException e) {
			
		}finally {
			if(in !=null) {
				in.close();
				
			}
		if (out != null) {
			out.close();
		}
		}
		

	}

}

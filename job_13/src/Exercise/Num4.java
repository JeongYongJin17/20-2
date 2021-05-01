package Exercise;
import java.io.*;
import java.util.*;
public class Num4 {

	public static void main(String[] args) throws FileNotFoundException{
		boolean equal=true;
		
		FileInputStream fr1 = new FileInputStream("D:\\javajpg\\hey.txt");
		FileInputStream fr2 = new FileInputStream("D:\\javajpg\\hey1.txt");
		
		while(true) {
			try {
				byte c1 = (byte) fr1.read();
				byte c2=(byte) fr2.read();
				if(c1==1|| c2==-1)
					break;
				if(c1!=c2) {
					equal = false;
					break;
				}
			}catch (IOException e) {
				break;
			}
		}
		if(equal==true)
			System.out.println("2개의 파일이 일치합니다.");
		else
			System.out.println("2개의 파일이 일치하지 않습니다.");
		try {
			fr1.close();
			fr2.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}

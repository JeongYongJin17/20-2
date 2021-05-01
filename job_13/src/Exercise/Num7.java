package Exercise;
import java.io.*; 
import java.util.*;

public class Num7 {
public static void main(String[] args)throws IOException {

	int num2; 
	String search; 
	String num, name, tel, email;
	Scanner scan = null;
	
	PrintWriter in = new PrintWriter(new FileWriter("D:\\javajpg\\20-2\\diary.txt"));
	Scanner s = new Scanner(System.in);
	while(true) {
		System.out.println("사용자 번호를 입력하세요"); 
		num = s.next(); 
		System.out.println("사용자 이름을 입력하세요"); 
		name = s.next(); 
		System.out.println("사용자 전화번호를 입력하세요"); 
		tel = s.next(); 
		System.out.println("사용자 이메일을 입력하세요"); 
		email= s.next(); 
		System.out.println("입력이 끝났으면 1 계속 입력하시려면 0"); 
		num2 = s.nextInt(); 
		in.print(num + "," + name + "," + tel + "," + email+""); 
		in. flush(); if(num2 == 1)
			break;
	}
	System.out.println("검색하실 사용자 번호를 입력하세요");
	num2 = s.nextInt(); 
	search = num2+"";
	scan = new Scanner(new BufferedReader(new FileReader("D:\\javajpg\\20-2\\diary.txt"))); 
	scan.useDelimiter(","); 
	while(scan.hasNext()){
		num = scan.next(); 
		name = scan.next(); 
		tel = scan.next(); 
		email = scan.next(); 
		if(num.equals(search))
			System.out.println("사용자 번호 : "+num2+"의 전화번호는"+tel +"입니다.");
	}
	if(in!= null)
		in.close(); if(scan !=null)
			scan.close();
	}
}

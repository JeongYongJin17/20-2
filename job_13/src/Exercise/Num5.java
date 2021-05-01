package Exercise;
import java.io.*;
import java.util.*;

public class Num5 {
	
	public static void main(String[] args) throws IOException{
		ArrayList<String> list = new ArrayList<>();
		char my;
		
		BufferedReader in = new BufferedReader(new FileReader("D:\\javajpg\\word.txt"));
		
		
		String word="";
		
		for( int i =0; (word = in.readLine())!=null; i++)		
		list.add(word);
		
		
		Random r = new Random();
		
		int nub=r.nextInt(list.size());
		String ans=list.get(nub);
		
		char[] ch= new char[ans.length()];
		//ans는 저장된 문자열
		for(int i=0; i<ch.length;i++) {
			ch[i]=ans.charAt(i);
		}
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		char[] blank= new char[ans.length()];
		for(int i=0;i<blank.length; i++) {
			blank[i]='_';
		}
		
		System.out.print("현재의 생태:");
		for(int i =0; i<blank.length;i++)
			System.out.print(blank[i]);
		System.out.println("");
		while(true) {
			System.out.print("글자를 추측하시오: ");	
			my = scanner.next().charAt(0);
		for(int i=0; i<ch.length; i++) {
			
			if(my==ch[i]) {
			blank[i]=ch[i];
		}
	}
		System.out.print("현재의 상태: ");
		for(int a=0; a<blank.length;a++)
			System.out.print(blank[a]);
	System.out.println("");
	
	int check=0;
	int check2=1;
	for(int i =0; i<blank.length;i++) {
		if(blank[i]!='_')
			check =1;
		else check2 = 0;
	}
	
	int check3=check2*check;
	if(check3==1)
		break;
		}
		
		/*while(int blank ==0) {
			
		}*/

		
	System.out.println(ans);
	}

}

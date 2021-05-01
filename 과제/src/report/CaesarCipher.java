package report;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;



public class CaesarCipher {

	public static void main(String[] args) throws IOException{
		//텍스트 파일을 불러온다.
		FileReader fr = new FileReader("D:\\javajpg\\input.txt");
		//불러온 파일을 한줄씩 읽는다.
		BufferedReader br = new BufferedReader(fr);
		//읽은 한줄을 문자열로 저장
		String plaintext = br.readLine();
		//암호화 한 것을 콘솔창에 출력
		System.out.println(CaesarCipher.encode(plaintext, 3));
		//복호화 한 것을 콘솔창에 출력
		System.out.println(CaesarCipher.decode(
				CaesarCipher.encode(plaintext, 3),3));
		fr.close();
	}
	//암호화 실행
	private static String encode(String plaintext, int i) {
		String answer = " ";//암호를 받을 문자열
		//암호화할 문자열의 길이만큼 반복
		for(int n=0; n<plaintext.length();n++) {
			//한글자씩 가져온다.
			char alpha = plaintext.charAt(n);
			//글자가 소문자이면
			if(alpha >='a'&& alpha<='z') {
				//i번째 다음 문자열이 z를 넘어가면 다시 a부터
				if(alpha +i>'z')answer +=(char)(alpha +i-26);
				//아니라면 그냥 i번째의다음의 문자
				else answer +=(char)(alpha +i);
			}//글자가 대문자일 경우 위와 마찬가지
			else if(alpha >= 'A' && alpha <= 'Z') {
				if(alpha + i > 'Z') answer += (char)(alpha + i-26);
				else answer += (char)(alpha + i);
			}
		}
		return answer;
	}
	
	private static String decode(String encode, int i) {
String answer = " ";
		//암호와한 문자열의 길이만큼 반복
		for(int n=0; n<encode.length();n++) {
			//한글자씩 가져온다
			char alpha = encode.charAt(n);
			//소문자일 경우
			if(alpha >='a'&& alpha<='z') {
				//i번째 이전의 문자가 a를 넘어가면 z부터
				if(alpha -i<'a')answer +=(char)(alpha -i+26);
				//특수한 경우가 아니라면 i번째 이전의 문자
				else answer +=(char)(alpha -i);
			}//대문자일 경우 위와 마찬가지로 실행
			else if(alpha >= 'A' && alpha <= 'Z') {
				if(alpha - i < 'A') answer += (char)(alpha - i+26);
				else answer += (char)(alpha - i);
			}
		}
		return answer;
	}
}

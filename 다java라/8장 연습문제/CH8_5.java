import java.io.*;
import java.util.*;

public class CH8_5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStream fin1,fin2;
		String fileroute = "C:\\Users\\kidre\\OneDrive\\Desktop\\";
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다. ");
		System.out.print("첫번째 파일 이름을 입력하세요>> ");
		String file1 = scanner.next();
		System.out.print("두번째 파일 이름을 입력하세요>> ");
		String file2 = scanner.next();
		
		try {
		fin1 = new FileInputStream(fileroute.concat(file1));
		fin2 = new FileInputStream(fileroute.concat(file2));
		int c,d;
		int correct=0;
		System.out.println(file1+"와 "+file2+"를 비교합니다.");
		while((c = fin1.read())!= -1 && (d = fin2.read())!=-1) {
			if((char)c == (char)d) {
				correct = 1;
			}
			else {
				correct =0;
			}
		}
		if(correct == 1) {
			System.out.println("파일이 같습니다!");
		}
		else {
			System.out.println("파일이 다릅니다!");
		}
		fin1.close();
		fin2.close();
		}
		catch(IOException e) {
			System.out.println("경로명이 이상합니다 채크해주세요");
		}
	}
}

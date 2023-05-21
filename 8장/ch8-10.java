import java.io.*;
import java.util.*;

 public class Main {
	 public static void main(String[] args) {
		 try {
			 HashMap<String, String> phone = new HashMap<String, String>();
			 FileReader fr = new FileReader("phone.txt");
			 Scanner s = new Scanner(fr);
			 String temp;

			 while(s.hasNext())
			 {
				 String n1 = s.next();
				 String n2 = s.next();
				 phone.put(n1, n2);
			 }
			 System.out.println("총 " + phone.size() + "개의 전화번호를 읽었습니다.");
			 s.close();
			 
			 s = new Scanner(System.in);
			 while(true) {
				 System.out.print("이름>> ");
				 temp = s.next();
				 System.out.println(temp);
				 
				 if(temp.equals("그만")) break;
				 
				 String tel = phone.get(temp);
				 if(tel == null) System.out.println("찾는 이름이 없습니다.");
				 else System.out.println(tel);
			 }
		 }
		 
		 catch(IOException e) {
			 System.out.println("파일의 경로가 잘못되었습니다.");
		 }
		 
	 }
} 
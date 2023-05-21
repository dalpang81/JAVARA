import java.io.*;
import java.util.*;

 public class Main {
	 public static boolean compare(FileInputStream f1, FileInputStream f2) throws IOException {
		 byte b1[] = new byte[1024];
		 byte b2[] = new byte[1024];
		 
		 int n1 = 0, n2 = 0;
		 
		 while(true)
		 {
			 n1 = f1.read(b1, 0, b1.length);
			 n2 = f2.read(b2, 0, b2.length);
			 
			 if(n1 != n2) return false;
			 
			 if(n1 == -1) break;
			 
			 for(int i = 0; i < n1; i++)
			 {
				 if(b1[i] != b2[i]) return false;
			 }
		 }
		 return true;
	 }
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 

		 
		 System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		 System.out.print("첫번째 파일 이름을 입력하세요>>");
		 String file1 = s.nextLine();
		 System.out.print("두번째 파일 이름을 입력하세요>>");
		 String file2 = s.nextLine();
		 
		 try {
			 FileInputStream fin1 = new FileInputStream(file1);
			 FileInputStream fin2 = new FileInputStream(file2);


			 
			 System.out.println(file1 + "와 " + file2 + "를 비교합니다.");
			 if(compare(fin1, fin2)) System.out.println("파일이 같습니다.");
			 else System.out.println("파일이 서로 다릅니다.");

			 
			 fin1.close();
			 fin2.close();

		 }
		 
		 
		 
		 catch(IOException e)
		 {
			 System.out.println("파일을 읽지 못헀습니다. 경로명을 체크해보세요.");
		 }
		 
	 }
} 
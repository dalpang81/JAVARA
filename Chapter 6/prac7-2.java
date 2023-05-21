import java.util.*;
import java.io.*;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String input = sc.nextLine();
			
			if(input.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			
			int count = 0;
			String[] sArr = input.split(" ");
			for(int i = 0; i < sArr.length; i++)
				count++;
			System.out.println("어절 개수는 " + count);
		}
		
		sc.close();
	}

}

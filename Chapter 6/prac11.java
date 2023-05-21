import java.util.*;
import java.io.*;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">>");
		String input = sc.nextLine();
		StringBuffer str = new StringBuffer(input);
		
		while(true) {
			System.out.print("명령: ");
			String command = sc.nextLine();
			if(command.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			
			String[] cArr = command.split("!");
			if((cArr.length != 2) || (cArr[0].length() == 0 || cArr[1].length() == 0)) {
				System.out.println("잘못된 명령입니다!");
				continue;
			}
			
			int index = str.indexOf(cArr[0]);
			if(index == -1)
				System.out.println("찾을 수 없습니다!");
			else {
				str.replace(index, index + cArr[0].length(), cArr[1]);
				System.out.println(str);
			}
			
		}
		
		sc.close();
	}

}

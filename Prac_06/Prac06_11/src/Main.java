import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">>");
		String str = scanner.nextLine();
		StringBuffer sb = new StringBuffer(str);
		while(true) {
			System.out.print("명령: ");
			String a = scanner.next();
			
			if(a.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}	
			String tokens[] = a.split("!");
			
			if(tokens.length!=2)
				System.out.println("잘못된 명령입니다!");
			else {
				if(tokens[0].length()==0 || tokens[1].length()==0) {
					System.out.println("잘못된 명령입니다!");
					continue;
				}
				
				int search = sb.indexOf(tokens[0]);
				if(search == -1) {
					System.out.println("찾을 수 없습니다!");
					continue;
				}
				
				sb.replace(search, search+tokens[0].length(), tokens[1]);
				System.out.println(sb.toString());
			}
		}
	}
}

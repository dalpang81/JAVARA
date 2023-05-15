import java.util.*;
/*
public class ch6_7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s;
		while(true) {
	    s = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
		if(s.equals("그만")) {
			break;
		}
		System.out.println("어절의 개수는 "+st.countTokens());
		
		}
		System.out.println("종료합니다...");
	}

}
*/
public class ch6_7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s;
		while(true) {
			s = scanner.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			System.out.println("어절 개수는 "+s.split(" ").length);
		}
	}

}

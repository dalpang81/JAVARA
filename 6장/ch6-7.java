import java.util.*;


/* public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String str = s.nextLine();
			if(str.equals("그만")) {
				System.out.println("종료합니다...");	
				break;
			}
			StringTokenizer st = new StringTokenizer(str, " ");	
			System.out.println("어절 개수는 " + st.countTokens());
		}
	}
} */

 public class Main {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	while(true) {
		System.out.print(">>");
		String str = s.nextLine();
		if(str.equals("그만")) {
			System.out.println("종료합니다...");	
			break;
		}
		String[] words = str.split(" ");
		System.out.println("어절 개수는 " + words.length);
	}
}
} 
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String str=scanner.nextLine();
			if(str.equals("그만")) {
				System.out.println("종료합니다~");
				break;
			}
			else {
				/*StringTokenizer st = new StringTokenizer(str);
				System.out.println("어절 개수는 "+st.countTokens());*///(1) StringToknizer로 풀어보기
				String StringArray[] =str.split(" ");
				System.out.println("어절 개수는 "+StringArray.length);
			}
		}
	}
}

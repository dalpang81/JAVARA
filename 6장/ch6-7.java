import java.util.*;


/* public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String str = s.nextLine();
			if(str.equals("�׸�")) {
				System.out.println("�����մϴ�...");	
				break;
			}
			StringTokenizer st = new StringTokenizer(str, " ");	
			System.out.println("���� ������ " + st.countTokens());
		}
	}
} */

 public class Main {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	while(true) {
		System.out.print(">>");
		String str = s.nextLine();
		if(str.equals("�׸�")) {
			System.out.println("�����մϴ�...");	
			break;
		}
		String[] words = str.split(" ");
		System.out.println("���� ������ " + words.length);
	}
}
} 
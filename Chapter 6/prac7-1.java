import java.util.*;
import java.io.*;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String input = sc.nextLine();
			
			if(input.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}
			
			int count = 0;
			StringTokenizer st = new StringTokenizer(input, " ");
			int n = st.countTokens();
			for(int i = 0; i < n; i++)
				count++;
			System.out.println("���� ������ " + count);
		}
		
		sc.close();
	}

}

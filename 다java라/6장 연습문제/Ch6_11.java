import java.util.Scanner;

public class Ch6_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		StringBuffer sb = new StringBuffer(s);
		while(true) {
			System.out.print("명령: ");
			String a = scanner.next();
			if(a.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			String[] SB = a.split("!");
			if(SB.length != 2||(SB[0].length()==0)||(SB[1].length()==1)){
				System.out.println("잘못된 명령입니다!");
			}
			else if(s.contains(SB[0])){
				sb = sb.replace(sb.indexOf(SB[0]),sb.indexOf(SB[0])+SB[0].length(), SB[1]);
				System.out.println(sb.toString());
			}
			else {
				System.out.println("찾을 수 없습니다.");
			}
			
		}

	}

}

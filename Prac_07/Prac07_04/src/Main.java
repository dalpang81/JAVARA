import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Vector<Integer>rains = new Vector<>();
		int n=1;
		int avg=0;
		while(n!=0) {
			System.out.print("강수량 입력 (0입력시 종료)>>");
			n=scanner.nextInt();
			if(n==0) {
				break;
			}
			else {
				rains.add(n);
				for(int i:rains) {
					System.out.print(String.valueOf(i)+" ");
					avg+=i;
				}
				System.out.println();
				System.out.println("현재 평균 "+avg/rains.size());
				avg=0;
			}
		}
	}
}

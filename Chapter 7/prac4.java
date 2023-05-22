import java.util.*;
import java.io.*;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		while(true) {
			int sum = 0;
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int rainfall = sc.nextInt();
			
			if(rainfall == 0) break;
			v.add(rainfall);
			
			Iterator<Integer> it = v.iterator();
			while(it.hasNext()) {
				rainfall = it.next();
				System.out.print(rainfall + " ");
				sum += rainfall;
			}
			System.out.println("\n현재 평균 " + sum / v.size());
		}
		
		sc.close();
	}

}

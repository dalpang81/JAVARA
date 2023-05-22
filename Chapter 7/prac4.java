import java.util.*;
import java.io.*;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		while(true) {
			int sum = 0;
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			int rainfall = sc.nextInt();
			
			if(rainfall == 0) break;
			v.add(rainfall);
			
			Iterator<Integer> it = v.iterator();
			while(it.hasNext()) {
				rainfall = it.next();
				System.out.print(rainfall + " ");
				sum += rainfall;
			}
			System.out.println("\n���� ��� " + sum / v.size());
		}
		
		sc.close();
	}

}

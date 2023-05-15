import java.util.*;
public class ch7_4 {

	public static void main(String[] args) {
		Vector<Integer> v= new Vector<Integer>();
		Scanner s= new Scanner(System.in);
		
		while(true) {
			
			System.out.print("강수량 입력 (0 입력시 종료)>>");
			int n= s.nextInt();
			if(n==0) {
				break;
			}
			v.add(n);
			int avg=0;
			for(int i=0;i<v.size();i++) {
				System.out.print(v.get(i)+" ");
				avg+=v.get(i);
				
			}
			System.out.println();
			System.out.println("현재 평균 "+avg/v.size());
		}
		s.close();
	}

}


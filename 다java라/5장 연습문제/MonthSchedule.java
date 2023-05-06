import java.util.*;
// 자바 실습문제 4장 7번 
class Day{
	private String work;
	public void set(String work) {this.work =work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}
public class MonthSchedule {
	Day day[];
	Scanner scanner = new Scanner(System.in);
	public MonthSchedule(int days) {
		day = new Day[days];
		for(int i=0;i<days;i++) {
			day[i] = new Day();
		}
	}
	
	public void input() {
		System.out.print("날짜(1~30)?");
		int date = scanner.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String doing = scanner.next();
		day[date].set(doing);
	}
	
	public void view() {
		System.out.print("날짜(1~30)?");
		int date = scanner.nextInt();
		System.out.print(date+"일의 할일은 ");
	    day[date].show();
	}
	
	public void finish(){
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		int count;
		System.out.println("이번달 스케쥴 관리 프로그램.");
		do {
		System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
		count = scanner.nextInt();
		switch(count) {
		case 1:
			input();
			break;
		case 2:
			view();
			break;
		case 3:
			finish();
			break;
		}
		System.out.println();
		}while(count !=3);
	}
	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}

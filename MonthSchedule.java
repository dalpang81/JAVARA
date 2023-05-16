import java.util.*;
public class MonthSchedule {
	private Day[] days;
	private int date;
	private String work;
	public Scanner scanner= new Scanner(System.in);
	public MonthSchedule(int n) {
		days=new Day[n];	
		this.date=n;
		for(int i=0;i<n;i++) {
			days[i]=new Day();
		}
	}
	public void input() {
		System.out.print("날짜(1~"+date+")");
		int dates=scanner.nextInt();
		System.out.println("할일 빈칸없이 입력?");
		work=scanner.next();
		days[dates-1].set(work);
	}
	public void view() {
		System.out.print("날짜(1~"+date+")");
		int dates=scanner.nextInt();
		System.out.print(date+"일의 할 일은");
		days[dates-1].show();
	}
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(true) {
		System.out.print("할일(입력: 1, 보기:2, 끝내기:3 )>>");
		int num=scanner.nextInt();
		switch(num) {
		case 1: input(); break;
		case 2: view(); break;
		case 3:finish(); return;
			}
		}
	}
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}
class Day{
	private String work;
	public void set(String work) {this.work=work;}
	public String get() {return work;}
	public void show() {
		if(work ==null) System.out.println("없습니다.");
		else System.out.println(work+"입니다.");
	}
}

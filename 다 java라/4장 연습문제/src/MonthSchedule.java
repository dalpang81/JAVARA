import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) { this.work= work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다");
	}
	
}

public class MonthSchedule {
	public Scanner s = new Scanner(System.in);
	private Day days[];
	public MonthSchedule(int day){
		this.days= new Day[day];
		for(int i=0;i<days.length;i++) {
			days[i]= new Day();
		}
	}
	public void input() {
		System.out.print("날짜(1~30)?");
		int day= s.nextInt();
		System.out.print("할일(빈칸없이 입력)");
		String work= s.next();
		if(day<0||day>30) {
			System.out.println("날짜를 잘못 입력"); return;
		}
		days[day].set(work);
	}
	public void view() {
		System.out.print("날짜(1~30)?");
		int day= s.nextInt();
		if(day<0||day>30) {
			System.out.println("날짜를 잘못 입력"); return;
		}
		System.out.print(day+"일의 할 일은 ");
		days[day].show();
		
	}
	public void finish() {
		System.out.println("프로그램을 종료");
		s.close();
	}
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(true) {
			System.out.println("이번달 스케쥴 관리 프로그램");
			while(true) {
			System.out.print("할일(입력: 1, 보기:2, 끝내기:3 )>>");
			int num=s.nextInt();
			switch(num) {
			case 1: input(); break;
			case 2: view(); break;
			case 3:finish(); return;
		}
			}
		}
	}
	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();

	}

}

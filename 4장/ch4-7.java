import java.util.*;

class MonthSchedule
{
	Day[] days;
	int day;
	String todo;
	
	MonthSchedule(int day) {
	      this.days = new Day[day];
	      for(int i=0; i<days.length; i++) {
	         days[i] = new Day();
	      }
	}
	
	void input() 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("날짜(1~30)?");
		day = s.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		todo = s.next();
	      day--;
	      if(day < 0 || day > 30) { // 0~29
	         System.out.println("날짜를 잘못 입력하였습니다.");
	         return;
	      }
	      days[day].set(todo);
	 }
	
	
	void view() 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("날짜(1~30)?");
		day = s.nextInt();
		day--;
	      if(day < 0 || day > 30) { // 0~29
	          System.out.println("날짜를 잘못 입력하였습니다.");
	          return;
	       }
	       System.out.print((day+1)+"일의 할 일은 ");
	       days[day].show();
	}
	
	
	void finish() 
	{
		System.out.print("프로그램을 종료합니다.");
	}
	void run() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("이번달 스케쥴 관리 프로그램.");
		
		while(true) {
	         System.out.println();
	         System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
	         int select = s.nextInt();
	         switch(select) {
	         case 1: input(); break;
	         case 2: view(); break;
	         case 3: finish(); return;
	         }
	      }
	}
}

class Day
{
	private String work;
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}

public class Main {
	public static void main(String[] args) {

		
		MonthSchedule monthSchedule = new MonthSchedule(30);
		monthSchedule.run();
		


	}
}
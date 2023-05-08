import java.util.*;

class Day {
	private String work;
	public void set(String work) { this.work = work; }
	public String get() { return this.work; }
	public void show()
	{
		if(this.work == null) System.out.println("없습니다.");
		else System.out.println(this.work + "입니다.");
	}
}

class MonthSchedule {
	private Day[] day;
	private Scanner sc = new Scanner(System.in);
	
	public MonthSchedule(int n)
	{ 
		day = new Day[n];
		for(int i = 0; i < n; i++)
			day[i] = new Day();
	}
	
	private void input()
	{
		System.out.print("날짜(1~" + day.length + ")?");
		int date = sc.nextInt();
		if(date < 1 || date > day.length)
		{
			System.out.println("잘못된 입력입니다.\n");
			return;
		}
		System.out.print("할일(빈칸없이 입력)?");
		String tmp = sc.next();
		day[date - 1].set(tmp);
	}
	
	private void view()
	{
		System.out.print("날짜(1~" + day.length + ")?");
		int date = sc.nextInt();
		if(date < 1 || date > day.length)
		{
			System.out.println("잘못된 입력입니다.\n");
			return;
		}
		System.out.print(date + "일의 할 일은 ");
		day[date - 1].show();
	}
	
	private void finish()
	{
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	
	public void run()
	{
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(true)
		{
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int input = sc.nextInt();
			if(input == 1) input();
			else if(input == 2) view();
			else if(input == 3) finish();
			else System.out.println("잘못된 입력입니다.");
		}
	}
}

public class Test {

	public static void main(String[] args)
	{
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}

import java.util.*;

class Day {
	private String work;
	public void set(String work) { this.work = work; }
	public String get() { return this.work; }
	public void show()
	{
		if(this.work == null) System.out.println("�����ϴ�.");
		else System.out.println(this.work + "�Դϴ�.");
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
		System.out.print("��¥(1~" + day.length + ")?");
		int date = sc.nextInt();
		if(date < 1 || date > day.length)
		{
			System.out.println("�߸��� �Է��Դϴ�.\n");
			return;
		}
		System.out.print("����(��ĭ���� �Է�)?");
		String tmp = sc.next();
		day[date - 1].set(tmp);
	}
	
	private void view()
	{
		System.out.print("��¥(1~" + day.length + ")?");
		int date = sc.nextInt();
		if(date < 1 || date > day.length)
		{
			System.out.println("�߸��� �Է��Դϴ�.\n");
			return;
		}
		System.out.print(date + "���� �� ���� ");
		day[date - 1].show();
	}
	
	private void finish()
	{
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
	
	public void run()
	{
		System.out.println("�̹��� ������ ���� ���α׷�");
		while(true)
		{
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int input = sc.nextInt();
			if(input == 1) input();
			else if(input == 2) view();
			else if(input == 3) finish();
			else System.out.println("�߸��� �Է��Դϴ�.");
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

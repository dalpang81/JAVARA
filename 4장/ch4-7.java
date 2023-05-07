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
		System.out.print("��¥(1~30)?");
		day = s.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		todo = s.next();
	      day--;
	      if(day < 0 || day > 30) { // 0~29
	         System.out.println("��¥�� �߸� �Է��Ͽ����ϴ�.");
	         return;
	      }
	      days[day].set(todo);
	 }
	
	
	void view() 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("��¥(1~30)?");
		day = s.nextInt();
		day--;
	      if(day < 0 || day > 30) { // 0~29
	          System.out.println("��¥�� �߸� �Է��Ͽ����ϴ�.");
	          return;
	       }
	       System.out.print((day+1)+"���� �� ���� ");
	       days[day].show();
	}
	
	
	void finish() 
	{
		System.out.print("���α׷��� �����մϴ�.");
	}
	void run() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("�̹��� ������ ���� ���α׷�.");
		
		while(true) {
	         System.out.println();
	         System.out.print("����(�Է�:1, ����:2, ������:3) >>");
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
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}

public class Main {
	public static void main(String[] args) {

		
		MonthSchedule monthSchedule = new MonthSchedule(30);
		monthSchedule.run();
		


	}
}
import java.util.Scanner;

class Day{
    private String work;
    public void set(String work){this.work = work;}
    public String get(){return work;}
    public void show(){
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}

public class MonthSchedule{
    Scanner scanner = new Scanner(System.in);
    Day days[];

    MonthSchedule(int day){
        days = new Day[day];
        for(int i = 0; i < days.length; i++)
            days[i] = new Day();
    }

    void input(){
        System.out.print("날짜(1~30)?");
        int d = scanner.nextInt();
        System.out.print("할일(빈칸없이입력)?");
        String w = scanner.next();
        days[d].set(w);
    }

    void view(){
        System.out.print("날짜(1~30)?");
        int d = scanner.nextInt();
        System.out.println(d + "일의 할 일은 " + days[d].get() + "입니다.");
    }

    void finish(){
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }

    void run(){
        System.out.println("이번달 스케쥴 관리 프로그램.");
        int n;
        while(true){
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            n = scanner.nextInt();
            switch(n){
                case 1: input(); break;
                case 2: view(); break;
                case 3: finish(); return;
            }
        }
    }
    public static void main(String[] agrs){
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}
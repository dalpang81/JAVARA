import java.util.*;
class Grade {
	private int math;
	private int science;
	private int english;
    public Grade(int math, int science, int english) {
    	this.math=math;
    	this.science= science;
    	this.english= english;
    	
    }
    public int average() {
    	return (this.math+this.science+this.english)/3;
    }
}
public class ch04_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science= scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 "+ me.average());
		
		scanner.close();
		
	}

}

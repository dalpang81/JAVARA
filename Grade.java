import java.io.*;
import java.util.*;
public class Grade {
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science,int english) {
		this.math=math;
		this.science=science;
		this.english =english;
	}
	public int average() {
		return (this.math+this.science+this.english)/3;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("input your scores of math, science, english, plz input them in order>>");
		int math=scanner.nextInt();
		int science=scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("avg: "+me.average());
		scanner.close();
	}
}

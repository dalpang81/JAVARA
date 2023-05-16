import java.util.*;
public class Circle {
	private int x;
	private int y;
	private int radius;
	public Circle(int x, int y, int radius) {
		this.x=x; this.y=y; this.radius=radius;
	}
	
	public String toString() {
		return"Circle("+x+","+y+")반지름"+radius;
	}
	public boolean isequals(Circle a) {
		if(a.x==x && a.y==y) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a : "+a);
		System.out.println("원 b: "+b);
		if(a.isequals(b))
			System.out.println("같은 원");
		else
			System.out.println("다른 원");
	}
}

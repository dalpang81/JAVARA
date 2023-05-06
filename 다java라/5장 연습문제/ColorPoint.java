import java.util.*;
//5장 5번 문제
class Point{
	private int x,y;
	public Point(int x, int y) {this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
}

public class ColorPoint extends Point {
	private String Color;
	public ColorPoint(int x, int y, String Color) {
		super(x,y);
		this.Color = Color;
	}
	public void setXY(int x, int y) {
		super.move(x, y);
	}
	public void setColor(String Color) {
		this.Color = Color;
	}
	public String toString() {
		return (Color+"색의 "+"("+getX()+","+getY()+")"+"의 점입니다.");
	}
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}

}

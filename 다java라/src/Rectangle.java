import java.util.*;
public class Rectangle {
	private int x,y,width,height;
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public int square() {
		return width*height;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+"에서 크기가 "+width+"x"+height+"인 사각형");
	}
	public boolean contains(Rectangle r)   // 안에 있어야 한다는 말이 겹치면 안되고 포함 되어있어야 되므로 경계선애 걸치는 것은 안된다. 
	{
		if(r.x+r.width<this.width+this.x && r.y+r.height<this.height+this.y) {
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("S의 면적은 "  + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포합하니다.");

	}

}

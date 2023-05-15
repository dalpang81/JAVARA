
public class Circle {
	int x,y,radius;
	Circle(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	boolean equals(Circle a) {
		if((this.x==a.x)&&(this.y==a.y)) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return "Circle("+x+","+y+")"+"반지금"+radius;
	}
	
	
	
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,25);
		System.out.println("원 a : "+ a);
		System.out.println("원 b : "+ b);
		if(a.equals(b)) {
			System.out.println("같은 원");
		}
		else {
			System.out.println("서로 다른 원");
		}
		
	}

}

import java.util.*;
// 5장 2번문제
class TV{
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() { return size;}
}
class ColorTV extends TV{
	private int  color;
	public ColorTV(int inch, int color) {
		super(inch);
		this.color = color;
	}
	protected int getColor() {return color;}
	public void printProperty() {
		System.out.print(getSize()+"인치 "+color+"컬러");
	}
}

public class IPTV extends ColorTV {
	private String ip;
	public IPTV(String ip, int inch, int color) {
		super(inch,color);
		this.ip = ip;
	}
	public void printProperty() {
		System.out.print("나의 IPTV는 "+ ip+ " 주소의 ");
		super.printProperty();
	}
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();

	}

}

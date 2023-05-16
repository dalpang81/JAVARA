import java.util.*;
public class Main {
	public static void main(String[] args) {
		IPTV iptv =new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}
}
class ColorTV{
	private int size;
	private int color;
	ColorTV(int size,int color){
		this.size=size;
		this.color=color;
	}
	public int getSize() {
		return size;
	}
	public int getColor() {
		return color;
	}
}
class IPTV extends ColorTV{
	private String address;
	public IPTV(String address,int size, int color) {
		super(size,color);
		this.address=address;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 "+this.address+" 주소의 "+getSize()+" 인치"+getColor()+"컬러" );
	}
}

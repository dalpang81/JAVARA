import java.util.*;

class TV
{
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class IPTV extends TV
{
	String address;
	int size;
	int color;
	
	public IPTV(String address, int size, int color)
	{
		super(size);
		this.address = address;
		this.color = color;
	}
	
	public void printProperty()
	{
		System.out.println("���� IPTV�� " + address + "�ּ��� " + super.getSize() + "��ġ " + color + "�÷�");
	}
}

public class Main {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}
}
import java.util.*;

class Nation {
	String country;
	String capital;
	
	public Nation(String country, String capital)
	{
		this.country = country;
		this.capital = capital;
	}
	
	public String getCountry() { return country; }
	public String getCapital() { return capital; }
}

class Quiz {
	Scanner s = new Scanner(System.in);
	Vector<Nation>v = new Vector<Nation>();
	
	public Quiz()
	{
		v.add(new Nation("�߽���", "�߽��ڽ�Ƽ"));
		v.add(new Nation("������", "������"));
		v.add(new Nation("������", "�ĸ�"));
		v.add(new Nation("����", "����"));
		v.add(new Nation("�׸���", "���׳�"));
		v.add(new Nation("����", "������"));
		v.add(new Nation("�Ϻ�", "����"));
		v.add(new Nation("�߱�", "����¡"));
		v.add(new Nation("���þ�", "��ũ��"));
	}
	
	boolean contains(String country)
	{
		for(int i = 0; i < v.size(); i++)
		{
			if(v.get(i).getCountry().equals(country))
				return true;
		}
		return false;
	}
	
	public void insert()
	{
		System.out.println("���� " + v.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		while(true)
		{
			System.out.print("����� ���� �Է�>>");
			String country = s.next();
			country.trim();
			if(country.equals("�׸�")) break;
			
			String capital = s.next();
			
			if(contains(country))
			{
				System.out.println(country + "�� �̹� �ֽ��ϴ�!");
				continue;
			}
			v.add(new Nation(country, capital));
		}
	}
	
	public void play()
	{
		while(true)
		{
			int index = (int)(Math.random() * v.size());
			
			Nation nation = v.get(index);
			String question = nation.getCountry();
			String answer = nation.getCapital();
			
			System.out.print(question + "�� ������? ");
			
			String capitalAnswer = s.next();
			if(capitalAnswer.equals("�׸�")) break;
			if(capitalAnswer.equals(answer))
				System.out.println("����!!");
			else
				System.out.println("�ƴմϴ�!!");
		}
	}
	
	public void run() {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while(true) 
		{
			System.out.print("�Է�:1, ����:2, ����:3>>");
			int select = s.nextInt();
			
			switch(select)
			{
			case 1:
				insert();
				break;
			case 2:
				play();
				break;
			case 3:
				System.out.println("������ �����մϴ�.");
				return;
			}
		}
	}
}


 public class Main {
		public static void main(String[] args) {
			Quiz q = new Quiz();
			q.run();
		}
} 

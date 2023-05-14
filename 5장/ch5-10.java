import java.util.*;

abstract class PairMap {
	protected String keyArray [];
	protected String valueArray [];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap{
	private int index = 0;
	public Dictionary(int size) {
		keyArray = new String [size];
		valueArray = new String [size];
	}
	
	public String get(String key) {
		for(int i=0; i<index; i++) {
			if(key.equals(keyArray[i]))
				return valueArray[i];
		}
		
		return null;
	}
	
	public void put(String key, String value) {
		for(int i=0; i<index; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = value;
				return;
			}
		}
		
		keyArray[index] = key;
		valueArray[index] = value;
		index++;
	}
	public String delete(String key) {
		for(int i=0; i<index; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = "null";
				return "null";
			}
		}
		
		return "������ key�� �����ϴ�.";
	}
	public int length() {
		return index;
	}
}

public class Main {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));

	}
}
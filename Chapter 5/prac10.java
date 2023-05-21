import java.util.*;
import java.io.*;

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap {
	private int count;
	
	public Dictionary(int size) {
		keyArray = new String[size];
		valueArray = new String[size];
	}
	
	@Override
	String get(String key) {
		for(int i = 0; i < count; i++) {
			if(keyArray[i].equals(key))
				return valueArray[i];
		}
		return "null";
	}
	
	@Override
	void put(String key, String value) {
		int i;
		for(i = 0; i < count; i++) {
			if(keyArray[i].equals(key))
				break;
		}
		if(i == count) {
			if(i < keyArray.length) {
				keyArray[count] = key;
				valueArray[count] = value;
				count++;
			}
		}
		else valueArray[i] = value;
	}
	
	@Override
	String delete(String key) {
		int i;
		for(i = 0; i < count; i++) {
			if(keyArray[i].equals(key))
				break;
		}
		if(i == count) return "null";
		
		String value = valueArray[i];
		for(int j = i; j < (count - 1); j++) {
			keyArray[j] = keyArray[j + 1];
			valueArray[j] = valueArray[j + 1];
		}
		count--;
		return value;
	}
	
	@Override
	int length() { return count; }
}

public class Main {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}

}

import java.util.*;

abstract class PairMap{
	protected String keyArray [];
	protected String valueArray [];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap{
	private int size=0;
	public Dictionary(int count) {
		keyArray = new String[count];
		valueArray = new String[count];		
	}
	public void put(String key, String value) {	
		int ischange=0;
		for(int i=0;i<size;i++) {
				if(keyArray[i]==key) {
					valueArray[i] = value;
					ischange =1;
				}
			}
			if(ischange==0) {         //key값이 원래 있던 값이 어서 수정하는 put이 주어진 경우에는 이 실행문이 실행되면 안돼서 ischange를 만들었다. 
				keyArray[size] = key;
				valueArray[size] = value;
				size++;
			}
		
	}
	public String get(String key) {
		for(int i=0;i<size;i++) {
			if(keyArray[i]==key)
			{
				return valueArray[i];
			}
		}
		return null;
	}
	public String delete(String key) // 삭제는 value를 null로 바꾼다. 
	{ 
		for(int i=0;i<size;i++) {
			if(keyArray[i]==key)
			{
				String goout = valueArray[i]; 
				valueArray[i] = null;		
				return goout;
			}
		}
		return null;
	}
	public int length() {
		return size;
	}
}

public class DictionaryApp {
	
	public static void main(String args[]) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태","자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "c++");
		System.out.println("이재문의 값은 "+ dic.get("이재문"));
		System.out.println("황기태의 값은 "+ dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+dic.get("황기태"));
	}
}

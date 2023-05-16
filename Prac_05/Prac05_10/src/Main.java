import java.util.*;
public class Main {
	 public static void main(String[] args) {
	        Dictionary dic = new Dictionary(10);
	        dic.put("황기태", "자바");
	        dic.put("이재문", "파이선");
	        dic.put("이재문", "C++"); 
	        System.out.println("이재문의 값은 "+dic.get("이재문"));
	        System.out.println("황기태의 값은 "+dic.get("황기태"));
	        dic.delete("황기태"); 
	        System.out.println("황기태의 값은 "+dic.get("황기태")); 
	    }
}
abstract class PairMap{
	protected String keyArray[];
	protected String valueArray[];
	abstract String get (String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	
	abstract int length();
}
class Dictionary extends PairMap{
	private int size;
	private int cnt;
	public Dictionary(int n) {
		this.size =n;
		keyArray=new String[size];
		valueArray=new String[size];
	}
	@Override
	String get(String key) {
		for(int i=0;i<cnt;i++) {
			if(keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		int index = cnt;
		for(int i=0;i<cnt;i++) {
			if(key.equals(keyArray[i])) {
				index=i;
				break;
			}
		}
		keyArray[index]=key;
		valueArray[index]=value;
		cnt++;
		
	}

	@Override
	String delete(String key){
        String temp = get(key);
        int index = cnt;
        for(int i = 0; i < cnt; i++){
            if(key.equals(keyArray[i])){
                index = i;
                break;
            }
        }
        keyArray[index] = "";
        valueArray[index] = "";
        cnt--;
        return temp;
    }
	int length() {
		return cnt;
	}
	
}

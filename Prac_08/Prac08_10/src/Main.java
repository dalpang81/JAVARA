import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		FileReader file1 = new FileReader("C:\\Temp\\phone.txt");
		HashMap<String,String> phone = new HashMap<String,String>();
		BufferedReader br = new BufferedReader(file1);
		Scanner scanner = new Scanner(System.in);
		String str;
		while((str=br.readLine())!=null) {
			String[] StringArray=str.split(" ");
			phone.put(StringArray[0], StringArray[1]);
		}
		System.out.println("총 "+phone.size()+"개의 전화번호를 읽었습니다.");
		
		String search;
		while(true) {
		System.out.print("이름>> ");
		search=scanner.nextLine();
		if(search.equals("그만")) break;
		if(phone.containsKey(search)) {
			System.out.println(phone.get(search));
		}else {
			System.out.println("찾는 이름이 없습니다.");
			}
		}
		br.close();
		scanner.close();
	}
}

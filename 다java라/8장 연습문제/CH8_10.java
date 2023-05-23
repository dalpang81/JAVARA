import java.io.*;
import java.util.*;

public class CH8_10 {
	
	public static void main(String[] args) {
		try {
		FileReader fin = new FileReader("C:\\Users\\kidre\\OneDrive\\Desktop\\phone.txt"); 
		HashMap<String,String> hs = new HashMap<String,String>();
		BufferedReader br = new BufferedReader(fin);
		Scanner scanner = new Scanner(System.in);
		String c;
		while((c = br.readLine())!= null) {
		String []d = c.split(" ");
		hs.put(d[0], d[1]);
		}
		System.out.println("총 "+ hs.size() +"개의 전화번호를 읽었습니다.");
		while(true) {
			System.out.print("이름>> ");
			String key = scanner.next();
			if(key.equals("그만")) {
				break;
			}
			else if(hs.get(key)==null) {
				System.out.println("찾는 이름이 없습니다.");
			}
			else {
			System.out.println(hs.get(key));
			}
		
		}
		fin.close();
		br.close();
		scanner.close();
		
		}
		catch(IOException e) {
			System.out.println("다시");
		}
	}
}

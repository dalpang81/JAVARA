import java.io.*;

public class CH8_3 {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
		fin = new FileReader("C:\\Users\\kidre\\OneDrive\\Desktop\\test1.txt");
		int c;
		while((c = fin.read())!= -1) {
			char a = Character.toUpperCase((char)c);
			System.out.print(a);
		}
		fin.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}

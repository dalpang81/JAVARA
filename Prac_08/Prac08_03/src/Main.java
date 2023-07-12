import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		FileReader fin = new FileReader("c:\\Temp\\test.txt");
		int n;
		while((n=fin.read())!=-1) {
			if('a'<=(char)n && (char)n<='z') {
				n =Character.toUpperCase((char)n);
				System.out.print((char)n);
				continue;
			}
			System.out.print((char)n);
		}
		fin.close();
	}
}

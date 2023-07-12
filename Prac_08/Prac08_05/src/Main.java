import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		FileInputStream f1 = new FileInputStream("C:\\JavaStudy\\Prac08_05\\elvis1");
		FileInputStream f2 = new FileInputStream("C:\\JavaStudy\\Prac08_05\\elvis1-복사본");
		int n1,n2=0;
		int check=0;
		byte[] buf1 = new byte[1024];
		byte[] buf2 = new byte[1024];
		while(true) {
			n1=f1.read(buf1,0,buf1.length);
			n2=f2.read(buf2,0,buf2.length);
			if(n1!=n2) {
				check=1;
				break;
			}
			for(int i=0;i<n1;i++) {
				if(buf1[i]!=buf2[i]) {
					check=1;
					break;
				}
			}
			break;
		}
		if(check!=0) {
			System.out.println("파일이 다릅니다.");
		}else {
			System.out.println("파일이 같습니다.");
		}
		f1.close();
		f2.close();
	}
}
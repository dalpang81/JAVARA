import java.util.*;


 public class Main {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.print(">>");
			String str = s.nextLine(); 
			
			StringBuffer sb = new StringBuffer(str);
			
			while(true) {
				System.out.print("명령: ");
				String cmd = s.nextLine(); 
				if(cmd.equals("그만")) 
				{
					System.out.print("종료합니다");
					break;
				}
				
				String [] words = cmd.split("!");
				if(words.length != 2) 
				{
					System.out.println("잘못된 명령입니다!");
				}
				
				else {
					if(words[0].length() == 0 || words[1].length() == 0) 
					{
						System.out.println("잘못된 명령입니다!");
						continue;
					}
					
					int index = sb.indexOf(words[0]);
					if(index == -1) 
					{ 
						System.out.println("찾을 수 없습니다!");
						continue;
					}
					sb.replace(index, index+words[0].length(), words[1]);
					System.out.println(sb.toString());
				}
			}
			
			s.close();
		}
} 

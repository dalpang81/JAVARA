import java.util.*;


 public class Main {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.print(">>");
			String str = s.nextLine(); 
			
			StringBuffer sb = new StringBuffer(str);
			
			while(true) {
				System.out.print("���: ");
				String cmd = s.nextLine(); 
				if(cmd.equals("�׸�")) 
				{
					System.out.print("�����մϴ�");
					break;
				}
				
				String [] words = cmd.split("!");
				if(words.length != 2) 
				{
					System.out.println("�߸��� ����Դϴ�!");
				}
				
				else {
					if(words[0].length() == 0 || words[1].length() == 0) 
					{
						System.out.println("�߸��� ����Դϴ�!");
						continue;
					}
					
					int index = sb.indexOf(words[0]);
					if(index == -1) 
					{ 
						System.out.println("ã�� �� �����ϴ�!");
						continue;
					}
					sb.replace(index, index+words[0].length(), words[1]);
					System.out.println(sb.toString());
				}
			}
			
			s.close();
		}
} 

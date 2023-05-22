import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print(">>");
        String a = scanner.nextLine();

        StringBuffer sb = new StringBuffer(a);
        while(true){
            System.out.println("명령: ");
            String b = scanner.nextLine();
            
            if(b.equals("그만"))
                break;

            String s[] = b.split("!");

            if(s[0].length() == 0 || s[1].length() == 0)
                System.out.println("잘못된 명령입니다!");
            else{
                int index = sb.indexOf(s[0]);
                if(index == -1)
                    System.out.println("찾을 수 없습니다!");
                else {
                    sb.replace(index, index+s[0].length(), s[1]);
                    System.out.println(sb);
                }
            }
        }
        System.out.println("종료합니다");
        scanner.close();
    }
}
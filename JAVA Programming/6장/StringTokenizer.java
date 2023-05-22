import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print(">>");
            String a = scanner.nextLine();
            
            if(a.equals("그만"))
                break;

            StringTokenizer st = new StringTokenizer(a, " ");
            System.out.println("어절 개수는 " + st.countTokens());
        }
        System.out.println("종료합니다...");
        scanner.close();
    }
}
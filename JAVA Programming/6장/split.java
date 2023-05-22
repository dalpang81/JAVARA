import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print(">>");
            String a = scanner.nextLine();
         
            if(a.equals("그만"))
                break;
     
            String blank[] = a.split(" ");
            System.out.println("어절 개수는 " + blank.length);
        }
        System.out.print("종료...");
        scanner.close();
    }
}
import java.util.*;

public class Ch7_4{
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int w = scanner.nextInt(); // 강수량 입력

            if(w == 0) break;

            v.add(w); // v에 입력받은 강수량 추가

            int sum = 0;
            for(int i = 0; i < v.size(); i++){
                System.out.print(v.get(i) + " ");
                sum += v.get(i);
            }
            System.out.println("\n현재 평균 " + sum/v.size());
        }
        scanner.close();
    }
}
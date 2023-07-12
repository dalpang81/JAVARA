import java.util.*;

class Nation {
    private String country;
    private String capital;
    public Nation(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }
    public String getCountry() {
        return country;
    }
    public String getCapital() {
        return capital;
    }
}

class CaptialQuiz{
    private Vector<Nation> na;
    private Scanner sc;
    public CaptialQuiz() {
        na = new Vector<>();
        sc = new Scanner(System.in);
        na.add(new Nation("멕시코", "멕시코시티"));
        na.add(new Nation("스페인", "리스본"));
        na.add(new Nation("프랑스", "파리"));
        na.add(new Nation("영국", "런던"));
        na.add(new Nation("그리스", "아테네"));
        na.add(new Nation("독일", "베를린"));
        na.add(new Nation("일본", "동경"));
        na.add(new Nation("중국", "베이징"));
        na.add(new Nation("러시아", "모스크바"));
    }
    public void run(){
        while(true){
            System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
            int input = sc.nextInt();
            if(input == 1){
                insert();
            }
            else if(input == 2){
                play();
            }
            else if(input == 3){
                break;
            }
            else {
                System.out.println("잘못 된 입력입니다.");
            }
        }
    }
    public void insert(){
        System.out.println("현재 " + na.size() + "개 나라와 수도가 입력되어 있습니다.");
        while(true){
            System.out.print("나라와 수도 입력" + (int)(na.size() + 1) + ">>");
            String first = sc.next();
            if(first.equals("그만")) break;
            String second = sc.next();
            boolean isIn = false;
            for(int i = 0; i < na.size(); i++){
                if(na.get(i).getCountry().equals(first)){
                    isIn = true;
                    break;
                }
            }
            if(isIn){
                System.out.println(first + "는 이미 있습니다!");
                continue;
            }
            na.add(new Nation(first, second));
        }
    }
    public void play(){
        while (true){
            int index = (int)(Math.random() * na.size());
            System.out.print(na.get(index).getCountry() + "의 수도는?");
            String inputs = sc.next();
            if(inputs.equals("그만")) break;
            if(inputs.equals(na.get(index).getCapital())){
                System.out.println("정답!");
            }
            else{
                System.out.println("아닙니다!!");
            }
        }
    }
}

public class Main {
    public static void main(String[] args){
        CaptialQuiz cq = new CaptialQuiz();
        cq.run();
    }
}
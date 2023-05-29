import java.util.*;

class Nation{
    private String country;
    private String capital;
    public Nation(String country, String capital){
        this.country = country;
        this.capital = capital;
    }
    public String getCountry(){
        return country;
    }
    public String getCapital(){
        return capital;
    }
}

class CQ{
    private Vector<Nation> n = new Vector<Nation>();
    Scanner scanner = new Scanner(System.in);

    public CQ(){
        n.add(new Nation("멕시코", "멕시코시티"));
        n.add(new Nation("영국", "런던"));
        n.add(new Nation("프랑스", "파리"));
        n.add(new Nation("독일", "베를린"));
        n.add(new Nation("일본", "도쿄"));
        n.add(new Nation("중국", "베이징"));
        n.add(new Nation("미국", "워싱턴 D.C"));
    }
    public void run(){
        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
        while(true){
            System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
            int n = scanner.nextInt();
            switch(n){
                case 1: insert();
                        break;
                case 2: quiz();
                        break;
                case 3: System.out.println("게임을 종료합니다.");
                        return;
            }
        }
    }
    public void insert(){
        System.out.println("현재 " + n.size() + "개 나라와 수도가 입력되어 있습니다.");
        while(true){
            System.out.print("나라와 수도 입력" + (n.size()+1) + ">> ");
            String country = scanner.next();
            if(country.equals("그만")) break;
            String capital = scanner.next();

            boolean exist = false;
            for(int i = 0; i < n.size(); i++){
                if(n.get(i).getCountry().equals(country)){
                    exist = true;
                    break;
                }
            }
            if(exist){
                System.out.println(country + "는 이미 있습니다!");
            } else {
                n.add(new Nation(country, capital));
            }
        }
    }
    public void quiz(){
        while(true){
            int index = (int)(Math.random()*n.size());
            System.out.print(n.get(index).getCountry() + "의 수도는?");

            String capital = scanner.next();
            if(capital.equals("그만")) break;
            if(capital.equals(n.get(index).getCapital()))
                System.out.println("정답!!");
            else
                System.out.println("아닙니다!!");
        }
    }
}

public class Ch7_11_1{
    public static void main(String[] args){
        CQ cq = new CQ();
        cq.run();
    }
}
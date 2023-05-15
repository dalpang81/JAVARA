import java.util.*;


class Nation{
	private String capital, country;
	Nation(String country,String capital ){
		this.capital = capital;
		this.country = country;
	}
	String getCapital(){
		return this.capital;
	}
	String getCountry() {
		return this.country;
	}
	
}


public class CH7_11 {
	
	
	public static void main(String[] args) {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		Scanner scanner = new Scanner(System.in);
		HashMap<String,String> hs = new HashMap<String,String>();
		Vector<Nation> v = new Vector<Nation>();
		int list=0;
		boolean right = false;
		
		while(list!=3) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			list = scanner.nextInt();
			switch(list){
				case 1: 
				{
					System.out.println("현재 "+v.size()+"개의 나라와 수도가 입력되어 있습니다.");
					
					String key, value;
					while(true) {
						System.out.print("나라와 수도 입력"+(v.size()+1)+">> ");
						key = scanner.next();
						
						if(key.equals("그만")) {
							break;
						}
						value = scanner.next();
						for(int i=0; i<v.size(); i++) {
							if(v.get(i).getCountry().equals(key)) { // 사용자가 입력한 나라가 이미 있다면
								right = true;
							}
							
						}
						
						if(right)	
						{
							System.out.println(key+"는 이미 있습니다!");
						}
						else {
							v.add(new Nation(key,value));
						}
					}
					break;
				}

				case 2:
				{	/*
					Set<String>keys = hs.keySet();
					Iterator<String> it = keys.iterator();
					
					while(it.hasNext()) {
						String country = it.next();
						System.out.print(country+"의 수도는? ");
						String capital = scanner.next();
						if(hs.get(country).equals(capital)) {
							System.out.println("정답!!");
						}
						else if(capital.equals("그만")) {
							break;
						}
						else {
							System.out.println("아닙니다!!");
						}
					}
					break;
					*/ // hashMap코드
					for(int i=0;i<v.size();i++) {
						String country = v.get(i).getCountry();
						System.out.print(country+"의 수도는? ");
						String capital = scanner.next();
						if(v.get(i).getCapital().equals(capital)) {
							System.out.println("정답!!");
						}
						else if(capital.equals("그만")) {
							break;
						}
						else {
							System.out.println("아닙니다!!");
						}
					} // Vector<Nation>코드
				}
				
				
				case 3:
					System.out.println("게임을 종료합니다.");
					break;
				
			}
			
		}
	}

}

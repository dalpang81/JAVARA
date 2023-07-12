import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ClickPracticeFrame extends JFrame{
	ClickPracticeFrame(){
		setTitle("클릭 연습 용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel la = new JLabel("C");
		la.setLocation(100,100);
		la.setSize(20,20);
		
		la.addMouseListener(new MyMouseAdapter());
		la.setFocusable(true);
		la.requestFocus();
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
	}
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			JLabel la = (JLabel)e.getSource(); // 이벤트가 발생한 소스 컴포넌트 구함(레이블 la)
			Container c = la.getParent(); // 레이블의 부모 컴포넌트 구함 (컨텐트 팬 c)
			// 컨테이너의 크기 내에서 랜덤한 레이블 위치 설정
			int xBound = c.getWidth() - la.getWidth(); // 레이블의 폭 만큼 감소
			int yBound = c.getHeight() - la.getHeight(); // 레이블의 높이 만큼 감소
			int x = (int)(Math.random()*xBound); // 0 ~ (xBound-1) 임의의 수 생성
			int y = (int)(Math.random()*yBound); // 0 ~ (yBound-1) 임의의 수 생성
			la.setLocation(x,y);
			// 앞 페이지의 ‘레이블 la의 위치 (100, 100)으로 설정’과 동일한 함수 사용
			}
	}
}
public class ClickApp_20194575 {
	public static void main(String[] args) {
		new ClickPracticeFrame();
	}
}

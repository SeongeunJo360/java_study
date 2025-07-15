package chapter10;

import java.awt.*;
import java.awt.event.*;

public class ButtonTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		Panel p = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		f.setLayout(new BorderLayout());
		Button btnClick = new Button("Button1");
		Button btnClick2 = new Button("Button2");
		Button btnClick3 = new Button("Button3");
		p.add(btnClick);	p2.add(btnClick2);	p3.add(btnClick3);
		f.add(p3, BorderLayout.SOUTH);
		f.add(p2, BorderLayout.CENTER);	
		f.add(p, BorderLayout.NORTH);
		f.setTitle("버튼 테스트");
		f.setSize(300, 400);
		f.setVisible(true);
		
		//버튼의 이벤트 처리1 - 내부 클래스를 생성하여 액션 이벤트 처리
		ButtonTest.ButtonActionListener action = new ButtonTest.ButtonActionListener();
		btnClick.addActionListener(new ButtonTest.ButtonActionListener());
		
		//버튼의 이벤트 처리2 - Anonymous(익명) 클래스를 생성하여 액션 이벤트 처리
		btnClick2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button2 Click!!!");
			}
		});
		
		//버튼의 이벤트 처리3 - 람다식(자바 저번 8이상) 처리 방식을 이용할 이벤트 처리
//		btnClick3.addActionListener((ActionEvent  e) -> {
//			System.out.println("Button3 Click!!!");
//		});
		btnClick3.addActionListener(e -> System.out.println("Button3 Click!!!"));
		
		
		//
		f.addWindowListener(new WindowListener() {
			public void windowActivated(windowEvent e) {}
			public void windowClosed(windowEvent e) {}
			public void windowClosing(windowEvent e) {
				System.out.println("-프로그램 종료-");
				Sytem.ecit(0);
			}
			public void windowDeactivated(windowEvent e) {}
			public void windowDeiconified(windowEvent e) {}
			public void windowIconified(windowEvent e) {}
			public void windowOpened(windowEvent e) {}
			}
		});
		
		
	}//main
	/**
	 * 버튼의 이벤트 처리 클래스
	 */
	
	public static class ButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("Click!!!!");
		}
	}
	
}

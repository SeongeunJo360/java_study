package chapter17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
			final String HOST = "localhost";
			final int PORT = 9000;
			Frame f = new Frame();
			Panel p = new Panel();
			f.setLayout(new BorderLayout());
			TextArea ta = new TextArea();
			TextField tf = new TextField(40);
			Button send = new Button("전송");
			Button button1 = new Button("종료");
			ta.setEditable(false);	
			tf.setText("[클라이언트]");
			p.add(tf);		p.add(send);			
			
			Socket s = new Socket(HOST, PORT);  //localhost, 127.0.0.1, 192.168.50.54
			System.out.println("👨 클라언트 접속 ~");
			
			DataInputStream input = new DataInputStream(s.getInputStream());
			DataOutputStream output = new DataOutputStream(s.getOutputStream());
			
			ta.append(input.readUTF());	
            
            f.add(p, BorderLayout.NORTH);
            f.add(ta, BorderLayout.CENTER);
			f.add(button1, BorderLayout.SOUTH);
			f.setSize(400, 500);
			f.setVisible(true);	
            
			
			//전송 버튼 이벤트
			send.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						//전송 버튼 클릭 ---> 서버로 tf 데이터 전송!!!
						output.writeUTF(tf.getText());						
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			});
			
			
            //종료 이벤트
            button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("-- 클라이언트 종료 --");
					System.exit(0);
				}
			});		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}


class ServiseThread extends Thread {
	DataInputStream input;
	TextArea ta;
	
	public ServiceThread(DataInputStream input, TextArea ta) {
		this.input = input;
		this.ta = ta;
	}
	
	public void run() {
		try {
			while(true) {
				ta.append(input.readUTF()+"\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}






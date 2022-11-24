package SWING;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C05GUI extends JFrame{
	C05GUI(){
	super("세번째 프레임입니다.");	//프레임창 생성
		
		JPanel panel = new JPanel();//패널 생성
		panel.setLayout(null);
		
		//Component Start -------------
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,300,180,30);
		 
		JButton btn1 = new JButton("입력");	//버튼객체 생성
		btn1.setBounds(200,300,60,30);		//버튼 위치
  
		JTextArea area = new JTextArea();
		//area.setBounds(10,100,365,250);
		JScrollPane scroll = new JScrollPane(area);
		scroll.setBounds(10,10,250,280);
		
		//Component End-------------
		
		panel.add(btn1);		//패널에 btn1 버튼 추가
		panel.add(txt1);
		 
		//panel.add(area);
		panel.add(scroll);
		 
		add(panel);			//프레임에 패널 추가
		setBounds(100,100,300,400);	//위치 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼
		setVisible(true);	//프레임창 표시 여부
	}
}

public class C05Prac {

	public static void main(String[] args) {
		new C05GUI();

	}

}

package SWING;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C04GUI extends JFrame{
	
	C04GUI(){
		super("세번째 프레임입니다.");	//프레임창 생성
		
		JPanel panel = new JPanel();//패널 생성
		panel.setLayout(null);
		
		//Component Start -------------
		JButton btn1 = new JButton("버튼1");	//버튼객체 생성
		btn1.setBounds(250,10,120,30);		//버튼 위치
		
		JButton btn2 = new JButton("버튼2");	//버튼객체 생성
		btn2.setBounds(250,50,120,30);		//버튼 위치

		JTextField txt1 = new JTextField();
		txt1.setBounds(45,10,200,30);
		JTextField txt2 = new JTextField();
		txt2.setBounds(45,50,200,30);
		JLabel lb1 = new JLabel("ID");
		lb1.setBounds(15,10,30,30);
		JLabel lb2 = new JLabel("PW");
		lb2.setBounds(15,50,30,30);
		JTextArea area = new JTextArea();
		//area.setBounds(10,100,365,250);
		JScrollPane scroll = new JScrollPane(area);
		scroll.setBounds(10,100,365,250);
		
		//Component End-------------
		
		panel.add(btn1);		//패널에 btn1 버튼 추가
		panel.add(btn2);
		panel.add(txt1);
		panel.add(txt2);
		panel.add(lb1);
		panel.add(lb2);
		//panel.add(area);
		panel.add(scroll);
		 
		add(panel);			//프레임에 패널 추가
		setBounds(100,100,400,400);	//위치 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼
		setVisible(true);	//프레임창 표시 여부
	}
	
}
public class C04Swing {

	public static void main(String[] args) {
		new C04GUI();

	}

}

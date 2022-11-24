package SWING;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

class C03GUI extends JFrame{
	
	C03GUI(){
		super("세번째 프레임입니다.");	//프레임창 생성
		
		JPanel panel = new JPanel();//패널 생성
		Color col =new Color(40,190,217);//R(0-255),G(0-255),B(0-255)색상
		panel.setBackground(col);
		
		add(panel);			//프레임에 패널 추가
		setBounds(100,100,700,700);	//위치 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼
		setVisible(true);	//프레임창 표시 여부
	}
	
}
public class C03Swing {

	public static void main(String[] args) {
		new C03GUI();

	}

}

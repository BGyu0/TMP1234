package SWING;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class C04GUI extends JFrame{
	
	C04GUI(){
		super("세번째 프레임입니다.");	//프레임창 생성
		
		JPanel panel = new JPanel();//패널 생성
		panel.setLayout(null);
		
		JButton btn1 = new JButton("버튼1");	//버튼객체 생성
		btn1.setBounds(10,10,120,30);		//버튼 위치
		
		panel.add(btn1);		//패널에 btn1 버튼 추가
		
		add(panel);			//프레임에 패널 추가
		setBounds(100,100,700,700);	//위치 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼
		setVisible(true);	//프레임창 표시 여부
	}
	
}
public class C04Swing {

	public static void main(String[] args) {
		new C04GUI();

	}

}

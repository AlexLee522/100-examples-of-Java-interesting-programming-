//绘制国际象棋棋盘

import java.awt.*;
import javax.swing.*;//使用JPanel绘制图形

public class ch1_6 extends JPanel{
	public void paint(Graphics g) 
	{ 
		super.paint(g);
		g.setColor(Color.white);//设置面板背景色
		g.fillRect(0, 0, 400, 400);//填充面板,可自行选择大小
		int[] x= {0,50,100,150,200,250,300,350,400};//设置填充黑色的坐标
		for (int i=0;i<8;i++) {
			for (int j=0;j<8;j++) {
				if (i%2==0 && j%2==0 || i%2!=0 && j%2!=0) { //一共八个格，坐标均为奇数，坐标均为偶数的时候是黑色格
					g.setColor(Color.black);
					g.fillRect(x[i],x[j],50,50);//填充小方格
				}
			}
		}
	 }
	
	 public static void main(String []args)
	 {
		 ch1_6 s= new ch1_6();
	     JFrame j=new JFrame();
	     j.setTitle("国际象棋棋盘");
	     j.add(s);
	     j.setSize(415, 440);//设置窗口大小
	     j.setVisible(true);
	 }
}

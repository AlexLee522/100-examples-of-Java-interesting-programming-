//绘制余弦曲线
import java.awt.*;//Math库
import javax.swing.*;//使用JPanel绘制图形

public class ch1_3  extends JPanel{
	double x;
	double y;
 
	public void paintComponent(Graphics g) 
	{ 
		super.paintComponent(g);
		g.setColor(Color.white);//设置面板背景色
		g.fillRect(0, 0, 400, 300);//填充面板,可自行选择大小
		g.setColor(Color.red);//设置画线的颜色
		for(x=0;x<=360;x+=0.1)//一个周期
			{
			y=Math.cos(x*Math. PI/180);//转化为弧度,1度=π/180弧度
			y=(100+80*y);//便于在屏幕上显示
			//g.drawString(".",(int)x,(int)y);//用这种方式也可以
			g.drawLine((int)x, (int)y, (int)x,(int) y);//画点
			}
	 }
	
	 public static void main(String []args)
	 {
		 ch1_3 s= new ch1_3();
	     JFrame j=new JFrame();
	     j.setTitle("[-π,π]的余弦曲线");
	     j.add(s);
	     j.setSize(400, 300);//设置窗口大小
	     j.setVisible(true);
	 }
}

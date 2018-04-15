//绘制五环
import java.awt.*;//Math库
import java.util.ArrayList;
import javax.swing.*;//绘制图像

//主程序
public class ch1_4 extends JFrame{
	MyPanel mp = null; 
	public static void main(String []args)
	 {
		ch1_4 ch1_4= new ch1_4();
	}
	public ch1_4(){
		mp = new MyPanel();
        this.add(mp);  //将画好的五环添加到弹窗中
        
        this.setSize(400, 300); //设置弹窗大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setVisible(true); 
	}
}

//定义画笔
class MyPanel extends JPanel{	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.white);//设置面板背景色
		g.fillRect(0, 0, 400, 300);//填充面板,可自行选择大小
		Color CircleColor[]= {Color.blue,Color.black,Color.red,Color.yellow,Color.green};//设置五环颜色
		int x[]= {100,160,220,130,190};//设置圆的x坐标
		int y[]= {100,100,100,125,125};//设置圆的y坐标
		for (int i=0;i<5;i++) {
			g.setColor(CircleColor[i]);
			g.drawOval(x[i],y[i],50,50);//画圆，后两个参数是x、y相对圆心的距离
		}
	}
}

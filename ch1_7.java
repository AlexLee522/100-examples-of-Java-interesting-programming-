// 心形图
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;

class ch1_7 extends JFrame{
	private static final int WIDTH=480;
	private static final int HEIGHT=600;
	
	public ch1_7() {
		super("心形线");
		this.setBackground(Color.black);
		this.setSize(470,500);
		this.setVisible(true);
	}
	public void paint(Graphics g) {
		double x,y,r;
		Image image=this.createImage(WIDTH,800);
		Graphics pic =image.getGraphics();
		for (int i=0;i<90;i++) {
			for (int j=0;j<90;j++) {
				r = Math.PI/45 + Math.PI /45 *i* (1 - Math.sin(Math.PI / 45 * j)) * 18;
				x = r * Math.cos(Math.PI / 45 * j) * Math.sin(Math.PI / 45 * i) + WIDTH/2;
				y = -r * Math.sin(Math.PI / 45 * j) + HEIGHT / 2;
				pic.setColor(Color.red);
				pic.fillOval((int)x,(int)y,2,2);
				
			}
			g.drawImage(image,0,-150,this);
		}
	}
	
	public static void main(String[] args) {
		new ch1_7();
	}
}

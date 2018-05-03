//水仙花数
public class ch3_2{
	public static int scf(int n) {
		int m=1;
		for(int i=0; i<3; i++) {
			m=m*n;
		}
		return m;
	}
	public static void main(String[] args){
		int i,a,b,c;
		int count = 0;
		for(i=100; i<=999; i++) {
			a = i/100;
			b = i%100/10;
			c = i%10;
			if(scf(a)+scf(b)+scf(c) == i) {
				count+=1;
				System.out.println(i+"是水仙花数");
			}
		}
		System.out.println("100~999一共有"+count+"个水仙花数");
	}
}

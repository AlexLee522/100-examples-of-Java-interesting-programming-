// 0~9这10个数字可以组成多少个不重复的三位数

public class ch3_1{
	public static void main(String[] args) {
		int i,a,b,c;
		int n = 0;
		for (i=100; i<=999; i++) {
			a = i/100;
			b = i/10 % 10;
			c = i % 10;
			if (a!=b && a!=c && b!=c) {
				System.out.print(i+" ");
				n++;
				if(n%10==0) {
					System.out.print("\n");
				}
			}
		}
		System.out.print("\n 一共有"+n+"个数字");
	}
}

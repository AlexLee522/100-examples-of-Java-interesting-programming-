//一个3位数各位上的数字都不相同，它和它的反序数的乘积是280021，求这个三位数
public class ch3_8{
	public static void fanxu(int n) {
		int i,j,k;
		i = n/100;
		j = n/10%10;
		k = n%10;
		
		int fan = k*100+j*10+i;
		
		if(n*fan == 280021 && n<fan) {
			System.out.println("要找的数是："+n+"和"+fan);
		}
	}
	
	public static void main(String[] args) {
		for(int i=101; i<=999; i++) {
			fanxu(i);
		}
	}
}

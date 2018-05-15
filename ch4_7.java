//梅尼森数，形如2^n-1的素数,找出n在50以内的梅尼森素数
public class ch4_7{
	public static boolean sushu(int n) { //判断素数
		boolean flag=false;
		for(int i=2; i<n; i++) {
			if(n % i == 0) {
				flag=false;
				break;
			}else {
				flag = true;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		int m,n=2;
		for(int i=2; i<=50; i++) {
			n = n*2;
			m = n-1;
			if(sushu(m)) {
				System.out.println("2^"+i+"-1"+"="+m);
			}
		}
	}
}

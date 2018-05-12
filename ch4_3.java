//金蝉素数：由1，3，5，7，9排列组成的5位素数，去掉最高位和最低位后的3位数是素数，最中间的1位数还是素数
public class ch4_3{
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
	
	public static boolean check_repeat(int n) {
		String s = Integer.toString(n);
		boolean flag = true;
		for(int i=0; i<s.length()-1; i++) {
			if(s.indexOf(s.charAt(i), i+1) != -1) {
				flag = false;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		System.out.println("金蝉素数:");
		int i,j,k,l,m,n1,n2;
		for(i=1; i<10; i+=2) {
			for(j=1; j<10; j+=2) {
				for(k=5; k<8; k+=2) {
					for(l=1; l<10; l+=2) {
						for(m=1; m<10; m+=2) {
							n1 = i*10000+j*1000+k*100+l*10+m;
							n2 = j*100+k*10+l;
							if(sushu(n1) && check_repeat(n1) && sushu(n2)) {
								System.out.print(n1+" ");
							}
						}
					}
				}
			}
		}
	}
}

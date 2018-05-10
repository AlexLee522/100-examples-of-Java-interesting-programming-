//求100以内所有素数
public class ch4_1{
	public static void main(String[] args) {
		System.out.println("100以内素数如下：");
		for(int i=2; i<=100; i++) {
			if(sushu(i)==true) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean sushu(int n) {
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
}

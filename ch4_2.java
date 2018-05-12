//寻找100以内的孪生素数（两个素数差2）
public class ch4_2{
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
	
	public static int[] findsushu(int n) {
		int a[]=new int[n];
		int flag = 0;
		for(int i=1; i<=n; i++) {
			if(sushu(i)) {
				flag+=1;
				a[flag] = i;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println("100以内孪生素数如下：");
		int n = 100;
		int[] a = findsushu(n);
		for(int i=0; i<a.length-1; i++) {
			if(a[i+1]-a[i] == 2) {
				System.out.println(a[i]+" "+a[i+1]);
			}
		}
	}
}

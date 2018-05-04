//寻找10000以内的完全数（除自身之外所有的约数之和等于本身）
public class ch3_3{
	public static void main(String[] args) {
		int i,j,sum;
		for (i=2; i<10000; i++) { //指定范围
			sum = 0;
			for(j=1; j<=i/2; j++) { //被除数范围
				if(i%j==0) //累加因子
					sum += j;
			}
			if(sum==i) //完全数判断
				printwqs(i);
		}
	}
	public static void printwqs(int n) { //输出约数
		int j;
		System.out.print(n+"是完全数,"+n+"的约数为:");
		for(j=1; j<=n/2; j++) {
			if(n%j==0)
				System.out.print(j+" "); //输出各个因子
		}
		System.out.print("\n");
	}
}

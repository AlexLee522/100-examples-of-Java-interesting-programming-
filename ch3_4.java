//寻找指定范围内的相亲数（A的真因数之和为B，B的真因数之和为A）
public class ch3_4{
	private static int GetSum(int num) { //求真因数之和
		int sum = 1;
		int limit = (int) Math.sqrt(num);
		for(int i=2; i<=limit; i++) {
			if(num % i == 0)
				sum += i + num/i;
		}
		return sum;
	}
	
	public static void Run(int from, int to) { //进行循环查找
		for(int num=from; num <= to; num++) {
			int sum1 = GetSum(num);
			if(sum1 > num) {
				int sum2 = GetSum(sum1);
				if(sum2 == num) {
					System.out.printf("%5d和%5d是一对相亲数\n",sum1,sum2);
				}
			}			
		}
	}
	
	public static void main(String[] args) {
		Run(2,1000);
	}
}

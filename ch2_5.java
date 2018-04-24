// 车牌的前两位是一样的，后两位是一样的，车牌是一个数字的平方，车牌一共4位数

public class ch2_5{
	public static void main(String[] args) {
		double a,num;
		for(int i=1; i<10; i++) {
			for(int j=0; j<10; j++) {
				num = 1000*i + 100*i + 10*j + j;
				a = Math.sqrt(num);
				if(num % a==0) {
					System.out.println((int)num);
				}
			}
		}
	}
}

// 黑洞数，任何一个数字不完全相同的整数，经有限次重排求差后总会得到某一个数
// 重排求差：组成该数的数字重排后得到的最大数减去重排后得到的最小数
// 验证3位黑洞数是495

import java.util.Arrays;

public class ch3_5{
	public static int[] fen(int input) {
		int a[] = new int [3];
		a[0]=input/100;
		
		input=input%100;
		a[1]=input/10;
		
		input=input%10;
		a[2]=input;
		
		Arrays.sort(a);
		return a;
	}
	
	public static int he(int a[]) {
		int max=a[2]*100+a[1]*10+a[0];
		int min=a[0]*100+a[1]*10+a[2];
		return max-min;
	}
	
	public static void main(String[] args) {
		for(int input=100; input<=999; input++) {
			System.out.println("\n"+input+"验证如下：");
			
			if(input % 111 == 0) {
				System.out.println("数字全部相同");
				continue;
			}
			else {
				int flag=0;
				int input1=input;
				
				do{
					input1=he(fen(input1));
					flag++;
				}while(input1!=495);
				
				if(input1 == 495) {
					System.out.println("计算了"+flag+"次，命题为真");
				}else {
					System.out.println("命题为假");
				}
			}
		}
		System.out.println("程序结束！");
	}
}

//金字塔图案
import java.util.Scanner;

class ch1_1{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入金字塔层数：");
		int n=input.nextInt();//控制循环层数
		for(int i = 1; i <= n; i++)
		{
			for(int j = 0; j < n-i;j++)
				System.out.print(" ");//输出星号左边空格
			for(int k = 0; k < 2*i-1; k++)
				System.out.print("*");//输出星号个数
			System.out.print("\n");//换行
		}
		
	}
}

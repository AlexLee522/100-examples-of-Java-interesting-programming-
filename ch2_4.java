//赛场统分，去掉一个最高分，去掉一个最低分，剩下的取平均值

import java.util.Scanner;

public class ch2_4{
	public static void main(String[] args) {
		int i,min,max,sum;
		double average;
		int x[]=new int[10]; // 创建一个列表，将成绩放入列表中
		max = 0; // 此处存放最小值
		min = 100; // 此处放最大值
		sum = 0;
		//使用循环添加成绩，计算总分，比较最大最小值
		for(i=0; i<10; i++) {
			System.out.print("请输入第"+(i+1)+"个分数：");
			Scanner input=new Scanner(System.in);
			x[i] = input.nextInt();
			
			sum = sum + x[i];
			
			if(x[i]>max)max=x[i];
			if(x[i]<min)min=x[i];
		}
		average = (sum-max-min)/8; // 去掉最大最小还剩8个数
		System.out.println("去掉一个最高分："+max+"去掉一个最低分："+min);
		System.out.println("平均分："+average);
	}
}

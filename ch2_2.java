//个人所得税问题
import java.util.Scanner;

public class ch2_2{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int s;
		int sum=0;
		
		//工资分级标准
		int salary[] = {0,1500,4500,9000,35000,55000,80000};
		//分级税率
		int rate[] = {3,10,20,25,30,35,45};
		
		System.out.print("请输入税前收入：");
		s=in.nextInt();
		in.close();
		if (s<3500) {
			sum = 0;			
		}else {
			s=s-3500; //个税免征额3500
			
			int index=0; 
			//循环查找，查看属于哪一级，并记录下标
			for (int i=0; i<salary.length; i++) {
				if (s<salary[i]) {
					index = i; //记录下标
					break;
				}else if(s>salary[6]) {
					index = 7;
				}
			}
			
			System.out.println("级别："+index);
			//循环计算扣除累计数
			for (int i=0; i<index-1; i++) {
				sum = sum + (int)((salary[i+1]-salary[i])*rate[i]*0.01);
			}
			sum = sum + (int)((s-salary[index-1])*rate[index-1]*0.01); //计算最终税款
			s = s + 3500 - sum; //计算实发工资
		}
		System.out.println("交税总额："+sum);
		System.out.println("实发工资："+s);
	}
}

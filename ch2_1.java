//寻找13号星期五
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class ch2_1{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入起始年份:");
		int year=input.nextInt();
		System.out.print("打算输出几年呢？");
		int n=input.nextInt();
		input.close();
		getBlackFri(year,n);
	}
	
	public static void getBlackFri(int year,int n) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E");//设定日期输出模式
		int k=0;
		Calendar Cal = Calendar.getInstance();//获得日历对象
		while(k<n) { // 循环控制年份
			for (int i=0; i<12; i++){ // 循环控制月份
				Cal.set(year,i,13); //设置日期
				if (5==(Cal.get(Calendar.DAY_OF_WEEK)-1)) { //判断13日是否是星期五
					System.out.println("黑色星期五:"+sdf.format(Cal.getTime())); //格式化输出日期
				}
			}
			year++;
			k++;
		}
	}
}

//杨辉三角
import java.util.Scanner;

//直角三角形的杨辉三角,二元数组方法
public class ch1_5{
	public static void main(String[] args) {
		int i,j,n;
		System.out.print("请输入层数：");
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		scanner.close();
		int [][] y=new int[n][n];//使用二元数组
		for (i=0;i<n;i++) 
			y[i][0]=y[i][i]=1;
		for (i=2;i<n;i++) 
			for (j=1;j<i;j++)
				y[i][j]=y[i-1][j-1]+y[i-1][j];//给杨辉三角赋值
		for (i=0;i<n;i++) {
			for(j=0;j<=i;j++)
				System.out.printf("%5d",y[i][j]);//打印杨辉三角
			System.out.printf("\n");
		}
		
	}
}

//等腰三角形的杨辉三角，利用数学公式
/**
public class ch1_5_02{
     public static void main(String[] args) {
    	 int rows = 7;//可以打印任意行数，此处暂定为7
 
         for(int i =0;i<rows;i++) {
             int number = 1;
             //打印空格字符串
             System.out.format("%"+(rows-i)*2+"s","");
             for(int j=0;j<=i;j++) {
                  System.out.format("%4d",number);
                  number = number * (i - j) / (j + 1); //用杨辉三角的计算公式 Cij              
             }
             System.out.println(); //换行
         }
     }
}
*/

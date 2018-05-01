//一维多项式计算

public class ch2_9{
	static double dxs(double a[],int n,double x) {
		int i;
		double result;
		result = a[n-1];
		for (i=n-2; i>=0; i--) { //递推
			result = result*x+a[i];
		}
		return result; //返回计算结果
	}
	public static void main(String[] args) {
		int i;
		double a[]= {-15.0,-7.0,7.0,2.0,-3.0,7.0,3.0}; //表达式的系数
		double[] x= {-2.0,-0.5,2.0,3.7};  //x的值
		double result;
		
		System.out.println("计算 f(x)=3x6+7x5-3x4+2x3+7x2-7x-15的值");
		for (i=0; i<4; i++) { // 逐个计算结果
			result = dxs(a,7,x[i]);
			System.out.print("x="+x[i]+"时,结果是："+result+"\n");
		}
		System.out.print("\n");
	}
}

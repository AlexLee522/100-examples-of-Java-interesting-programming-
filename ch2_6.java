public class ch2_6{

	/*
	 * 判断是否全相等，全相等返回True
	 */
	public static boolean isSame(int[] a) {
		int n=0;
		boolean b=false; //是否相等
		for(int i=0; i<a.length-1; i++) { //数组循环
			if(a[i]==a[i+1]) { //如果相邻两个数相等，计数器+1
				n++;
			}
			
			if(n==a.length-1) { //全部相等判断
				b=true;
			}
		}
		return b;
	}
	
	/*
	 * 显示数组的值
	 */
	public static void show(int[] a) {
		if (a == null) //判断数组是否为空
			System.out.println("数组为空");
		for (int i=0; i<a.length; i++) { //循环输出数组元素
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int candy[]= {10,2,8,22,16,4,10,6,14,20}; //最初小孩手中的糖果个数
		int time = 0;
		boolean b=true;
		
		while(isSame(candy)==false) { //判断糖果是否分配好
			int m=candy[9];
			for(int i=9; i>0; i--) { //循环分糖果
				candy[i] = candy[i]/2 + candy[i-1]/2;
			}
			candy[0] = candy[0]/2 + m/2;
			
			time++;
			System.out.print("第" +time+ "次分之后的结果： ");
			show(candy);
			
			//糖果为奇数的向老师要糖果
			for(int i=0; i<10; i++) {
				if(candy[i]%2 != 0)
					candy[i]+=1;
			}
		}
		
		System.out.println("分糖果的次数："+time);
		System.out.println("每人最终的糖果个数："+candy[0]);
		
	}
}

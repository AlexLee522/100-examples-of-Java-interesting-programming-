//九九乘法表
class ch1_2{
	public static void main (String[] args) 
	{
		//控制行数
		for (int i=1; i<10; i++) 
		{
			//控制每行表达式个数
			for (int j=1; j<=i; j++) 
			{
				System.out.print(" "+i+"*"+j+"="+(i*j));
			}
			System.out.println();//换行
		}
	}
}

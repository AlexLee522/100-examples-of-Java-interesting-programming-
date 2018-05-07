//寻找勾股数
public class ch3_6{
	public static final void getGouguNum(int maxnum){
		for(int i=1; i < maxnum-2; i++) {
			for(int j= i+1; j<maxnum-1; j++) {
				int sum = i*i+j*j;
				int c=(int) (Math.sqrt(sum));
				
				if(c*c==sum && c<=maxnum)
					System.out.println(" "+i+" "+j+" "+c);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.print("勾股数如下：\n");
		getGouguNum(1000);
	}
}

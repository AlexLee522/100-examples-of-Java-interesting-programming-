//找出1~1000之间的回文素数（从左向右和从右向左得到的仍是素数）
public class ch4_5{
	public static boolean sushu(int n) { //判断素数
		boolean flag=false;
		for(int i=2; i<n; i++) {
			if(n % i == 0) {
				flag=false;
				break;
			}else {
				flag = true;
			}
		}
		return flag;
	}
	
	public static boolean ishuiwen(int n) {  //转换成字符串再反序最后转回整数
		boolean flag = false;
		String s = String.valueOf(n); 
		StringBuffer sb = new StringBuffer(s);
		s = sb.reverse().toString();
		int n1 = Integer.valueOf(s);
		if(n == n1)
			flag = true;
		return flag;
	}
	
	public static void main(String[] args) {
		System.out.println("1000以内回文素数如下：");
		for(int i=2; i<1000; i++) {
			if(sushu(i) && ishuiwen(i)) {
				System.out.println(i);
			}
		}
		
	}
}

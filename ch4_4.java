//找出1~1000之间的可逆素数（各位数值顺序颠倒得到的仍是素数）
public class ch4_4{
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
	
	public static int fanxu(int n) {  //转换成字符串再反序最后转回整数
		String s = String.valueOf(n); 
		StringBuffer sb = new StringBuffer(s);
		s = sb.reverse().toString();
		n = Integer.valueOf(s);
		return n;
	}
	
	public static void main(String[] args) {
		System.out.println("1000以内可逆素数如下：");
		for(int i=2; i<1000; i++) {
			if(sushu(i) && sushu(fanxu(i))) {
				System.out.println(i);
			}
		}
		
	}
}

//平方回文素数，一个素数的平方是回文数
public class ch4_6{
	public static boolean isHuiWen(int n) {  //转换成字符串再反序最后转回整数
		boolean flag = false;
		String s = String.valueOf(n); 
		StringBuffer sb = new StringBuffer(s);
		s = sb.reverse().toString();
		int n1 = Integer.valueOf(s);
		if(n == n1)
			flag = true;
		return flag;
	}
	
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
	
	public static void main(String[] args) {
		System.out.println("1000以内的平方回文素数：");
		for(int i=2; i<=1000; i++) {
			if(sushu(i) && isHuiWen(i*i)) {
				System.out.println(i+"*"+i+"="+i*i);
			}
		}
	}
}

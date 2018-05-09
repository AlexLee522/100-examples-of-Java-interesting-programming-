//自守数：如果某个数的平方的末尾几位数等于这个数，那么就称这个数为自守数
//寻找1000以内的自守数
public class ch3_7{
	public static void zishou(int n){
		String str0 = String.valueOf(n); //把数字转换成字符串
		String str1 = String.valueOf(n*n);
		String last = str1.substring(str1.length() - str0.length()); //取平方后n位字符串
		if(last.equals(str0)) {
			System.out.println(n+"*"+n+"="+str1+"-->"+n+"是自守数"); //打印自守数
		}
	}
	
	public static void main(String[] args) {
		for(int i=1; i<1000; i++) {
			zishou(i);
		}
	}
}

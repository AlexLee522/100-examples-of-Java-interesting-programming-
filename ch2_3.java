/**存钱问题
 * 为小明的大学四年生活一次性储蓄一笔钱，使用整存零取的方式，每月月初取1000元
 * 假设整存零取的年息为1.71%，请算出父亲至少需要存入多少钱才行
 */
 
public class ch2_3{
	public static final double moneyrate=0.0171; // 存款利率
	public static void main(String[] args) {
		// 定义一个长度为48的数组，装每个月月初剩下的存款
		double money[]=new double[48];
		
		//最后一个月月初1000元
		money[47]=1000;
		//通过循环逆推出前一个月的剩余存款
		for(int i=47; i>0; i--) {
			money[i-1]=1000+money[i]/(1+moneyrate/12);
		}
		System.out.printf("最初要存入%.2f元",money[0]);
	}
}

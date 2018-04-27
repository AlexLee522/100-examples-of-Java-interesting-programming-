/*
 * 三位渔夫出海打鱼，他们随船带了21个筐。返航时发现7个筐装满了鱼，7个筐装了半筐鱼，还有7个是空的
 * 认为7个满筐鱼质量相等，7个半筐鱼质量也相等。在不将鱼倒出来的情况下，怎么将鱼和筐平分三份
 */

public class ch2_8{
	public static void main(String[] args) {
		int[][] fisherman = new int[3][3]; //用二维数组存储分配方案
		
		System.out.println("可能存在的分配方案：");
		for(int m=1; m<=3; m++) { //第一个渔夫
			fisherman[0][0] = m; //满筐数
			fisherman[0][1] = (int) ((3.5-m)/0.5); //半筐数
			fisherman[0][2] = 7-fisherman[0][0]-fisherman[0][1]; //空筐数
			
			for(int n=1; n<=3; n++) {
				fisherman[1][0] = n;
				fisherman[1][1] = (int)((3.5-m)/0.5);
				fisherman[1][2] = 7-fisherman[1][0]-fisherman[1][1];
				
				for(int j=1; j<=3; j++) {
					fisherman[2][0] = j;
					fisherman[2][1] = (int)((3.5-j)/0.5);
					fisherman[2][2] = 7-fisherman[2][0]-fisherman[2][1];
					
					if(fisherman[2][1]+fisherman[1][1]+fisherman[0][1] == 7 &&fisherman[2][0]+fisherman[1][0]+fisherman[0][0] == 7) {
						System.out.println("       满筐       半筐        空筐");
						for(int i=0; i<3; i++) {
							System.out.println(i+":   "+fisherman[i][0]+"       "+fisherman[i][1]+"       "+fisherman[i][2]);
						}
					System.out.println("------------------------");
					break;
					}
				}
			}
		}
	}
}

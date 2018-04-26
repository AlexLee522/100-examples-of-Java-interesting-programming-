/*
 *有四个砝码，总质量40克，砝码质量时整数，且各不相等。请确定它们的质量，使之能称出1~40克任何整数质量的物体
 */
public class ch2_7{
	public static void main(String[] args) {
		int weight1,weight2,weight3,weight4,d1,d2,d3,d4,x,flag;
		int w1=0,w2=0,w3=0,w4=0;
		System.out.printf("The weight is broke up as following 4 pieces:");
		for(weight1=1; weight1<=40; weight1++)  //穷举
			for(weight2=weight1+1; weight2<40-weight1; weight2++) 
				for(weight3=weight2+1; weight3<=40-weight1-weight2; weight3++) 
					if((weight4=40-weight1-weight2-weight3)>=weight3) { 
						//重物在天平左边，d的各种状态：-1砝码在左边，0砝码未使用，1砝码在右边
						for(flag=1,x=1; x<41 && flag==1; x++) 
							for(flag=0,d1=1; d1>-2; d1--) 
								for(d2=1; d2>-2 && flag==0;d2--) 
									for(d3=1; d3>-2&&flag==0; d3--) 
										for(d4=1; d4>-2 && flag==0;d4--) 
											//flag=1表示找到答案，输出
											if(x==weight1*d1+weight2*d2+weight3*d3+weight4*d4) flag=1;
						//flag=1时输出
						if(flag==1) {
							w1=weight1;
							w2=weight2;
							w3=weight3;
							w4=weight4;
						}
					}
		String left = "",right=""; // 表达式初始化
		//循环40次，输出每个的结果
		for(int i=1; i<=40; i++)
			for(int a1=-1; a1<=1; a1++)
				for(int a2=-1; a2<=1; a2++)
					for(int a3=-1; a3<=1; a3++)
						for(int a4=-1; a4<=1; a4++) {
							if(i==a1*w4+a2*w3+a3*w2+a4*w1) { //如果相等输出结果
								boolean f=true; //表达式右侧第一项标志
								left=i+"";
								
								switch (a1) { //根据状态，修改表达式
								case -1: //状态-1：左侧，修改左侧表达式
									left=left+"+"+w4;
									break;
								case 1: //状态1：右侧，修改右侧表达式 
									if(f) right=right+w4;
									else right=right+"+"+w4;
									f=false; //右侧出现数值，修改f标志位
									break;
								}
								switch (a2) {
								case -1:
									left=left+"+"+w3;
									break;
								case 1:
									if(f) right=right+w3;
									else right=right+"+"+w3;
									f=false;
									break;
								}
								switch (a3) {
								case -1:
									left=left+"+"+w2;
									break;
								case 1:
									if(f) right=right+w2;
									else right=right+"+"+w2;
									f=false;
									break;
								}
								switch (a4) {
								case -1:
									left=left+"+"+w1;
									break;
								case 1:
									if(f) right=right+w1;
									else right=right+"+"+w1;
									f=false;
									break;
								}
							System.out.println(left+"="+right); //输出表达式
							}
							left=""; //下次循环，清空
							right="";
						}
	}
}

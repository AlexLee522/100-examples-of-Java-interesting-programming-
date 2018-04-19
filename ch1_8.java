//创建回形矩阵
/**
 * 具体思路：
 * 一共三个部分，填充数字、确定方向、打印数字
 * 使用switch根据方向填充数字（二维数组）
 * 通过判断转弯条件实现控制方向
 * 利用循环打印二维数组
 */
public class ch1_8{
	static enum Direction{
		Right,Down,Left,Up;
	}//方向是常量，用枚举
	
	//创建填充数字方法
	public static void initialArray() {
		int row=0, col=0;//第一个数字
		for (int c=0; c<length*length;c++) {
			snake[row][col] = value;
			lastDirection = findDirection(row,col);
			//根据方向，填充数字
			switch (lastDirection) {
			case Right:
				col++;
				break;
			case Down:
				row++;
				break;
			case Left:
				col--;
				break;
			case Up:
				row--;
				break;
			default:
				System.out.println("error");
			}
			value++;
		}
	}
	
	//创建确定下一步方向的方法
	static Direction findDirection(int row, int col) {
		Direction direction = lastDirection;
		switch (direction) {
			case Right:{ //如果向右到尽头则向下
				if (col == length-1 || snake[row][col+1] !=0)
					direction = direction.Down;
				break;
			}
			case Down:{ //如果向下到尽头则向左
				if (row == length-1 || snake[row+1][col] !=0)
					direction = direction.Left;
				break;
			}
			case Left:{ //如果向左到尽头则向上
				if (col == 0 || snake[row][col-1] !=0)
					direction = direction.Up;
				break;
			}
			case Up:{ //如果向上到尽头则向右
				if (snake[row-1][col] !=0)
					direction = direction.Right;
				break;
			}
		}
		return direction; //返回方向
	}
	
	//创建print方法
	static void print(int[][] arr) {
		for (int i=0; i<length; i++) {
			for (int j=0; j<length; j++) {
				System.out.printf("%5d",arr[i][j]); //每个数字占5位
			}
			System.out.println(); //换行
		}
	}
	
	//进行初始赋值
	static int length = 12; // 确定行数
	static int value = 1; // 确定第一个数字
	static int[][] snake = new int [length][length]; // 创建二维数组
	static Direction lastDirection = Direction.Right; // 确定初始方向:向右
	
	//运行主程序
	public static void main(String[] args) {
		initialArray(); //填充数字
		print(snake); //打印数字
	}
}

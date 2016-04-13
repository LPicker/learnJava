public class MaxHeight {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// 声明一个数组，用来存储学生的身高
		double[] heights = new double[4];
		double max;
		for (int i=0; i<heights.length; i++)
		{
			System.out.println("请输入第"+(i+1)+"位学生的身高：");
			heights[i] = input.nextDouble();
		}
		// 对身高进行比较
		max = heights[0];
		for (int i=1; i<heights.length; i++)
		{
			if (heights[i] >= max)
			{
				max = heights[i];
			}
		}

		System.out.print("最高的人是："+max);
	}
}
public class MaxHeight {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// ����һ�����飬�����洢ѧ�������
		double[] heights = new double[4];
		double max;
		for (int i=0; i<heights.length; i++)
		{
			System.out.println("�������"+(i+1)+"λѧ������ߣ�");
			heights[i] = input.nextDouble();
		}
		// ����߽��бȽ�
		max = heights[0];
		for (int i=1; i<heights.length; i++)
		{
			if (heights[i] >= max)
			{
				max = heights[i];
			}
		}

		System.out.print("��ߵ����ǣ�"+max);
	}
}
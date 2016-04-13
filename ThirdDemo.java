public class ThirdDemo {
	public static void main(String[] args) {
		
		int javaScore = 0;
		int dbScore = 0;
		int htmlScore = 0;

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("请输入Java成绩：");
		javaScore = input.nextInt();

		System.out.print("请输入数据库成绩：");
		dbScore = input.nextInt();

		System.out.print("请输入网页设计成绩：");
		htmlScore = input.nextInt();
		
		double result = (javaScore+dbScore+htmlScore)/3.0;

		System.out.print("平均成绩是：");
		System.out.println(result);
	}
}
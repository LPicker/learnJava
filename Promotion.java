public class Promotion {
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		int msg = 0;
		System.out.println("您一次性消费了多少钱？请输入：");
		double price = input.nextDouble();
		if (price >= 1000)
		{
			msg = 50;
		} else if (price >= 500)
		{
			msg = 15;
		} else if (price >= 200)
		{
			msg = 5;
		} else if (price >= 100)
		{
			msg = 2;
		} else if (price >= 50)
		{
			msg = 1;
		}
		
		System.out.println("赠送您 "+ msg +" 个鸡蛋！");
	}
}
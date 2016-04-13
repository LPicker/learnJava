public class Chapter5 {
	public static void main(String[] args) {
		int num = 10;
		int result1 = 0;
		int result2 = 0;
		result1 = ++num;

		System.out.print("result1 = ");
		System.out.print(result1);		//11
		System.out.print(",num = ");
		System.out.println(num);		//11

		num = 10;
		result2 = num++;				//10

		System.out.print("result2 = ");
		System.out.print(result2);		//10
		System.out.print(",num = ");
		System.out.println(num);		//11

	}
}
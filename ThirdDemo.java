public class ThirdDemo {
	public static void main(String[] args) {
		
		int javaScore = 0;
		int dbScore = 0;
		int htmlScore = 0;

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("������Java�ɼ���");
		javaScore = input.nextInt();

		System.out.print("���������ݿ�ɼ���");
		dbScore = input.nextInt();

		System.out.print("��������ҳ��Ƴɼ���");
		htmlScore = input.nextInt();
		
		double result = (javaScore+dbScore+htmlScore)/3.0;

		System.out.print("ƽ���ɼ��ǣ�");
		System.out.println(result);
	}
}
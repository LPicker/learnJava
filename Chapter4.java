public class Chapter4 {
	public static void main(String[] args) {
		// ���� cycle Ϊ��Ŀ����
		int cycle = 63;
		// remainDays ��������һ�ܺ�ʣ���������
		int remainDays = cycle % 5;
		int result = (remainDays + 3) % 5;

		System.out.print("��Ŀ����ʱ�����ڣ�");
		System.out.print(result);
	}
}
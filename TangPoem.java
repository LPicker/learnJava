public class TangPoem {
	public static void main(String[] args) {
		String p = "������ɽ��\n�ƺ��뺣��\n����ǧ��Ŀ\n����һ��¥";
		String[] sens = p.split("\n");
		char[] words = new char[4];
		//����random����
		java.util.Random random = new java.util.Random();
		int i, len = sens.length, ran;
		for (i = 0; i<len; i++) {
			ran = random.nextInt(len);
			// ÿһ������Ŀմ�
			words[i] = sens[i].charAt(ran);
			System.out.print(words);
		}
	}
}
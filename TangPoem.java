public class TangPoem {
	public static void main(String[] args) {
		String p = "白日依山尽\n黄河入海流\n欲穷千里目\n更上一层楼";
		String[] sens = p.split("\n");
		char[] words = new char[4];
		//创建random对象
		java.util.Random random = new java.util.Random();
		int i, len = sens.length, ran;
		for (i = 0; i<len; i++) {
			ran = random.nextInt(len);
			// 每一句随机的空词
			words[i] = sens[i].charAt(ran);
			System.out.print(words);
		}
	}
}
public class IfDemo {
	public static void main(String[] args) {
		
		int a = 10,b = -5;
		if(a>=b) {
			System.out.println("a大于等于b");
		} else {
			System.out.println("a小于b");
		}

		if(a%2 == 0) {
			System.out.println("a 是偶数");
		}

		if(b>0) {
			System.out.println("b 是正数");
		}

		if((a>0)&&(b>0)) {
			System.out.println("a、b 都是正数");
		}

		if(((a>0)&&(b>0))||((a<0)&&(b<0))) {
			System.out.println("a 和 b 相乘的结果是正数");
		}
	}
}
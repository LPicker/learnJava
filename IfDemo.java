public class IfDemo {
	public static void main(String[] args) {
		
		int a = 10,b = -5;
		if(a>=b) {
			System.out.println("a���ڵ���b");
		} else {
			System.out.println("aС��b");
		}

		if(a%2 == 0) {
			System.out.println("a ��ż��");
		}

		if(b>0) {
			System.out.println("b ������");
		}

		if((a>0)&&(b>0)) {
			System.out.println("a��b ��������");
		}

		if(((a>0)&&(b>0))||((a<0)&&(b<0))) {
			System.out.println("a �� b ��˵Ľ��������");
		}
	}
}
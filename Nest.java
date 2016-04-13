public class Nest {
	public static void main(String[] args) {
		int a = 0;
		while (a < 5) {
			switch ( a ){
				case 0:
				case 3: a += 2;
				case 1:
				case 2: a += 3;
				default: a += 5;
			}
			if ( a > 100 ) {
				a = 10 ;
			}
		}
		System.out.print(a);
	}
}
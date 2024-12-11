
public class Fibonacci {

	public static void main(String[] args) {
		
		Integer a = 1;
		Integer b = 0;
		Integer c = 0;
		
		for (int i = 0; i < 30; i++) {
			System.out.println(a);
			c = a;
			a = a + b;
			b = c;		
		}
	}
}

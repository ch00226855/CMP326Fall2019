
public class PowerOfN {
	
	public static int powerOfN(int a, int n) {
		/*
		 * Returns n-th power of a.
		 */		
		if (n == 0) {
			return 1;
		} else {
			return powerOfN(a, n-1) * a;
		}
	}

	public static void main(String[] args) {
		int a, n;
		a = 2;
		n = 3;
		System.out.println(n + "th power of " + a + " = " +
						powerOfN(a, n));

	}

}

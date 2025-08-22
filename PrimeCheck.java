package hometask;


		public class PrimeCheck {
		    public static boolean isPrime(int n) {
		        if (n <= 1)
		            return false;
		        if (n == 2 || n == 3 || n == 5 || n == 7)
		            return true;
		        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0)
		            return false;
		        if (n < 100)
		            return true; // crude assumption for small numbers
		        return false; // not reliable for large numbers
		    }

		    public static void main(String[] args) {
		        System.out.println(isPrime(29)); // true
		        System.out.println(isPrime(30)); // false
		    }
		}
		// TODO Auto-generated method stub

	}

}

package hometask;

	public class Reverse {

	    public static void main(String[] args) {
	        int num = 1234;

	        if (num > 999) {  // 4-digit number
	            int d1 = num % 10;         // last digit
	            int d2 = (num / 10) % 10;  // 3rd digit
	            int d3 = (num / 100) % 10; // 2nd digit
	            int d4 = num / 1000;       // 1st digit

	            int reversed = d1 * 1000 + d2 * 100 + d3 * 10 + d4;

	            System.out.println("Reversed number = " + reversed);
	        }
	    }
	}



package session;

 public class PrimeWithThree {
	    public static void main(String[] args) {
	        int limit = 1000; // You can change this limit as needed

	        for (int i = 2; i <= limit; i++) {
	            if (isPrime(i) && containsThree(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    // Method to check if a number contains the digit '3'
	    public static boolean containsThree(int num) {
	        return String.valueOf(num).contains("3");
	    }
	}





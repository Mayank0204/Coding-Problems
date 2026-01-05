public class PrimeNumber {
    public static void main(String[] args) {
        int num = 29;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            }
        }
        System.out.println(num + " is a prime number.");
    }
}

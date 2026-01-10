public class StrongNumber {
    public static void main(String[] args) {
        int num = 145;
        int cpy = num;
        int sum = 0;
        while (cpy != 0) {
            int digit = cpy % 10;
            int fact = 1;
            for (int i = 2; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            cpy = cpy / 10;
        }
        System.out.println(num == sum ? num + " is a strong number." : num + " is not a strong number.");
    }
}

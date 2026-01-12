public class SwapFirstAndLastDigit {
    public static void main(String[] args) {
        int num = 12345;
        int cpy = num;
        int count = 0;
        while (cpy != 0) {
            count++;
            cpy = cpy / 10;
        }
        int lastDigit = num % 10;
        int firstDigit = (int) (num / Math.pow(10, count - 1));
        num = num / 10;
        int middlePart = num % (int) (Math.pow(10, count - 2));
        num = lastDigit * (int) (Math.pow(10, count - 1)) + middlePart * 10 + firstDigit;
        System.out.println(num);
    }
}

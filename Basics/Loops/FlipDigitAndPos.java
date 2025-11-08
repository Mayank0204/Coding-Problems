public class FlipDigitAndPos {
    public static void main(String[] args) {
        int num = 32145; 
        int result = 0;
        int position = 1;

        while (num != 0) {
            int digit = num % 10;
            result += position * Math.pow(10, digit - 1);
            num /= 10;
            position++;
        }

        System.out.println("Flipped Number: " + result);
    }
}

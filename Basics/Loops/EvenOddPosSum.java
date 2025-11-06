public class EvenOddPosSum {
    public static void main(String[] args) {
        int num = 8765;
        int evenSum = 0;
        int oddSum = 0;             
        int position = 1;

        while (num != 0) {
            int digit = num % 10;
            if (position % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            num /= 10;
            position++;
        }  
        System.out.println("Sum of even position digits: " + evenSum);
        System.out.println("Sum of odd position digits: " + oddSum);     
    }
}

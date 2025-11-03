public class ArmStrongNum {
    public static void main(String[] args) {
        int num = 153;
        int cpy = num;
        int sum = 0;
        int count = 0;  
        while (cpy != 0) {
            cpy = cpy / 10;
            count++;
        }
        cpy = num;
        while (cpy != 0) {
            int digit = cpy % 10;
            sum += Math.pow(digit, count);
            cpy = cpy / 10;
        }
            System.out.println(num == sum ? num + " is an armstrong number." : num + " is not an armstrong number.");
    }
}

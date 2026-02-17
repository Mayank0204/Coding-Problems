import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");       
        int number = sc.nextInt();
        int digits = String.valueOf(number).length();       
        int sum = calculateArmstrongSum(number, digits);
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        sc.close();
    }
    
    public static int calculateArmstrongSum(int number, int digits) {
        if (number == 0) {
            return 0;
        }
        int digit = number % 10;
        return (int) Math.pow(digit, digits) + calculateArmstrongSum(number / 10, digits);
    }
}

import java.util.Scanner;

public class AlphabetLeftTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            char ch = 'A';
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + "");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}

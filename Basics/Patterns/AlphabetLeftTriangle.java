import java.util.Scanner;

public class AlphabetLeftTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        char ch = 'A';  
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}

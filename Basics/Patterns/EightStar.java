import java.util.Scanner;

public class EightStar {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row < 2 * n; row++) {
            for (int col = 1; col <= n; col++) {
                if ((col == 1 || col == n) && (row == 1 || row == n || row == 2 * n - 1)) {
                    System.out.print(" ");
                } 
                else if (row == 1 || row == n || row == 2 * n - 1 || col == 1 || col == n) {
                    System.out.print("*");
                } 
                else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
        sc.close();
    }

}

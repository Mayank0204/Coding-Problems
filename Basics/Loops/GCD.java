public class GCD {
    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println(b + " is the GCD");
    }
}

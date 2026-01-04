public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 15;
        int aCopy = a, bCopy = b;
        while (a % b != 0) {    
            int rem = a % b;
            a = b;
            b = rem;
        }
        int lcm = (aCopy * bCopy) / b;
        System.out.println("LCM of " + aCopy + " and " + bCopy + " is " + lcm);
    }
}

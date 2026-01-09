public class RotateNum {
    public static void main(String[] args) {
        int num = 12345; 
        int rotations = 2; 
        int count = 0;
        int cpy = num;
        while (cpy != 0) {
            cpy /= 10;
            count++;
        }
        rotations = rotations % count;
        if (rotations < 0) {
            rotations += count;
        }
        int divisor = (int) Math.pow(10, rotations);
        int lhs = num / divisor;
        int rhs = num % divisor;    
        int multiplier = (int) Math.pow(10, count - rotations);
        int rotatedNum = rhs * multiplier + lhs;
        System.out.println("Rotated Number: " + rotatedNum);
    }
}

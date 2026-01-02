public class GreaterNumberInFour {
      public static void main(String[] args) {
            int num1 = 45;
            int num2 = 23;
            int num3 = 27;
            int num4 = 50;
    
            int greatest;
            if (num1 >= num2 && num1 >= num3 && num1 >= num4) {
                greatest = num1;
            } else if (num2 >= num1 && num2 >= num3 && num2 >= num4) {
                greatest = num2;
            } else if (num3 >= num1 && num3 >= num2 && num3 >= num4) {
                greatest = num3;
            } else {
                greatest = num4;
            }
    
            System.out.println("The greatest number is " + greatest);
      }              
}

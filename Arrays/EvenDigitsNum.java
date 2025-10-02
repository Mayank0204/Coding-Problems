public class EvenDigitsNum {
    public static void main(String[] args) {
        int[] arr = { 2, 50, 4, 1333, 46, 32, -11, -26, 651 };
        System.out.println(findNumbers(arr));
        System.out.println(digits(-11));
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int noofdigits = digits(num);
        if (noofdigits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num) {
        int count = 0;
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}

public class Max2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {2,45,23,7},
            {3,5,12},
            {32,54,28}
        };
         System.out.println(max(arr));
    }

    static int max(int[][] arr){
        int maxVal = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > maxVal) {
                    maxVal = arr[row][col];
                }
            }
        }
        return maxVal;
    }
}

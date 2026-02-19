public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 6};
        boolean isSorted = checkSorted(arr, 0);
        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }

    public static boolean checkSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return checkSorted(arr, index + 1);
    }
}

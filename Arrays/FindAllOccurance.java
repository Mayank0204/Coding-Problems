public class FindAllOccurance {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, 40, 50 };
        int target = 50;
        int[] ans = { 0, 0, 0, 0, 0 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans[i] = 1;
            }
        }

        System.out.print("Target found at indices: ");
        boolean found = false;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == 1) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }
}

public class AddStarInAdjacentDuplicateChar {
    public static void main(String[] args) {
        String str = "aaabbccdcde";
        String result = addStarInAdjacentDuplicates(str);
        System.out.println(result); 
    }

    public static String addStarInAdjacentDuplicates(String str) {
        if (str.length() <= 1) {
            return str;
        }

        char firstChar = str.charAt(0);
        String remainingStr = str.substring(1);
        String processedStr = addStarInAdjacentDuplicates(remainingStr);

        if (firstChar == processedStr.charAt(0)) {
            return firstChar + "*" + processedStr;
        } else {
            return firstChar + processedStr;
        }
    }
}

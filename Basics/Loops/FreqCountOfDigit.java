import java.util.HashMap;

public class FreqCountOfDigit {
    public static void main(String[] args) {
        int num = 1223334444;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        while (num > 0) {           
            int digit = num % 10;
            freqMap.put(digit, freqMap.getOrDefault(digit, 0) + 1);
            num /= 10;
        }
        for (int digit : freqMap.keySet()) {
            System.out.println("Digit: " + digit + ", Frequency: " + freqMap.get(digit));
        }    
    }
}

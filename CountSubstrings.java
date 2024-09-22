import java.util.HashMap;

public class CountSubstrings {
    
    public static int countSubstringsWithKDistinct(String s, int k) {
       return countSubstringsWithAtMostKDistinct(s, k) - countSubstringsWithAtMostKDistinct(s, k - 1);
    }

    private static int countSubstringsWithAtMostKDistinct(String s, int k) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int start = 0, count = 0;

        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            freqMap.put(endChar, freqMap.getOrDefault(endChar, 0) + 1);

            while (freqMap.size() > k) {
                char startChar = s.charAt(start);
                freqMap.put(startChar, freqMap.get(startChar) - 1);
                if (freqMap.get(startChar) == 0) {
                    freqMap.remove(startChar);
                }
                start++;
            }

            count += end - start + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        int result = countSubstringsWithKDistinct(s, k);
        System.out.println("Output: " + result); 
    }
}

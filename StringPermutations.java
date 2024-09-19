import java.util.*;

public class StringPermutations {

    public static List<String> permute(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return result;
        }
        permuteHelper("", str, result);
        return result;
    }

    private static void permuteHelper(String prefix, String str, List<String> result) {
        int n = str.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permuteHelper(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), result);
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = permute(input);
        System.out.println("Permutations of the string \"" + input + "\": " + permutations);
    }
}

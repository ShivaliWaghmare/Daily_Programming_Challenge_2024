public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); 

        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); 
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        String s = "the sky is blue";
        String result = rw.reverseWords(s);
        System.out.println(result); 
    }
}

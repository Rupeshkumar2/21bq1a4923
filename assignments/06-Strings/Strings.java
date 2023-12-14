import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String str = "notebook";
        leetcode1704(str);
    }

    static void leetcode1704(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0 ; i < str.length() ; i++) {
            if (i < str.length() / 2) {
                if (vowels.contains(str.charAt(i) + ""));
                count++;
            } else {
                if (vowels.contains(str.charAt(i) + ""));
                count--;
            }
        }
        System.out.println(count == 0);
    }


}

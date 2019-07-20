import java.util.*;

public class StringCompress {
    public static void main(String[] args) {
        System.out.println(compress("wwwwaaadexxxxxx"));
        System.out.println(compress("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW"));
    }

    static String compress (String input) {

        StringBuilder sb = new StringBuilder(input.charAt(0));

        for (int i = 0; i < input.length(); ) {
            char ch = input.charAt(i);
            int counter = 0;
            int j = i;
            while(j < input.length() && ch == input.charAt(j) ) {
                counter++;
                j++;
            }
            sb.append(ch).append(counter);
                
            i = j;
        }

        if (input.length() <= sb.length()) {
            return input;
        }
        return sb.toString();
               
    }
}
// Check if one string is a permutation of other
import java.util.Arrays;


public class isPermute {
    static boolean ispermute (String one, String two){
      
        if(one.length() != two.length()) { return false; }

        char[] aChar = one.toLowerCase().toCharArray();
        char[] bChar = two.toLowerCase().toCharArray();

        Arrays.sort(aChar);
        Arrays.sort(bChar);

        for (int i = 0; i < aChar.length; i++){
            if(aChar[i] != bChar[i]) { return false; }
        }
        return true;
    }

    public static void main(String[] args){
        String a = "atco";
        String b = "octa";
        System.out.println(ispermute(a, b));
        
        String c = "ABCD";
        String d = "dabc";
        System.out.println(ispermute(c, d));

    }
}
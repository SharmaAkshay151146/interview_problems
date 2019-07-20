/* Given a string, write a function to check if it is a permutation of palindrome.
* The palindrome does not need to be limited to just dictionary words.abstract
* Example - Tact Coa, o/p -> True (permutations: "taco cat", "atco cta", etc.)
*/

import java.util.*;

public class palPermute {
    public static void main(String[] args) {
        
    }

    static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, r);  
                permute(str, l, r);
            }
        }
    }

    static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}


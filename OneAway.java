/* There are 3 types of edit that can be performed on a string. Add, delete, and replace a string.
* Check if a string is one edit away from another.
*/

import java.util.*;

public class OneAway {
    public static void main(String[] args) {
        System.out.println(check("pals", "pls"));
    }

    static boolean check(String one, String two) {
        
        if (one.equals(two)) {
            return true;
        }
        
        if (Math.abs(one.length() - two.length()) > 1) {
            return false;
        }

        int length = Math.max(one.length(), two.length());

        int count = 0;
        int cO = 0;
        int cT = 0;

        while(cO < one.length() && cT < two.length()) {
            if (one.charAt(cO) == two.charAt(cT)) {
                cO++;
                cT++;
            } else {
                count++;

                if (one.length() > two.length()) { cO++; }
                else if (one.length() < two.length())  { cT++; }
                else { cO++; cT++; }
            }
        }

        return count <= 1;
    }
}
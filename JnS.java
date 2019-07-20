// The classic Jewels and Stones Problem

import java.util.*;

public class JnS {
    public int numJewelsInStones(String J, String S) {
        Set set = new HashSet ();
        int count = 0;
        
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }

        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        JnS j = new JnS();
        System.out.println(j.numJewelsInStones("aAA", "aAAAbbbbb"));

    }
}
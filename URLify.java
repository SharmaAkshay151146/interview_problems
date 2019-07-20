/* Replace all spaces in a string with '%20'. You may assume that the string 
* has sufficient space at the end to hold the additional characters, and that 
* you're given the "true" length of the string. If implementing in Java, use 
* a character array so that you can perform this operation in place.
* Eg. "Mr. Jon Smith     ", 13 is the true length
* o/p = "Mr%20Jon%20Smith%20"
*/

import java.util.*;

public class URLify {
    public static void main(String[] args) {
        String input = "Mr. Jon Smith";
        System.out.println(toURL(input.toCharArray(), input.length()));
        String name = "Abhishek Tiwari";
        System.out.println(toURL(name.toCharArray(), name.length()));
        String chd = "Prachi Sheoran";
        System.out.println(toURL(chd.toCharArray(), chd.length()));
        //String input = "Mr. Jon Smith";
        //System.out.println(toURL(input.toCharArray(), input.length()));
        //String input = "Mr. Jon Smith";
        //System.out.println(toURL(input.toCharArray(), input.length()));
    }

    static String toURL (char[] input, int length) {
        int spaceCount = 0, newLength = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == ' ') {
                spaceCount++;
            }
        }
        newLength = input.length + spaceCount*2;
        char[] URL = new char[newLength];

        for (int i = 0, j = 0; j < URL.length & i < input.length; i++) {
            if (input[i] != ' ') {
                URL[j] = input[i];
                j++;
            } else {
                URL[j] = '%';
                URL[j+1] = '2';
                URL[j+2] = '0';
                j = j+3;
            }
        }

        String output = new String(URL);
        return output;
        
    }
}
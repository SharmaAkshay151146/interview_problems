// Implement a program to determine if a string has all unique characters

public class IsUnique {

    //private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    static boolean isUnique(String input) {
        for (int i = 0; i < input.length(); i++) {
           int counter = -1;
           char ch = input.charAt(i);
           for (int j = 0; j < input.length(); j++){
               if (ch == input.charAt(j)){
                   counter++;
               }
           }
           
           if (counter > 0) { return false; }
       }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "The quickbrown";
        System.out.println(isUnique(s1));

        String s2 = "hutg9mnd!nk9";
        System.out.println(isUnique(s2));

        String s3 = "Wackonij";
        System.out.println(isUnique(s3));

    }
}
// Reverses a number. Returns zero, if the number is greater than the max limit

import java.util.*;

public class NumReverse {
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		System.out.println(reverse(1492));
	}
	
	static int reverse (int num) {
		int reverse = 0;
				
		while (num != 0) {
			int check = num % 10;
			int newReverse = reverse * 10 + check; 
			if ((newReverse - check) / 10 != reverse) { return 0; }
			reverse = newReverse;
			num = num / 10;
		}
				
		return reverse;
	}
}
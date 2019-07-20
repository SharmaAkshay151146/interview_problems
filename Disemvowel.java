// Returns a string with its vowels removed

public class Disemvowel {
	public static String disemvowel (String str) {
		//StringBuilder result = new StringBuilder(100);
		//String vowels = "aeiou";
		
		//System.out.println(result.toString());
		
		
		return str.replaceAll("[aAeEiIoOuU]","");
	}
	
	public static void main(String[] args) {
		String str = "You do not mess with me boy!";
		System.out.println(disemvowel(str));
	}
}
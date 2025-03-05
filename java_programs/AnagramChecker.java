import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
	
/**Write a Java program that takes two strings as input and checks if they are anagrams
(containing the same characters in a different order).
Example:
Input: "listen", "silent"
Output: true
Input: "hello", "world"
Output: false*/


    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        
        scanner.close();
        
        if (areAnagrams(str1, str2)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }
    }
}

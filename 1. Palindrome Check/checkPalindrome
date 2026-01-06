/*
    Problem Statement:
    Given a string str, check whether it is a palindrome or not.

    A palindrome is a string that reads the same forward and backward.

    Examples:
    Input:  "abba"
    Output: true  → "abba" is a palindrome

    Input:  "abc"
    Output: false → "abc" is not a palindrome
*/

/*
    Approach:
    - Use two pointers:
        s → points to the start of the string
        e → points to the end of the string
    - Convert the string into a character array for easy comparison.
    - Compare characters from both ends.
    - If any pair does not match, return false.
    - Move s forward and e backward until they meet.
*/

/*
    Explanation:
    - Initialize s = 0 and e = length of string - 1.
    - Convert the string to a character array.
    - While s < e:
        - Check if characters at index s and e are equal.
        - If not equal, the string is not a palindrome.
        - If equal, move s forward and e backward.
    - If all characters match, return true.
*/

/*
    Time Complexity:
    O(n) → where n is the length of the string.

    Space Complexity:
    O(n) → due to conversion of string to character array.
*/

class palindromeCheck {

    static boolean palindromeCheck(String str) {
        int s = 0;
        int e = str.length() - 1;
        char[] crr = str.toCharArray();

        while (s < e) {
            if (crr[s] != crr[e]) {
                return false; // Characters do not match
            }
            s++;
            e--;
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        String str = "abc";

        boolean ans = palindromeCheck(str);
        
        if (ans) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }
    }
}

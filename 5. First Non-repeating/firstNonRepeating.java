/*
    Problem Statement:
    Given a string s consisting of lowercase English letters,
    find the first character that does not repeat.
    If no such character exists, return '$'.

    Examples:
    Input:  "geeksforgeeks"
    Output: 'f'

    Input:  "racecar"
    Output: 'e'

    Input:  "aabbccc"
    Output: '$'
*/

/*
    Approach:
    - Use a frequency array of size 26 (for lowercase letters).
    - First, count the frequency of each character.
    - Then, traverse the string again to find the first character
      whose frequency is exactly 1.
*/

/*
    Explanation:
    - Create an integer array freq[26] to store frequency of characters.
    - Traverse the string and update frequency using:
        freq[character - 'a']++
    - Traverse the string again in original order:
        - If frequency of current character is 1,
          return that character.
    - If no non-repeating character is found, return '$'.
*/

/*
    Time Complexity:
    O(n) → two traversals of the string.

    Space Complexity:
    O(1) → fixed size array of 26 characters.
*/

class Solution {

    static final int MAX_CHAR = 26;

    static char nonRepeatingChar(String s) {
        int[] freq = new int[MAX_CHAR];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Find first non-repeating character
        for (int i = 0; i < s.length(); ++i) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }

        return '$'; // No non-repeating character found
    }

    public static void main(String[] args) {
        String s = "racecar";
  
        System.out.println(nonRepeatingChar(s));
    }
}

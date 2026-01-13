/*
    Problem Statement:
    Given two strings s1 and s2 of the same length,
    check whether s2 is a rotation of s1.

    A rotation means shifting characters of a string
    either to the left or right without changing their order.

    Examples:
    Input:  s1 = "abcd", s2 = "cdab"
    Output: true
    Explanation: After rotating s1, it becomes "cdab".

    Input:  s1 = "aab", s2 = "aba"
    Output: true
    Explanation: After one left rotation, s1 becomes "aba".

    Input:  s1 = "abcd", s2 = "acbd"
    Output: false
    Explanation: Strings are not rotations of each other.
*/

/*
    Approach:
    - Rotate string s1 step by step.
    - After each rotation, compare it with s2.
    - If at any point s1 becomes equal to s2, return true.
    - If all rotations are checked and no match is found, return false.
*/

/*
    Explanation:
    - Store the length of the string.
    - Repeat the process n times (where n is length of string):
        - If s1 equals s2, return true.
        - Perform one right rotation:
            - Take the last character of s1.
            - Add it to the front of the remaining substring.
    - If no rotation matches s2, return false.
*/

/*
    Time Complexity:
    O(n²) → each rotation takes O(n) time and we do it n times.

    Space Complexity:
    O(n) → new strings are created during rotation.
*/

class Solution {
    
    static boolean areRotations(String s1, String s2) {
        int n = s1.length();

        for (int i = 0; i < n; ++i) {
            
            // Check if current rotation matches s2
            if (s1.equals(s2)) {
                return true;
            }
            
            // Perform one right rotation
            char last = s1.charAt(s1.length() - 1);
            s1 = last + s1.substring(0, s1.length() - 1);
        }

        return false; // No rotation matched
    }
    
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "aba";

        System.out.println(areRotations(s1, s2));
    }
}

/*
    Problem Statement:
    Given a string str, reverse the string.

    Reversing a string means:
    - The first character becomes the last.
    - The second character becomes the second last.
    - This continues until the entire string is reversed.

    Examples:
    Input:  "mand"
    Output: "dnam"

    Input:  "abdcfe"
    Output: "efcdba"
*/

/*
    Approach:
    - Use two pointers:
        left  → starts from the beginning of the string
        right → starts from the end of the string
    - Convert the string into a character array because strings are immutable in Java.
    - Swap characters at left and right positions.
    - Move left forward and right backward until they meet.
*/

/*
    Explanation:
    - Initialize left = 0 and right = length of string - 1.
    - Convert the string to a character array.
    - While left < right:
        - Swap characters at index left and right.
        - Increment left and decrement right.
    - Convert the character array back to a string and return it.
*/

/*
    Time Complexity:
    O(n) → where n is the length of the string.

    Space Complexity:
    O(n) → because a character array is used.
*/

class reverseString {

    static String reverseString(String str) {
        int left = 0, right = str.length() - 1;

        char[] crr = str.toCharArray();

        while (left < right) {
            char c = crr[left];
            crr[left] = crr[right];
            crr[right] = c;

            left++;
            right--;
        }

        return new String(crr);
    }

    public static void main(String[] args) {
        String str = "abdcfe";

        System.out.println(reverseString(str));
    }
}

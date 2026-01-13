/*
    Problem Statement:
    Given a string containing words separated by spaces,
    reverse the order of words in the string.

    Note:
    - Words should appear in reverse order.
    - Extra spaces (if any) should be ignored.

    Example:
    Input:  "Aditya Shubham Gautam"
    Output: "Gautam Shubham Aditya"
*/

/*
    Approach:
    - Split the string using space as a delimiter.
    - Store only valid (non-empty) words in a list.
    - Reverse the list of words.
    - Join the words back using a single space.
*/

/*
    Explanation:
    - Split the input string into parts using split(" ").
    - Iterate over the split parts:
        - Ignore empty strings caused by extra spaces.
        - Add valid words to a list.
    - Reverse the list using Collections.reverse().
    - Join the reversed words using String.join(" ").
*/

/*
    Time Complexity:
    O(n) → where n is the length of the string.

    Space Complexity:
    O(n) → extra space used to store words.
*/

import java.util.*;

class solution1 {

    static String reverseWords(String str) {

        List<String> words = new ArrayList<>();
        String[] parts = str.split("\\ ");

        for (String word : parts) {
            if (!word.isEmpty()) {
                words.add(word); // Store only valid words
            }
        }

        Collections.reverse(words); // Reverse word order

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String str = "Aditya Shubham Gautam";
        System.out.println(reverseWords(str));
    }
}

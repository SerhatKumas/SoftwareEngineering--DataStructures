package StringLibrary;

import java.util.ArrayList;

public interface CustomStringMethods {

    //Checks whether string is palindrome or not
    boolean isPalindrome(String string);

    //Returns reverse of string
    String reverse(String string);

    //Removes all the spaces from string
    String removeSpace(String string);

    //Returns array that contains all the different chars
    ArrayList<Character> listOfCharsOfString(String string);

    //Returns number of word in a string
    int wordCount(String string);

    //Returns number of space between words but not as a number of digits.
    //Even if there is more than 2 digits space, it takes as one count of space
    int spaceCountBetweenWords(String string);

    //Returns number of character in a string but takes empty digits out
    // length - digit number of spaces
    int characterCount(String string);

}

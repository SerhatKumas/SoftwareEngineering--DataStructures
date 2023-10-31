package StringLibrary;

import java.util.ArrayList;

public interface CustomStringMethods {

    boolean isPalindrome(String string);

    String reverse(String string);

    String removeSpace(String string);

    ArrayList<Character> listOfCharsOfString(String string);

    int wordCount(String string);

    int spaceCountBetweenWords(String string);

    int characterCount(String string);

}

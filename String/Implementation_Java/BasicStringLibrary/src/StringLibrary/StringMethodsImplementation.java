package StringLibrary;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;

public class StringMethodsImplementation implements CustomStringMethods, AuxiliaryMethods {
    //Checks whether string is palindrome or not
    @Override
    public boolean isPalindrome(String string) {
        return string.equals(reverse(string));
    }

    //Returns reverse of string
    @Override
    public String reverse(String string) {
        StringBuilder newString = new StringBuilder();
        for (int i = lengthOfString(string) - 1; i >= 0; i--) {
            newString.append(string.charAt(i));
        }
        return newString.toString();
    }

    //Removes all the spaces from string
    @Override
    public String removeSpace(String string) {
        return string.replace(" ", "");
    }

    //Returns array that contains all the different chars
    @Override
    public ArrayList<Character> listOfCharsOfString(String string) {
        ArrayList<Character> charList = new ArrayList<>();
        for (int i = 0; i < lengthOfString(string); i++) {
            if (!charList.contains(string.charAt(i)) && string.charAt(i) != ' ') {
                charList.add(string.charAt(i));
            }
        }

        return charList;
    }

    //Returns number of word in a string
    @Override
    public int wordCount(String string) {
        string = string.trim();
        return spaceCountBetweenWords(string) + 1;
    }

    //Returns number of space between words but not as a number of digits.
    //Even if there is more than 2 digits space, it takes as one count of space
    @Override
    public int spaceCountBetweenWords(String string) {
        int count = 0;
        boolean isLastDigitSpace = false;
        string = string.trim();
        for (int i = 0; i < lengthOfString(string); i++) {
            if (string.charAt(i) == ' ' && !isLastDigitSpace) {
                count++;
                isLastDigitSpace = true;
            } else if (string.charAt(i) != ' ' && isLastDigitSpace) {
                isLastDigitSpace = false;
            }
        }
        return count;
    }

    //Returns number of character in a string but takes empty digits out
    // length - digit number of spaces
    @Override
    public int characterCount(String string) {
        int count = 0;
        for (int i = 0; i < lengthOfString(string); i++) {
            if (string.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    //Implemented instead of String.equals(String) method
    @Override
    public boolean areEqual(String target, String compareTo) {
        if (lengthOfString(target) == lengthOfString(compareTo)) {
            for (int i = 0; i < lengthOfString(target); i++) {
                if (target.charAt(i) != compareTo.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    //Implemented instead of String.length method
    @Override
    public int lengthOfString(String string) {
        CharacterIterator stringIterator
                = new StringCharacterIterator(string);
        int count = 0;
        while (stringIterator.current() != CharacterIterator.DONE) {
            count++;
            stringIterator.next();
        }
        return count;
    }

    //Implemented instead of String.concatenate(String) method
    @Override
    public String concatenateTwoString(String baseString, String additionalString) {
        return baseString + additionalString;
    }
}

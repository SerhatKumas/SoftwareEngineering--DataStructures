package StringLibrary;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;

public class StringMethodsImplementation implements CustomStringMethods, AuxiliaryMethods {
    @Override
    public boolean isPalindrome(String string) {
        return string.equals(reverse(string));
    }

    @Override
    public String reverse(String string) {
        StringBuilder newString = new StringBuilder();
        for (int i = lengthOfString(string) - 1; i >= 0; i--) {
            newString.append(string.charAt(i));
        }
        return newString.toString();
    }

    @Override
    public String removeSpace(String string) {
        return string.replace(" ", "");
    }

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

    @Override
    public int wordCount(String string) {
        string = string.trim();
        return spaceCountBetweenWords(string) + 1;
    }

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

    @Override
    public String concatenateTwoString(String baseString, String additionalString) {
        return baseString + additionalString;
    }
}

package StringLibrary;

public class PreDefinedMethods {
    public static void main(String[] args) {

        //String definition with new clause
        String stringShortTest = new String("Serhat");

        //String definition without new clause -> String string = "First test string without new clause for pre-defined methods class";
        String stringLongTest = " First test string without new clause test for pre-defined methods class : Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Aliquam sit amet libero et lorem consequat placerat non non libero. Vestibulum pre ante ipsum primis in faucibus orci luctus et ultrices " +
                "posuere cubilia curae; Nulla pharetra molestie purus, eu placerat magna semper sit amet. Sed in diam nec turpis elementum pretium. Nulla " +
                "facilisi. Pellentesque sit amet laoreet urna, quis aliquet enim. Sed risus felis, viverra eget ipsum vel, finibus mattis nunc. Praesent ac" +
                " odio in tortor malesuada aliquam et ac urna. Suspendisse ut pharetra augue. Nullam non lacus turpis. Cras vitae malesuada felis, in mattis" +
                " sapien. Duis interdum facilisis ante, et lacinia. ";


        //Returns the number of characters in the String.
        System.out.println(stringLongTest.length());

        //Returns the character at ith index.
        System.out.println(stringLongTest.charAt(10));

        //Return the substring from the ith  index character to end.
        System.out.println(stringLongTest.substring(10));

        //Returns the substring from first parameter to second parameter-1 index.
        System.out.println(stringLongTest.substring(10, 15));

        //Returns the index within the string of the first occurrence.
        System.out.println(stringLongTest.indexOf("pre"));

        //Returns the index within the string of the first occurrence of the specified string, after given index as parameter.
        System.out.println(stringLongTest.indexOf("pre", 50));

        //Returns the index within the string of the last occurrence of the specified string.
        System.out.println(stringLongTest.lastIndexOf("pre"));

        //Returns the index within the string of the last occurrence of the specified string, after given index as parameter.
        System.out.println(stringLongTest.lastIndexOf("pre", 20));

        //Compares this string to the specified object and returns either true or false
        System.out.println(stringShortTest.equals("Serhat"));

        //Compares this string to the specified object under ignoring case sensitivity and returns either true or false
        System.out.println(stringShortTest.equalsIgnoreCase("serhat"));

        //Compares two strings and returns integer value
        //out < 0  string1 comes before string2
        //out = 0  string1 and string2 are equal.
        //out > 0  string1 comes after string2.
        System.out.println(stringShortTest.compareTo("Serhat"));

        //Compares two strings and returns integer value under ignoring case sensitivity
        System.out.println(stringShortTest.compareTo("serhat"));

        //Converts all the characters in the String to lower case.
        System.out.println(stringLongTest.toLowerCase());

        //Converts all the characters in the String to upper case.
        System.out.println(stringLongTest.toUpperCase());

        //Removes whitespaces at both ends
        System.out.println(stringLongTest.trim());

        //Returns new string by replacing all occurrences of first parameter(target) with second parameter(replacement)
        System.out.println(stringLongTest.replace("e", "a"));

        //Returns true if string contains the given string
        System.out.println(stringLongTest.contains("pharetra"));

        //Reference : www.geeksforgeeks.org
    }
}

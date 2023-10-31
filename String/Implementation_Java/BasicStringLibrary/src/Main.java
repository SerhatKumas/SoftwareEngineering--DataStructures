import StringLibrary.StringMethodsImplementation;

public class Main {
    public static void main(String[] args) {

        StringMethodsImplementation controller = new StringMethodsImplementation();

        System.out.println(controller.isPalindrome("aabbccbbaa"));

        System.out.println(controller.reverse("String Testing"));

        System.out.println(controller.removeSpace("   string    testing   list   of   chars   of   string    "));

        System.out.println(controller.listOfCharsOfString("   string    testing   list   of   chars   of   string    "));

        System.out.println(controller.wordCount("   string    testing   list   of   chars   of   string    "));

        System.out.println(controller.spaceCountBetweenWords("   string    testing   list   of   chars   of   string    "));

        System.out.println(controller.characterCount("   string    testing   list   of   chars   of   string    "));

        System.out.println(controller.lengthOfString("   string    testing   list   of   chars   of   string    "));

        System.out.println(controller.areEqual("String", "String"));

        System.out.println(controller.concatenateTwoString("String","Library"));
    }
}
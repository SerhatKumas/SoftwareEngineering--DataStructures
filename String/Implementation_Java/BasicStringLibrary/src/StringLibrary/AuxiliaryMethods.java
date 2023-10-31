package StringLibrary;

public interface AuxiliaryMethods {
    /*These methods are already defined by programming language
    However to use in my methods, and understand their implementation logic
    I implemented again from my view of point*/

    //Implemented instead of String.equals(String) method
    boolean areEqual(String target, String compareTo);

    //Implemented instead of String.length method
    int lengthOfString(String string);

    //Implemented instead of String.concatenate(String) method
    String concatenateTwoString(String baseString, String additionalString);
}

import ArrayLibrary.ArrayMethodsImplementation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Method controller object
        ArrayMethodsImplementation controller = new ArrayMethodsImplementation();

        //    TEST CASES FOR ARRAY LIBRARY

        //Creating array and filling it up with random numbers according to given parameters
        int[] mockArray = controller.createArrayFilledWithRandomNumbers(25,1000);
        System.out.println(Arrays.toString(mockArray)); //controller.displayArray(mockArray);

        //Displaying array element by index number
        controller.displayArrayElementByIndex(mockArray,15);

        //Adding element to the end of the array
        mockArray = controller.addElementToArray(mockArray, 5987);
        mockArray = controller.addElementToArray(mockArray, 6987);
        System.out.println(Arrays.toString(mockArray));

        //Adding element to array by index number
        mockArray = controller.addElementToArrayByIndex(mockArray, 4987,10);
        System.out.println(Arrays.toString(mockArray));

        //Deleting element from array by giving element as parameter
        mockArray = controller.deleteElementFromArray(mockArray, 5987);
        System.out.println(Arrays.toString(mockArray));

        //Deleting element from array by index number
        mockArray = controller.deleteElementFromArrayByIndex(mockArray, 10);
        System.out.println(Arrays.toString(mockArray));

        //Updating element in array by giving elements that need to be changed from and to
        mockArray = controller.updateElementInArray(mockArray, 6987,7987);
        System.out.println(Arrays.toString(mockArray));

        //Updating element in array by index number and new element
        mockArray = controller.updateElementInArrayByIndex(mockArray, 8987,25);
        System.out.println(Arrays.toString(mockArray));

        //Reversing array
        mockArray = controller.reverseArray(mockArray);
        System.out.println(Arrays.toString(mockArray));

        //Displaying smallest element
        System.out.println(controller.smallestElement(mockArray));

        //Displaying biggest element
        System.out.println(controller.biggestElement(mockArray));

        //Displaying summation of all elements in array
        System.out.println(controller.sumOfAllElements(mockArray));

        //Sorting the int array
        mockArray = controller.sortArray(mockArray);
        System.out.println(Arrays.toString(mockArray));

        //Checking whether array is empty or not
        System.out.println(controller.isArrayEmpty(mockArray));

        //Checking whether array has duplicate element or not
        System.out.println(controller.hasDuplicateElements(mockArray));

        //Giving back the duplicate elements as an array
        System.out.println(Arrays.toString(controller.duplicateElements(mockArray)));

        //Checking whether given element is existed in array
        System.out.println(controller.isElementExisted(mockArray,25));

        //Cleans array by filling the whole array with 0s
        mockArray = controller.cleanAllTheArray(mockArray);
        System.out.println(Arrays.toString(mockArray));

    }
}
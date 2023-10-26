package ArrayLibrary;

public interface ArrayCRUDMethods {

    int[] addElementToArray(int[] array, int element);
    int[] addElementToArrayByIndex(int[] array, int element, int index);
    int[] deleteElementFromArray(int[] array, int element);
    int[] deleteElementFromArrayByIndex(int[] array, int index);
    int[] updateElementInArray(int[] array, int fromElement, int toElement);
    int[]  updateElementInArrayByIndex(int[] array, int newElement, int index);
    int[]  createArray(int size);
    int[]  createArrayFilledWithRandomNumbers(int lengthOfArray, int range);

}

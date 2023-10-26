package ArrayLibrary;
//Serhat Kumas

public class ArrayMethodsImplementation implements ArrayDisplayMethods, ArrayCRUDMethods, ArrayCustomMethods {
    @Override
    public void displayArray(int[] array) {
        //Displaying whole array
        for (int element : array) {
            System.out.println(element);
        }
        //System.out.println(Arrays.toString(array));
    }
    @Override
    public void displayArrayElementByIndex(int[] array, int index) {
        //Displaying requested element by given index number
        System.out.println((index+1)+".Element of Array : "+array[index]);
    }

    @Override
    public int[] cleanAllTheArray(int[] array) {
        //All elements are turned into 0s
        for (int i = 0 ; i < array.length ; i++) {
            array[i] = 0;
        }
        //Arrays.fill(array, 0);
        return array;
    }

    @Override
    public int[] reverseArray(int[] array) {
        //Reversing an array
        int[] newArray = new int[array.length];
        for (int i = 0, j = array.length-1 ; i < array.length ; i++, j--) {
            newArray[i] = array[j];
        }
        return newArray;
    }

    @Override
    public int[] sortArray(int[] array) {
        //Sorting array ins ascending order
        int temp = 0;
        for (int i = 0; i <array.length; i++) {
            for (int j = i+1; j <array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        //Arrays.sort(array);
        return array;
    }

    @Override
    public boolean isArrayEmpty(int[] array) {
        //Checks whether array is null or not
        return array.length == 0;
    }

    @Override
    public int biggestElement(int[] array) {
        //Sorts array and takes the highest number
        array = sortArray(array);
        return array[array.length-1];
    }

    @Override
    public int smallestElement(int[] array) {
        //Sorts array and takes the lowest number
        array = sortArray(array);
        return array[0];
    }

    @Override
    public boolean hasDuplicateElements(int[] array) {
        //Checks whether array has duplicate (repeating elements)
        for (int i = 0; i <array.length; i++) {
            for (int j = i+1; j <array.length; j++) {
                if(array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int[] duplicateElements(int[] array) {
        //Duplicate elements are listed and returned to user as array
        int[] newArray = new int[1];
        for (int i = 0; i <array.length; i++) {
            for (int j = i+1; j <array.length; j++) {
                if(array[i] == array[j] && !isElementExisted(newArray,array[i])) {
                    newArray = addElementToArray(newArray, array[i]);
                }
            }
        }
        return newArray;
    }

    @Override
    public int sumOfAllElements(int[] array) {
        //Returns summation of all elements in an array
        int summary = 0;
        for (int element : array) {
            summary += element;
        }
        return summary;
    }

    @Override
    public boolean isElementExisted(int[] array, int element) {
        //Checks whether requested element is existed in array or not
        for (int elem : array) {
            if(element == elem){
                return true;
            }
        }
        return false;
    }

    @Override
    public int[] addElementToArray(int[] array, int element) {
        //Adds given element to end of the array
        int[] newArray = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
           newArray[i] = array[i];
        }
        //System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = element;
        return newArray;
    }

    @Override
    public int[] addElementToArrayByIndex(int[] array, int element, int index) {
        //Adds given element to given index of the array
        int[] newArray = new int[array.length+1];
        for (int i = 0, j = 0; i <= array.length; i++,j++) {
            if (i==index) {
                newArray[i] = element;
                j--;
            }
            else{
                newArray[i] = array[j];
            }
        }
        /*
        System.arraycopy(array, 0, newArray, 0, index-1);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index+1, array.length-index);
        */
        return newArray;
    }

    @Override
    public int[] deleteElementFromArray(int[] array, int element) {
        //Deletes given element and all duplicates in an array
        int duplicateElementCount = 0;
        int numberOfDuplicateElementInArray = 0;
        for (int elem : array) {
            if (elem == element) {
                numberOfDuplicateElementInArray++;
            }
        }
        int[] newArray = new int[array.length-numberOfDuplicateElementInArray];
        for (int i = 0; i < array.length; i++) {
            if(array[i]==element){
                duplicateElementCount++;
            }
            else{
                newArray[i-duplicateElementCount] = array[i];
            }
        }
        return newArray;
    }

    @Override
    public int[] deleteElementFromArrayByIndex(int[] array, int index) {
        //Deletes element from given index of the array
        int[] newArray = new int[array.length-1];
        for (int i = 0, j = 0; i < array.length; i++,j++) {
            if (i!=index) {
                newArray[j] = array[i];

            }
            else{
                j--;
            }
        }
        return newArray;
    }

    @Override
    public int[] updateElementInArray(int[] array, int fromElement, int toElement) {
        //Updating element in array by giving elements that need to be changed from and to
        for (int i = 0; i < array.length; i++) {
            if(array[i]==fromElement){
                array[i] = toElement;
            }
        }
        return array;
    }

    @Override
    public int[] updateElementInArrayByIndex(int[] array, int newElement, int index) {
        //Updating element in array by index number and new element
        array[index] = newElement;
        return array;
    }

    @Override
    public int[] createArray(int size) {
        //Creates array according to given size
        return new int[size];
    }

    @Override
    public int[] createArrayFilledWithRandomNumbers(int lengthOfArray, int range) {
        // Creates array according to size and fills up with random number from 0 up to range
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            array[i] = (int) (Math.random() * range);
        }
        return array;
    }
}

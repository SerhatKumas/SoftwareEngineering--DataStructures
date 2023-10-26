package ArrayLibrary;

public class ArrayMethodsImplementation implements ArrayDisplayMethods, ArrayCRUDMethods, ArrayCustomMethods {
    @Override
    public void displayArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
        //System.out.println(Arrays.toString(array));
    }
    @Override
    public void displayArrayElementByIndex(int[] array, int index) {
        System.out.println((index+1)+".Element of Array : "+array[index]);
    }

    @Override
    public int[] cleanAllTheArray(int[] array) {
        for (int i = 0 ; i < array.length ; i++) {
            array[i] = 0;
        }
        //Arrays.fill(array, 0);
        return array;
    }

    @Override
    public int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0, j = array.length-1 ; i < array.length ; i++, j--) {
            newArray[i] = array[j];
        }
        return newArray;
    }

    @Override
    public int[] sortArray(int[] array) {
        int temp = 0;
        for (int i = 0; i <array.length; i++) {
            for (int j = i+1; j <array.length; j++) {
                if(array[i] >array[j]) {
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
        return array.length == 0;
    }

    @Override
    public int biggestElement(int[] array) {
        array = sortArray(array);
        return array[array.length-1];
    }

    @Override
    public int smallestElement(int[] array) {
        array = sortArray(array);
        return array[0];
    }

    @Override
    public boolean hasDuplicateElements(int[] array) {
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
        int summary = 0;
        for (int element : array) {
            summary += element;
        }
        return summary;
    }

    @Override
    public boolean isElementExisted(int[] array, int element) {
        for (int elem : array) {
            if(element == elem){
                return true;
            }
        }
        return false;
    }

    @Override
    public int[] addElementToArray(int[] array, int element) {
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
        for (int i = 0; i < array.length; i++) {
            if(array[i]==fromElement){
                array[i] = toElement;
            }
        }
        return array;
    }

    @Override
    public int[] updateElementInArrayByIndex(int[] array, int newElement, int index) {
        array[index] = newElement;
        return array;
    }

    @Override
    public int[] createArray(int size) {
        return new int[size];
    }

    @Override
    public int[] createArrayFilledWithRandomNumbers(int lengthOfArray, int range) {
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            array[i] = (int) (Math.random() * range);
        }
        return array;
    }
}

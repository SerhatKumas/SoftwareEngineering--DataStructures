//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();
        Heap h = new Heap();
        h.insert(array, 3);
        h.insert(array, 4);
        h.insert(array, 9);
        h.insert(array, 5);
        h.insert(array, 2);
        System.out.println("Max-Heap array: ");
        h.printArray(array, size);
        h.deleteNode(array, 4);
        System.out.println("After deleting an element: ");
        h.printArray(array, size);

    }
}

// Reference
// https://www.softwaretestinghelp.com/heap-data-structure-in-java/
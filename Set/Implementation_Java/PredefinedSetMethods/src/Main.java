import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*

        The set interface is present in java.util package and extends the Collection interface.

        As I mentioned in the documentation, set can be implemented through hash and set structure

        Most important difference between tree and hash is tree implementation will be ordered no in
        the order as we did with element addition, but hash implementation will be in order of element
        addition.

        */

        //2 different type of set implementation by java
        Set<String> setByHash = new HashSet<>();
        Set<String> setByTree = new TreeSet<>();

        //Element addition to Hash Set
        setByHash.add("Pre");
        setByHash.add("Defined");
        setByHash.add("Set");
        setByHash.add("Data");
        setByHash.add("Structure");
        setByHash.add("Methods");

        //Element addition to Tree set
        setByTree.add("Pre");
        setByTree.add("Defined");
        setByTree.add("Set");
        setByTree.add("Data");
        setByTree.add("Structure");
        setByTree.add("Methods");

        System.out.println(setByHash);
        System.out.println(setByTree);

        //Removing element from both sets
        setByHash.remove("Set");
        setByTree.remove("Pre");

        System.out.println(setByHash);
        System.out.println(setByTree);

        //Contains function checks whether given element is existed in the set
        System.out.println(setByHash.contains("Set"));
        System.out.println(setByTree.contains("Set"));

        //Printing size of the both sets
        System.out.println(setByHash.size());
        System.out.println(setByTree.size());


    }
}
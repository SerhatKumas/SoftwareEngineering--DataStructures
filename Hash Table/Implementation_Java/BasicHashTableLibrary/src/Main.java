import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Hash Table Manager initialization
        HashTableManager hashTableManager = new HashTableManager();
        //Hash Table creation
        ArrayList<HashTableRecord> hashTable = new ArrayList<>();
        //Creation of hash table records
        hashTableManager.addHashTableRecord(hashTable, "Hash Table", "Project");
        hashTableManager.addHashTableRecord(hashTable, "Data", "Structures");
        hashTableManager.addHashTableRecord(hashTable, "Hash", "Func");
        hashTableManager.addHashTableRecord(hashTable, "Hashing", "Table");
        //Hash table print out
        System.out.println(hashTableManager.hashTableToString(hashTable));
        //Update functions of the hash table
        hashTableManager.updateHashTableRecord(hashTable, "Hashing", "Function");
        hashTableManager.updateHashTableRecord(hashTable, "Hash", "Table");
        //Hash table print out
        System.out.println(hashTableManager.hashTableToString(hashTable));
        //Removing record from the hash table
        hashTableManager.deleteHashTableRecord(hashTable, "Hash Table");
        //Hash table print out
        System.out.println(hashTableManager.hashTableToString(hashTable));
        //Key of the hash table record by giving key print out
        System.out.println(hashTableManager.getKey(hashTable,"Structures"));
        //Value of the hash table record by giving value print out
        System.out.println(hashTableManager.getValue(hashTable, "Data"));
        //Function that check whether any of the hash table records has the given key
        System.out.println(hashTableManager.contains(hashTable, "Project"));
        System.out.println(hashTableManager.contains(hashTable, "Hash"));
    }
}
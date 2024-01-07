import java.util.ArrayList;

public class HashTableManager {

    public void addHashTableRecord(ArrayList<HashTableRecord> hashTable, String key, String value){
        HashTableRecord record = new HashTableRecord(key, value);
        hashTable.add(record);
    }

    public void deleteHashTableRecord(ArrayList<HashTableRecord> hashTable, String key){
        hashTable.removeIf(hashTableRecord -> hashTableRecord.key.equals(key));
    }

    public void updateHashTableRecord(ArrayList<HashTableRecord> hashTable, String key, String value){
        for (HashTableRecord hashTableRecord : hashTable){
            if (hashTableRecord.key.equals(key)){
                hashTableRecord.value = value;
            }
        }
    }

    public boolean contains(ArrayList<HashTableRecord> hashTable, String key){
        for (HashTableRecord hashTableRecord : hashTable){
            if (hashTableRecord.key.equals(key)){
                return true;
            }
        }
        return false;
    }

    public String getKey(ArrayList<HashTableRecord> hashTable, String value){
        for (HashTableRecord hashTableRecord : hashTable){
            if (hashTableRecord.value.equals(value)){
                return hashTableRecord.key;
            }
        }
        return "Given value can not be found";
    }

    public String getValue(ArrayList<HashTableRecord> hashTable, String key){
        for (HashTableRecord hashTableRecord : hashTable){
            if (hashTableRecord.key.equals(key)){
                return hashTableRecord.value;
            }
        }
        return "Given value can not be found";
    }

    public String hashTableToString(ArrayList<HashTableRecord> hashTable){
        StringBuilder string = new StringBuilder();
        for (HashTableRecord hashTableRecord : hashTable){
            string.append(hashTableRecord.key);
            string.append(" = ");
            string.append(hashTableRecord.value);
            string.append(", ");
        }
        return string.toString();
    }

}

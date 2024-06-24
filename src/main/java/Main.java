

public class Main {
  public static void main(String[] args) {


    System.out.println("Testing the Hash table datastructure: ");
    HashTable hashTable = new HashTable();
    hashTable.printHashTable();
    System.out.println("");

    System.out.println("Inserting the datas to the hash table: ");
    hashTable.set("Umay", 1);
    hashTable.set("Kutay", 2);
    hashTable.set("Asuman", 3);
    hashTable.set("Ugurcan", 4);
    hashTable.printHashTable();
    System.out.println("");

    System.out.println("Inserting the datas to the hash table: ");
    int wanted = hashTable.get("Umay");
    System.out.println("Value of Umay key: " + wanted);
    System.out.println("");
    
    System.out.println("Testing the keys function. ");
    System.out.println(hashTable.keys());
  }
}
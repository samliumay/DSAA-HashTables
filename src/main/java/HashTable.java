import java.util.ArrayList;

public class HashTable {
  private int size = 7;
  private Node[] dataMap;

  public HashTable() {
    dataMap = new Node[size];

  }

  public int hash(String key){
    int hash = 0;
    char [] keyChars = key.toCharArray(); 
    for(int i = 0; keyChars.length > i; i++){
      int asciiValue = keyChars[i];
      hash = hash + asciiValue*23;
    }
    return (hash % size);
  }

  public void set(String key, int value){
    int index = hash(key);
    Node newNode = new Node(key,value);

    Node temp = dataMap[index];
    if(temp == null){
      dataMap[index] = newNode;
    } else{

      while(temp.getNext() != null){
        temp = temp.getNext();
      }

      temp.setNext(newNode);
      
    }

  }

    public int get(String key){
      int index = hash(key);

      Node temp = dataMap[index];
      while(temp != null)
      {
        if(temp.getKey() == key){
          return temp.getValue();
        }
        temp = temp.getNext();
      }
    return -1;
    }
  

  public void printHashTable() {
    for (int i = 0; size > i; i++) {
      System.out.print(i + ": ");
      Node temp = dataMap[i];
      while (temp != null) {
        System.out.print("{" + temp.getKey() + ": " + temp.getValue() + "} -> ");
        temp = temp.getNext();
      }
      System.out.println("null");
    }
  }

  public ArrayList keys(){
    ArrayList<String> keys = new ArrayList<String>();
    
      for(int i = 0; size>i;i++){
        Node temp = dataMap[i];
        while(temp != null){
          keys.add(temp.getKey());
          temp = temp.getNext();
        }
      }
    
    return keys;
  }



}
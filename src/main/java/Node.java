/*
- Node -
- This is a class that we will be using a lot to create the stones of our data structures. 
- I asume that you know classes and OOP, if not I recomend to check OOP litle bit.
- So we basically create our class to create objects basically we can put thevalue we want and the references to other nodes. 
- Bu ising nodes we will able to jump other nodes if its connected to other nodes.
- Check the code and read the explanations if you do not understand. 
*/

public class Node {

  // Value we want to maintain inside the Node.
  private int value;
  // Value to maintain the references to the next node.
  private Node next;
  // Value of the
  private String key;

  // Constructor 2 (We are just putting the Value of this node.)
  public Node(String key, int value) {
    this.value = value;
    this.key = key;
    next = null;
  }

  // Getters and setters
  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

}
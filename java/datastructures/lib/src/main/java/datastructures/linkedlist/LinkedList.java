package datastructures.linkedlist;


public class LinkedList<T> {
  public Node<T> head = null;
  public Node<T> tail;
  public int listLength = 0;

  public void insert(T value){
    Node<T> newNode = new Node<>(value);
    if (head != null) {
      newNode.next = head;
    }
    if(head == null){
      tail = newNode;
    }
    head = newNode;
    listLength++;
  }

  public boolean includes(T value){
    if(this.head == null) return false;
    Node<T> currentNode = head;
    while(currentNode != null){
      if(currentNode.value == value){
        return true;
      }
      currentNode = currentNode.next;
    }
    return false;
  }

  @Override
  public String toString(){
    String result = "";
    if(head == null) {
      return "NULL";
    }
    Node<T> currentNode = head;
    while(currentNode != null){
      result = result + "[" + currentNode.value + "]";
      currentNode = currentNode.next;
    }
    result += "NULL";
    return result;
  }
}

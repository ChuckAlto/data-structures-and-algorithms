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

  public void append(T value){
    Node<T> newNode = new Node<>(value);
    tail.next = newNode;
    tail = newNode;
    listLength++;
  }

  public void insertBefore(T value, T match){
    Node<T> newNode = new Node<>(value);
    if(head.value == match){
      newNode.next = head;
      head = newNode;
    }
    Node<T> current = head;
    Node<T> prev = head;
    while(current != null){
      current = current.next;
      if(current.value == match){
        newNode.next = current;
        prev.next = newNode;
        break;
      }
      prev = current;
    }
    listLength++;
  }

  public void insertAfter(T value, T match){
    Node<T> newNode = new Node<>(value);
    Node<T> current = head;
    while(current != null){
      if(current.value == match){
        newNode.next = current.next;
        current.next = newNode;
        if(newNode.next == null){
          tail = newNode;
        }
      }
      current = current.next;
    }
    listLength++;
  }

  public T kthFromEnd(int k){
    if(k >= listLength || k < 0){
      return null;
    }
    int stopper = listLength - k;
    Node<T> current = head;
    for(int i = 0; i < stopper; i++){
      if(i == stopper - 1){
        return current.value;
      }
      current = current.next;
    }
    return null;
  }

}

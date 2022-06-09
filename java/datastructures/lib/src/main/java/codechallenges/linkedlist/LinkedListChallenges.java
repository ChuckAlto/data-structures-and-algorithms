//package codechallenges.linkedlist;
//
//import codechallenges.LinkedListNode;
//
//
//public class LinkedListChallenges<T> {
//  public Node<T> head = null;
//  public Node<T> tail;
//  public int listLength = 0;
//
//  public void insert(T val){
//    Node<T> newNode = new Node<>(val);
//    if (head != null) {
//      newNode.next = head;
//    }
//    if(head == null){
//      tail = newNode;
//    }
//    head = newNode;
//    listLength++;
//  }
//
//  public boolean includes(T key){
//    if(this.head == null) return false;
//    Node<T> currentNode = head;
//    while(currentNode != null){
//      if(currentNode.value == key){
//        return true;
//      }
//      currentNode = currentNode.next;
//    }
//    return false;
//  }
//
//  public void append(T val){
//    Node<T> newNode = new Node<>(val);
//    tail.next = newNode;
//    tail = newNode;
//
//    listLength++;
//  }
//
//
//
//}









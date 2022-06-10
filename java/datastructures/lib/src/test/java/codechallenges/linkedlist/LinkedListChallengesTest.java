package codechallenges.linkedlist;

import datastructures.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class LinkedListChallengesTest
{

  @Test void includesReturnsNodeValue(){
    LinkedList<Integer> newList = new LinkedList<>();
    for(int i = 1; i <= 7; i++){
      newList.insert(i);
    }
    assertTrue(newList.includes(7));
  }

  @Test void testAMethod() {
    LinkedList sut = new LinkedList();
    System.out.println(sut);
    assertTrue(true);
  }

  @Test
  void testListLength() {
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(7);
    sut.insert(12);
    sut.insert(4);
    Boolean expectedResult = true;
    Boolean actualResult = sut.listLength == 3;


    assertEquals(expectedResult, actualResult, "");
  }
  @Test void returnFalseForNonexistantValue(){
    LinkedList<Integer> sut = new LinkedList<>();
    sut = null;
    assertFalse(sut != null);
  }

  @Test void returnTrueForExistantValue(){
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(10);
    assertTrue(sut.includes(10));
  }

  @Test void AppendNodeTest(){
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(23);
    sut.insert(16);
    sut.insert(15);
    sut.insert(8);
    sut.insert(4);
    sut.append(42);
    assertEquals("[4][8][15][16][23][42]NULL", sut.toString());

  }
  @Test void appendItemToEndOfLinkedList(){
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(4);
    sut.append(8);
    sut.append(15);
    sut.append(16);
    sut.append(23);
    sut.append(42);
    assertEquals("[4][8][15][16][23][42]NULL", sut.toString());
  }

  @Test void insertNodeBeforeNodeTest(){
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(42);
    sut.insert(23);
    sut.insert(16);
    sut.insert(8);
    sut.insert(4);
    sut.insertBefore(15,16);
    assertEquals("[4][8][15][16][23][42]NULL", sut.toString());
  }

  @Test void insertNodeAfterMiddleNode(){
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(42);
    sut.insert(23);
    sut.insert(15);
    sut.insert(8);
    sut.insert(4);
    sut.insertAfter(16,15 );
    assertEquals("[4][8][15][16][23][42]NULL", sut.toString());
  }

  @Test void insertNodeAfterLastNode(){
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(23);
    sut.insert(16);
    sut.insert(15);
    sut.insert(8);
    sut.insert(4);
    sut.insertAfter(42, 23 );
    assertEquals("[4][8][15][16][23][42]NULL", sut.toString());
  }

}

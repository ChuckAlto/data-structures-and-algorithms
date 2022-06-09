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
}

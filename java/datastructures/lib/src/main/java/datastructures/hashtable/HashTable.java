package datastructures.hashtable;



import java.util.ArrayList;
import java.util.HashSet;



public class HashTable<K, V> {

  public ArrayList<V> contain;

  HashSet<K> keyCollection = new HashSet<>();

  public HashTable(int size) {
    contain = new ArrayList<>(size);
    for(int i = 0; i < size; i++) {
      contain.add(null);
    }
  }

  public void set(K key, V value) {
    int index = hash(key);
    contain.set(index, value);
    keyCollection.add(key);
  }

  public V get(K key) {
    int index = hash(key);
    return contain.get(index);
  }

  public boolean contains(K key) {
    int index = hash(key);
    return contain.get(index) != null;
  }

  public int hash(K key) {
    return key.hashCode() * 37 % 99;
   }

   public ArrayList<V> getContain(){
    return contain;
   }

   public void setBuckets(ArrayList<V> contain){
    this.contain = contain;
   }

   public HashSet<K> getKeyCollection() {
    return  keyCollection;
   }

   public void setKeyCollection(HashSet<K> keyCollection) {
    this.keyCollection = keyCollection;
   }

}

public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
  }
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
  }
  public int size(){
    return size;
  }
  public String toString(){
    return "";
   }
  public void addFirst(E element){

   }
  public void addLast(E element){
   }
  public E removeFirst(){
    return null;
   }
  public E removeLast(){
    return null;
   }
  public E getFirst(){
    return data[start];
  }
  public E getLast(){
    return data[end];
  }
}

import java.util.*;
public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = data.length-1;
    size = 0;
  }
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    start = 0;
    end = data.length-1;
    size = 0;
  }
  public int size(){
    return size;
  }
  public String toString(){
    String ans = "[";
    if(start<end){
      for(int i=start;i<end+1;i++){
        if(data[i]!=null){
          ans+=data[i].toString();
          ans+=" ";
        }
      }
    }
    else{
      for(int i=start;i<data.length;i++){
        if(data[i]!=null){
          ans+=data[i].toString();
          ans+=" ";
        }
      }
      for(int i=0;i<end+1;i++){
        if(data[i]!=null){
          ans+=data[i].toString();
          ans+=" ";
        }
      }
    }
    return ans+"]";
  }
  private void resize(){
  /*  E[] newdata = (E[]) new Object[size*2];
    if(start<end){
      for(int i=0;i<size;i++){
        newdata[i]=
      }
    }
    else{

    }
    */
  }
  public void addFirst(E element){
      if(element==null){
        throw new NullPointerException();
      }
      data[start]=element;
      size++;
  }
  public void addLast(E element){
      if(element==null){
        throw new NullPointerException();
      }
      size++;
   }
  public E removeFirst(){
    E ans = getFirst();
    data[start]=null;
    if(start==data.length-1){
      start=0;
    }
    else{
      start++;
    }
    size--;
    return ans;
   }
  public E removeLast(){
    E ans = getLast();
    data[end]=null;
    if(end==0){
      end=data.length-1;
    }
    else{
      end--;
    }
    size--;
    return ans;
   }
  public E getFirst(){
    if(size==0){
      throw new NoSuchElementException();
    }
    return data[start];
  }
  public E getLast(){
    if(size==0){
      throw new NoSuchElementException();
    }
    return data[end];
  }
}

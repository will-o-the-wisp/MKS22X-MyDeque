import java.util.*;
public class MyDeque<E>{
  private E[] data;
  private int size, start, end;
   public static void main(String[]args){
      MyDeque a = new MyDeque();
      a.addLast("hi");
      System.out.println(a);
   }
  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = 0;
    size = 0;
  }
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    start = 0;
    end = 0;
    size = 0;
  }
  public int size(){
    return size;
  }
  public String toString(){
    if(size==0){
      return "{}";
    }
    String ans = "{";
    if(start<=end){
      for(int i=start;i<end+1;i++){
          ans+=data[i].toString();
          ans+=" ";
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
    return ans+"}";
  }
  private void resize(){
    E[] newdata = (E[]) new Object[size*2];
    if(start<end){
      for(int i=0;i<size;i++){
        newdata[i]=data[start+i];
      }
    }
    else{
      /*for(int i=start;i<data.length;i++){
          newdata[i-start]=data[i];
        }
      }
      for(int i=0;i<end+1;i++){
          newdata[i-(data.length]=data[i];
        }
      }
      */
      int i=start;
      int j=0;
      while(i<data.length){
        newdata[j]=data[i];
        i++;
        j++;
      }
      i=0;
      while(i<end+1){
        newdata[j]=data[i];
        i++;
        j++;
      }
    }
    data=newdata;
    start=0;
    end=size-1;
  }
  public void addFirst(E element){
      if(element==null){
        throw new NullPointerException();
      }
      if(size==data.length){
        resize();
      }
      if(start==0){
        start=data.length-1;
      }
      else{
        start--;
      }
      data[start]=element;
      size++;
      if(size==1){
        end=start;
      }
  }
  public void addLast(E element){
      if(element==null){
        throw new NullPointerException();
      }
      if(size==data.length){
        resize();
      }
      if(end==data.length-1){
        end=0;
      }
      else{
        end++;
      }
      data[end]=element;
      size++;
      if(size==1){
        start=end;
      }
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

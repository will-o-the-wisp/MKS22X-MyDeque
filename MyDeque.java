public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = data.length-1;
    size = data.length;
  }
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    start = 0;
    end = data.length-1;
    size = data.length;
  }
  public int size(){
    return size;
  }
  public String toString(){
    String ans = "";
    if(start<end){
      for(int i=start;i<end+1;i++){
        ans+=E.toString();
        ans+=" ";
      }
    }
    else{
      for(int i=start;i<size;i++){
        ans+=E.toString();
        ans+=" ";
      }
      for(int i=0;i<end+1;i++){
        ans+=E.toString();
        ans+=" ";
      }
    }
    return ans;
  }
  private void resize(){
    E[] newdata = (E[]) new Object[size*2];
    //for()
  }
  public void addFirst(E element){
      data[start]=element;
  }
  public void addLast(E element){
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
    return ans;
   }
  public E getFirst(){
    return data[start];
  }
  public E getLast(){
    return data[end];
  }
}

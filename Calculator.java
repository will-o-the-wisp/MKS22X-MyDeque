import java.util.*;
public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static void main(String[] args){
      //for(int i=0;i<)
      //System.out.println(eval("3 4 +"));
    }
    private static String alts(ArrayList<String> a){
      String ans = "";
      for(int i=0;i<a.size();i++){
        ans+=a.get(i);
        ans+=",";
      }
      return ans;
    }
    public static double eval(String str){
      ArrayList<String> tokens = convert(str);
      MyDeque<Double> stack = new MyDeque<Double>(3);
      for(int i=0;i<tokens.size();i++){
        if(tokens.get(i).equals("+")){
          stack.addFirst(Double.valueOf(stack.removeFirst())+Double.valueOf(stack.removeFirst()));
        }
        else if(tokens.get(i).equals("-")){
          Double s = new Double(stack.removeFirst());
          Double f = new Double(stack.removeFirst());
          stack.addFirst(f-s);
        }
        else if(tokens.get(i).equals("*")){
          stack.addFirst(Double.valueOf(stack.removeFirst())*Double.valueOf(stack.removeFirst()));
        }
        else if(tokens.get(i).equals("/")){
          Double s = stack.removeFirst();
          Double f = stack.removeFirst();
          stack.addFirst(f/s);
        }
        else if(tokens.get(i).equals("%")){
          Double s = stack.removeFirst();
          Double f = stack.removeFirst();
          stack.addFirst(f%s);
        }
        else{
          stack.addFirst(Double.valueOf(tokens.get(i)));
        }
      }
      return stack.getFirst();
    }
    private static ArrayList<String> convert(String s){
      ArrayList<String> ans = new ArrayList<String>();
      int i=0;
      int j=0;
      while(i<s.length()+1){
        if(i==s.length()||s.charAt(i)==' '){
          ans.add(s.substring(j,i));
          j=i+1;
        }
        i++;
      }
      return ans;
    }
}

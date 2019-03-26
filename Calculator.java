import java.util.*;
public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static void main(String[] args){
      //for(int i=0;i<)
      //System.out.println(eval("3 4 +"));
    }
    public static double eval(String s){
      ArrayList<String> tokens = convert(s);
      MyDeque<Double> stack = new MyDeque<Double>(3);
      int i=0;
      while(i<tokens.size()){
        if(tokens.get(i)=="+"){
          stack.addFirst(Double.valueOf(stack.removeFirst())+Double.valueOf(stack.removeFirst()));
        }
        else if(tokens.get(i)=="-"){

        }
        else if(tokens.get(i)=="*"){

        }
        else if(tokens.get(i)=="/"){

        }
        else if(tokens.get(i)=="%"){

        }
        else{
          stack.addFirst(Double.valueOf(tokens.get(i)));
        }
        i++;
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

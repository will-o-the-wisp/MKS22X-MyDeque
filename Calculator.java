import java.util.*;
public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static void main(String[] args){
      ArrayList<String> a = convert("10 2.0 +");
      for(int i=0;i<a.size();i++){
        System.out.println(a.get(i));
      }
    }
    public static double eval(String s){
      return 0;
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
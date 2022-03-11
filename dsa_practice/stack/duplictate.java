package stack;
import java.util.*;

public class duplictate {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char a=str.charAt(i);
            if(a!=')')
            {
                st.push(a);
            }
            else{
                 if(a==')'&&st.peek()=='(')
                 {
                     System.out.println(true);
                     return;
                 }
                 else{
                     while(st.peek()!='(')
                     {
                         st.pop();
                     }
                     st.pop();
                 }
            }
    


        }
        System.out.println(false);
    
    }
    
}

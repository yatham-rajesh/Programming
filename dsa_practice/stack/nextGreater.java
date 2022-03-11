package stack;
import java.util.*;

public class nextGreater {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        int next[]=new int[n];
        st.push(arr[n-1]);
        next[n-1]=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(st.size()==0)
            {
                next[i]=-1;
                

            }
            else{
                while(st.size()!=0&&arr[i]>=st.peek())
                {
                    st.pop();
                }
                if(st.size()==0)
                   next[i]=-1;
                else{
                    next[i]=st.peek();
                }
            }
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"->"+next[i]);
        }

    }
    
}

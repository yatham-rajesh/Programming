package generictree;
import java.util.*;
class Node{
    int data;
    ArrayList<Node> children =new ArrayList<>();

}
public class gtree {
    //we use stack for constructing generict tree
    //we iterate throw given array if data==-1 then we pop node
    //else we create temporary node and we set data and we add it to statcks top node children
    public static void main(String[] args) {
        int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,150,-1,-1,-1   };
        Node root;
        Stack<Node> st=new Stack<>();
        for(int i=0;i<arr.length;i++)

        {
            if(arr[i]==-1)
            {
                st.pop();
            }
            else{
                //create node and set data
                Node temp=new Node();
                temp.data=arr[i];
                //if the stack is empty that means presnt node is root
                if(st.size()==0)
                {
                    root=temp;
                }
                else{
                    st.peek().children.add(temp);
                }
                st.push(temp);

            }
        }
    
}
}
package generictree;
import java.util.*;
class Node{
    int data;
    ArrayList<Node> children =new ArrayList<>();

}
public class gtreeDisplay {
    //dipslay funtino
    public static void display(Node root)
    {
        //we are printting tree using recursion
        //we have fiath that if we call display funtion for root chhildren it will print all children
        //so before callinf=g childrens display funtion we need print current node data
        System.out.println(root.data);
        for(Node child:root.children)
        {
            display(child);

        }
         return;
    }
    public static int  max(Node root)
    {
        int max=Integer.MIN_VALUE;
        //we will find the maximum elemnt of its childrens and their children
        for(Node child:root.children)
        {
            int val=max(child);
            if(val>max)
                max=val;
            
        }
        //we have found maximum of all childrens of root
        //so we have to check root data with maximum 
        if(root.data>max)
          max=root.data;
        return max;
        
    }
    public static void main(String[] args) {
        int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,150,-1,-1,-1   };
        Node root=null;
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
        display(root);
        System.out.println("Max elelemnet:"+max(root));
    }
    
}

import java.util.*;
public class LargestAreaInHistogram {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int []ls=new int[n];
        int []rs=new int[n];
        Stack<Integer> left=new Stack<>();
        //if no smaller element is found then asign index -1;
        ls[0]=-1;
        //first push last elemnt to stack
        left.push(0);
        for(int i=1;i<n;i++)
        {
            //- a + pop push 
            while(left.size()!=0&&arr[i]<=arr[left.peek()])
            {
              left.pop();  
            }
            if(left.size()==0)
            {
                ls[i]=-1;

            }
            else{
                ls[i]=left.peek();
            }
            left.push(i);
            

        }
        Stack<Integer> right=new Stack<>();
        //if no smaller element is found then asign index n;
        rs[n-1]=n;
        //first push last elemnt to stack
        right.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            //- a + pop push 
            while(right.size()!=0&&arr[i]<=arr[right.peek()])
            {
              right.pop();  
            }
            if(right.size()==0)
            {
                rs[i]=n;

            }
            else{
                rs[i]=right.peek();
            }
            right.push(i);
            

        }
        int max=0;
        //calcutaltintn max area
        //width=ls[i]+rs[i]-1;
        //area=arr[i]*width
       


        for(int i=0;i<n;i++)
        {
           int width=-ls[i]+rs[i]-1;
           int area=arr[i]*width;
           if(area>max) max=area;
        }
        System.out.println(max);





        }
    
}

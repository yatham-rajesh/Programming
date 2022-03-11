import java.util.*;
public class subsetsum {
    public static void targetSum(int []arr,int ind,String asf,int csum,int tar)
    {  //base case
        if(ind==arr.length)
        {
            if(csum==tar)
            {
                System.out.println(asf+"="+tar);
            }
            return;
        }
        targetSum(arr,ind+1,asf+"+"+arr[ind],csum+arr[ind],tar);
        targetSum(arr,ind+1,asf,csum,tar);
    }
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in) ; 
    int[] arr={10,20,30,40};
      int n=scn.nextInt();
      targetSum(arr,0,"",0,n);


  }
    
}

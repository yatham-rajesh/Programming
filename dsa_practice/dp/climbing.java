package dp;
import java.util.*;

public class climbing {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr={1,1,1,4,9,8,1,1,10,1};
        Integer [] dp=new Integer[n+1];
        dp[n]=0;
        for(int i=n-1;i>=0;i--)
        {  if(arr[i]>0){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=arr[i]&&i+j<n+1;j++)
            {
                if(dp[j+i]!=null)
                 min=Math.min(min,dp[j+i]);
            }
            if(min!=Integer.MAX_VALUE)
               dp[i]=1+min;}
               
        
        }
        System.out.println(dp[0]);
    }
    
}

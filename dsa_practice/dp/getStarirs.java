package dp;
import java.util.*;

public class getStarirs {
    public static int getCount(int n)
    {   if(n==0 || n==1)
          return 1;
        else if(n==2)
          return 2;
        int []dp=new int[n+1];
        dp[0]=1;
        
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=getCount(n);
        System.out.println(count);

    }
    
}

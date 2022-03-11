package dp;
import java.util.*;

public class goldmine {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int [][]arr=new int [m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        int [][]dp=new int[m][n];
        dp[m-1][n-1]=arr[m-1][n-1];
        for(int i=n-2;i>=0;i--)
        {
            dp[m-1][i]=dp[m-1][i+1]+arr[m-1][i];
        }
        for(int i=m-2;i>=0;i--)
        {
            dp[i][n-1]=dp[i+1][n-1]+arr[i][n-1];
        }
        for(int i=m-2;i>=0;i--)
        {
            for(int j=n-2;j>=0;j--)
            {
              int min1=Math.max(dp[i+1][j],dp[i+1][j+1]);
              dp[i][j]=Math.max(min1,dp[i][j+1])+arr[i][j];

            }
            
        
        }
        int min=dp[0][0];
        for(int i=1;i<m;i++)
            {
               min=Math.max(min,dp[i][0]);
                
            }
            System.out.println(min);

         

    }

    
}

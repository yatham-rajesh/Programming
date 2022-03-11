package dp;
import  java.util.*;

public class targetSum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int arr[]=new int [m];
        for(int i=0;i<m;i++)
        {
            arr[i]=scn.nextInt();

        }
        int n=scn.nextInt();
        boolean dp[][]=new boolean[m+1][n+1];
        //intializing first row
        for(int i=1;i<n;i++)
        {
            dp[0][i]=false;
        }
        for(int i=0;i<m;i++)
        {
            dp[i][0]=true;
        }
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(j<arr[i-1])
                {
                    dp[i][j]=dp[i-1][j];

                }
                else
                {
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
                }
            }
        }
     

        System.out.println(dp[m][n]);

    }
    
}

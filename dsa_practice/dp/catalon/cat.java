package dp.catalon;
import java.util.*;

public class cat {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++)
        {
            int c1=0;
            int c2=i-1;
            for(int j=0;j<i;j++)
            {
                dp[i]+=dp[c1++]*dp[c2--];
            }
        }
        System.out.println(dp[n]);
    }
    
}

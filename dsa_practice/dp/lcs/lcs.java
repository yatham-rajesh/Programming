package dp.lcs;
import java.util.*;

public class lcs {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str1=scn.next();
        String str2=scn.next();
        int [][]dp=new int [str1.length()+1][str2.length()+1];
     
        for(int i=str1.length();i>=0;i--)
        {
            for(int j=str2.length();j>=0;j--)
            {
                if(i==str1.length()|| j==str2.length())
                  dp[i][j]=0;
                else if(str1.charAt(i)==str2.charAt(j))
                {
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        System.out.println(dp[0][0]);
        
    }
    
}

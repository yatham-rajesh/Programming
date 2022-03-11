package dp;
import java.util.*;
import java.io.*;
public class lis {
    public static void main(String[] args) throws Exception{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int []arr=new int[n];
        String []in=br.readLine().split(" ");
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(in[i]);
        }
        int []dp=new int [n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            int val=arr[i];
            int maxlength=0;
            for(int j=0;j<i;j++)
            {
                if(val>arr[j]&&maxlength<dp[j])
                {
                    maxlength=dp[j];
                }
            }
            dp[i]=1+maxlength;

        }
        int ans=dp[0];
        for(int i=0;i<n;i++)
        {
            if(dp[i]>ans)
             ans=dp[i];
        }
        System.out.println(ans);




       

        
    }

    
}

package dp;
import java.util.*;

public class longestBitonicSubsequence {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int []lis=new int [n];
        int  []lds=new int[n];
        lis[0]=1;
        lds[n-1]=1;
        for(int i=0;i<n;i++)
        {
            int val=arr[i];
            int max=0;
            for(int j=0;j<i;j++)
            {
                if(arr[j]<val&& lis[j]>max)
                  max=lis[j];
            }
            lis[i]=1+max;
        }
        for(int i=n-1;i>=0;i--)
        {
            int val=arr[i];
            int max=0;
            for(int j=n-1;j>=0;j--)
            {
                if(arr[j]<val&& lds[j]>max)
                  max=lis[j];
            }
            lds[i]=1+max;
        }
        int ans=lis[0]+lds[0]-1;
        for(int i=0;i<n;i++)
        {
            if(ans<lis[i]+lds[i]-1)
              ans= lis[i]+lds[i]-1;
        }
        System.out.println(ans);


        
    }
    
}

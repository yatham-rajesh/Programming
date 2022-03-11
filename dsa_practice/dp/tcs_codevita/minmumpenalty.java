
import java.util.*;

public class minmumpenalty {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        int [][]dp=new int[n][n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        for(int gap=0;gap<n;gap++)
        {
           for(int i=0,j=gap;j<n;j++,i++){
              
               
               if(gap==0)
               {
                   if(i==0)
                   {
                       dp[i][j]=arr[i]*arr[i+1];

                   }
                   else if(j==n-1)
                   {
                       dp[i][j]=arr[j]*arr[i-1];
                   }
                   else{
                       dp[i][j]=(arr[i]*Math.max(arr[i+1],arr[i-1]))-Math.min(arr[i+1],arr[i-1]);
                   }
               }
               else{
                   int max=Integer.MIN_VALUE;
                   for(int k=i;k<=j;k++)
                   {   int left=0;
                       int right=0;
                       int val;
                       if(i!=k)
                       {  
                           left=dp[i][k-1];
                       }
                       if(k!=j)
                       {   
                            
                           right=dp[k+1][j];
                       }
                       if(i==0 )

                       {
                           if(j!=n-1)
                           val=arr[k]*arr[j+1];
                           else
                             val=arr[k];


                       }
                        else  if(j==n-1)




                        
                        {  if(i==0)
                            val=arr[k];
                            else
                            val=arr[k]*arr[i-1];

                        }
                        else
                       val= (arr[k]*Math.max(arr[i-1],arr[j+1]))-Math.min(arr[i-1],arr[j+1]);
                      int   ans=val+left+right;
                      

                      
                       if(ans>max)
                       {
                           max=ans;
                       }
                   }
                 
                   

                   dp[i][j]=max;
               }
               
             

           }
        


        }
     System.out.println(dp[0][n-1]);
        
    }
    
}

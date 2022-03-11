package dp;
import java.util.*;

public class coinChangePermute {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int m=scn.nextInt();
    int []arr=new int [m];

    for(int i=0;i<m;i++)
    {

        arr[i]=scn.nextInt();


    }
    int tar=scn.nextInt();

    int []dp=new int[tar+1];
    dp[0]=1;
    for(int i=1;i<dp.length;i++)
    {
       for(int j=0;j<arr.length;j++)
       {
           if(i>=arr[j])
           {
               dp[i]+=dp[i-arr[j]];
           }
       }
    }
    System.out.println(dp[tar]);




  }
    
}

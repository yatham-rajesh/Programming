package dp.palindrom;
import java.util.*;

public class longestPalindromicString {
   public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    String str=scn.next();
    //since we need two print longest palindromic string we need two dp
    //first one is boolean which will indicate that cuurent substring is palindrome or not
    //second for length
    //for 
    boolean [][]dp=new boolean [str.length()][str.length()];
    int  [][]count=new int [str.length()][str.length()];
    int start=0;
    int length=0;
    for(int g=0;g<str.length();g++)
    {
        for(int i=0,j=g;j<str.length();j++,i++)
        {
            if(g==0)
            {
                dp[i][j]=true;
                count[i][j]=1;
                
            }
            else if(g==1)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    dp[i][j]=true;
                    count[i][j]=2;

                }
            }
            else{
                if(str.charAt(i)==str.charAt(j)&&dp[i+1][j-1])
                {
                    dp[i][j]=true;
                    count[i][j]=2+count[i+1][j-1];
                }
            }
            if(count[i][j]>length)
            {
                length=count[i][j];
                start=i;
            }



        }
    }
    String ans="";
    for(int i=0;i<length;i++)
    {
        ans+=str.charAt(start++);
    }
    System.out.println(ans);

   }


}

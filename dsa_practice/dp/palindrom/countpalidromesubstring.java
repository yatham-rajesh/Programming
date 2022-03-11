package dp.palindrom;
import java.util.*;

public class countpalidromesubstring {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        boolean [][]dp=new boolean[str.length()][str.length()];
        int count=0;
        //using gap strategy
        for(int g=0;g<str.length();g++)
        {
            for(int i=0,j=g;j<str.length();j++,i++)
            {
                if(g==0)//that means only one character is there
                {
                    dp[i][j]=true;

                }
                else if(g==1)//two charaectres are there
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        dp[i][j]=true;
                    }

                }
                else{
                    if(str.charAt(i)==str.charAt(j)&&dp[i+1][j-1])
                    {
                        dp[i][j]=true;
                    }
                }
                if(dp[i][j]) count++;
            }


        }
        System.out.println(count);
    }
    
}

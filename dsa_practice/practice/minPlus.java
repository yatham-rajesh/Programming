package practice;
import java.util.*;

public class minPlus {
    public static int getCount(String str,int count,int num)
    {
        if(str.length()==0)
        {
            return Integer.MAX_VALUE;
        }
        if(Integer.parseInt(str)==num)
        {  
            return count;
        }
        int ans=Integer.MAX_VALUE;

      for(int i=1;i<str.length()-1;i++)

      {
          String first=str.substring(0,i);
          String second=str.substring(i);
          int  ansf=getCount(second,count+1,num-Integer.parseInt(first));
           if(ansf<ans)
           {
           
               ans=ansf;
           }

      }
      return ans;

    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        int num=scn.nextInt();
        int ans=getCount(str,0,num);
        if(ans!=Integer.MAX_VALUE)
        System.out.println(ans);
        else
          System.out.println("-1");
        
    }
    
}












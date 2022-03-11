package dp;
import java.util.*;

public class MaximumsumNonAdjacent {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int []inc=new int[n];
        int []exc=new int[n];
        inc[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            inc[i]=arr[i]+exc[i-1];
            exc[i]=Math.max(inc[i-1],exc[i-1]);

        }
        System.out.println(Math.max(exc[n-1],inc[n-1]));


    }
    
}

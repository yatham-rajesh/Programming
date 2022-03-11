package kadans;
import java.util.*;
public class kadans {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int max_sum=arr[0];
        int cur_sum=arr[0];
        for(int i=1;i<n;i++)
        {     if(cur_sum<0) cur_sum=0;
           
            max_sum=Math.max(cur_sum+=arr[i],max_sum);
            

        }
        System.out.println(max_sum);
    }
}

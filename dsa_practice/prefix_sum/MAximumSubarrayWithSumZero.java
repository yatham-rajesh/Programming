package prefix_sum;
import java.util.*;

public class MAximumSubarrayWithSumZero {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        HashMap<Integer,Integer> hp=new HashMap<>();
        hp.put(0,-1);
        int max_length=0;
        int start=0;
        int end=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(!hp.containsKey(sum))
            {
                hp.put(sum,i);
            }
            else{
                start=hp.get(sum)+1;
                end=i;
                max_length=Math.max(max_length,i-hp.get(sum));
            }
        }
        for(int i=start;i<=end;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("=0:length="+max_length);
    }
    
}

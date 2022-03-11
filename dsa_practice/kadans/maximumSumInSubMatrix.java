package kadans;
import java.util.*;

public class maximumSumInSubMatrix {
    //coverted 2d into one 1d array 
    //for 1d array we can calculate maximum subarray sum by using kadans algorithm
   
    public static int kadan(int [ ]arr)
    {
        int max_sum=arr[0];
        int cur_sum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(cur_sum<0)  cur_sum=0;
            max_sum=Math.max(cur_sum+=arr[i],max_sum);


        }
        return max_sum;

    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int  [][]mat= { { 1, 2, -1, -4, -20 },
        { -8, -3, 4, 2, 1 },
        { 3, 8, 10, 1, 3 },
        { -4, -1, 1, 7, -6 } };
        int max_sum =Integer.MIN_VALUE;
        int cur_sum=max_sum;
        for(int i=0;i<mat.length;i++)
        {
            int []arr=new int[mat[0].length];//since considering row column length;
            for(int row=i;row<mat.length;row++)

            {
                for(int col=0;col<mat[0].length;col++)
                {
                    arr[col]+=mat[row][col];
                }
              max_sum=  Math.max(max_sum,kadan(arr));
            }
        }
        System.out.println(max_sum);
    }
    
}

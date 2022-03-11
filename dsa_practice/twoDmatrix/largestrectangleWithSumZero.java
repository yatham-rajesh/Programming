package twoDmatrix;
import java.util.*;

public class largestrectangleWithSumZero {
    public static int[] prefix(int []arr)
    {
      
        int []res=new int[2];
        res[0]=-1;
        res[1]=-1;
        int max_length=0;
        int sum=0;
        HashMap<Integer,Integer> hp=new HashMap<>();
        hp.put(0,-1);
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(!hp.containsKey(sum))
            {
                hp.put(sum,i);
            }
            else{
                 if(i-hp.get(sum)>max_length)
                 {
                     res[0]=hp.get(sum)+1;
                     res[1]=i;
                     max_length=i-hp.get(sum);

                 }


            }
        }
        return res;
    }


    public static void main(String[] args) {
        int [][]mat={ { 9, 7, 16, 5 }, { 1, -6, -7, 3 },
        { 1, 8, 7, 9 }, { 7, -2, 0, 10 } };
         int start_row=0;
         int start_col=0;
         int end=0;
         int end_row=0;
        
         int area=0;
         for(int i=0;i<mat.length;i++)//this is for row wise iteration
         {
             //every time new array is created for merging the subarrays
           
             int []arr=new int[mat[0].length];
             for(int row=i;row<mat.length;row++)
             {
                 for(int col=0;col<mat[0].length;col++)
                 {
                     arr[col]+=mat[row][col];
                
                 }
                 int res[]=prefix(arr);
                 //to calculate area area=(res[0]-res[1])*(i-row);
               
                 
                 if(res[0]!=-1&& area<((res[0]-res[1])*(i-row)))
                 {
                     start_row=i;
                     start_col=res[0];
                     end=res[1];
                     end_row=row;
                     
                   
                 }
             }
         }
         for(int i=start_row;i<=end_row;i++)
         {
            for(int j=start_col;j<=end;j++)
            {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
         }


          
    }
    
}

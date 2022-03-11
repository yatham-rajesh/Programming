package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class infytq {
    boolean [][]visit=new boolean[100001][100001];
    public static int check(int [][]chess,int i,int j)
    {
        int count=1;
        //diagonal
        if(j!=chess[0].length)
        {     
            int row=i+1;
            for(int col=j+1;col<chess[0].length;col++)
            {
                if(chess[row][col]==1)
                {
                  count++;
                  visit[]
                }

            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(sc.readLine());
        int [][]chess=new int[n][n];
        int m=Integer.parseInt(sc.readLine());;
        
        int [][]arr=new int[m][2];
        int j=0;
        for(int i=0;i<m;i++ )
        {  String str=sc.readLine();
            String []in=str.split(" ");
            arr[i][0]=Integer.parseInt(in[0]);
            arr[i][1]=Integer.parseInt(in[1]);


        }
        for(int i=0;i<m;i++)
        {
            chess[arr[i][0]][arr[i][1]]=1;
        }
       

   

    }
    
}

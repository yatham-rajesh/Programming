
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class coinCollection {
    static int count=0;
    static int  drawComponent(String  [][]arr,int i,int j,boolean visited[][])
    {  
       visited[i][j]=true;
       count++;
       //every cell is connected to four dir so
       //1st cell
       if(i>0&&arr[i-1][j].equals("C")&&visited[i-1][j]==false)
       drawComponent(arr,i-1,j,visited);
         //1st cell
       if(i<arr.length-1&&arr[i+1][j].equals("C")&&visited[i+1][j]==false)
       drawComponent(arr,i+1,j,visited);
         //1st cell
       if(j<arr[0].length-1&&arr[i][j+1].equals("C")&&visited[i][j+1]==false)
       drawComponent(arr,i,j+1,visited);
         //1st cell
       if(j>0&&arr[i][j-1].equals("C")&&visited[i][j-1]==false)
       drawComponent(arr,i,j-1,visited);
         return count;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
    
      String[][] arr = new String[m][m];

      for (int i = 0; i < m; i++) {
         String parts = br.readLine();
         for (int j = 0; j < m; j++) {
            arr[i][j] = String.valueOf(parts.charAt(j));
         }
      }
    
      boolean visited[][]=new boolean[m][m];
      ArrayList<Integer> ans=new ArrayList<>();

      for(int i=0;i<m;i++)
      {
         for(int j=0;j<m;j++)
         {
            if(arr[i][j].equals("C")&&visited[i][j]==false)
            {   count=0;
             ans.add( drawComponent(arr,i,j,visited));        
            }
         }
      }
      Collections.sort(ans);
      
      int player1=0;
      int player2=0;
      for(int i=ans.size()-1;i>=0;i--)
      {
          if(i%2==0)
          {
              player1+=ans.get(i);
          }
          else
          {
              player2+=ans.get(i);
          }
      }
      System.out.println(player1+" "+player2);
    }
    
}

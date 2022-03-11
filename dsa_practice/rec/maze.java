import java.util.*;
public class maze {
    public static ArrayList<String> Paths(int sr,int sc,int dr,int dc)
    {   //base case
        if(sr==dr && dr==dc)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;

        }
        ArrayList<String> h=new ArrayList<>();
        ArrayList<String> v=new ArrayList<>();
        if(sr>dr)
        {
            ArrayList<String> v=Paths(sr+1,sc,dr,dc);
            
        }
        if(sc>dc)
        {
            ArrayList<String> h=Paths(sr,sc+1,dr,dc);
        }


        ArrayList<String> h=Paths(sr,sc+1,dr,dc);
        ArrayList<String> v=Paths(sr+1,sc,dr,dc);
        ArrayList<String> res=new ArrayList<>();
        for(String val:h)
        {
            res.add("h"+val);
        }
        for(String val:v)
        
        {
            res.add("v"+val);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        ArrayList<String> res=Paths(1,1,m,n);
        System.out.println(res);
        
    }
    
}

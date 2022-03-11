import java.util.*;
public class climbstaris {
    public static ArrayList<String> getPaths(int n)
    {//base case
        if(n==0)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(n<0)
        {
            ArrayList<String> base2=new ArrayList<>();
         
            return base2;
        }



        ArrayList<String> p1=getPaths(n-1);
        ArrayList<String> p2=getPaths(n-2);
        ArrayList<String> p3=getPaths(n-3);
        ArrayList<String> res=new ArrayList<>();
        for(String val:p1)
        {
            res.add(1+val);
        }
        for(String val:p2)
        {
            res.add(2+val);
        }
        for(String val:p3)
        {
            res.add(3+val);
        }
        return res;



    }

    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String> res=getPaths(n);
        System.out.println(res);
    }
}

import java.util.*;
package rec;
class subSequence{
    public static ArrayList<String> sub(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char a=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> temp=sub(ros);//expectation
        //meeting expectation with faith
        ArrayList<String> res=new ArrayList<>();
        for(String val:temp)
        {
            res.add(""+val);
        }
        for(String val:temp)
        {
            res.add(a+val);
        }
        return res;
        
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        ArrayList<String> res=sub(str);
        System.out.println(res);

    }
}
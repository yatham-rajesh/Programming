

import java.util.*;
public class keyboard {
    static String [] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKbc(String str)
    {
        //base cae
        if(str.length()==0)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char a=str.charAt(0);//5
        String ros=str.substring(1);//78
        ArrayList<String> tres=getKbc(ros);
        ArrayList<String> res=new ArrayList<>();
        String cur=codes[a-'0'];
        for(int i=0;i<cur.length();i++)
        {
            char cchar=cur.charAt(i);
            for(String val:tres)
            {
                res.add(cchar+val);
            }

        }
        return res;



        

    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        ArrayList<String> res=getKbc(str);
        System.out.println(res);
    }
    
}

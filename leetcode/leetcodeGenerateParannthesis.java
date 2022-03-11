class Solution {
    List<String> ans=new ArrayList<>();
    public void sol(StringBuilder str,int ob,int cl,int osf,int csf )
    {
        
        if(ob==0&& cl==0)
        {
            ans.add(str.toString());
            return ;
        }
        
        
        
        if(ob>0)
        {
            str.append('(');
            sol(str,ob-1,cl,osf+1,csf);
            
            str.deleteCharAt(str.length()-1);
        
        }
        if(cl>0&&csf<osf)
        {
            str.append(')');
            sol(str,ob,cl-1,osf,csf+1);
            str.deleteCharAt(str.length()-1);
        }
    
        
        

        
    }
    public List<String> generateParenthesis(int n) {
       
        
        
        StringBuilder an=new StringBuilder("(");
        int ob=n-1;
        int cb=n;
        int osf=1;
        int csf=0;
        sol(an,ob,cb,osf,csf);
          return ans;
         
        
            
        
            
        
            
            
        
    }
}
}

class leetcode48validangram {
    public List<List<String>> groupAnagrams(String[] strs) {
        //ths is for storing sorted string and ndex in whic we are storing
        HashMap<String,Integer> hp=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
        int index=0;
        int empty=0;
        for(int i=0;i<strs.length;i++)
        {   if(strs[i].length()==0)
          { 
            empty++;
            continue;
            
        

            
           
                 
            }
            String a=strs[i];
         
            char[] temp=a.toCharArray();
            Arrays.sort(temp);
            String b=String.valueOf(temp);
           
            ;
            if(!hp.containsKey(b))
            {
                hp.put(b,index++);
                List<String> list=new ArrayList<>();
                list.add(a);
                ans.add (list);
               
            }
            else
                
            {
                int count=hp.get(b);
                ans.get(count).add(a);
            }
            
        }
        
        List<String> mt=new ArrayList<>();
        for(int i=0;i<empty;i++)
        {
            mt.add("");
        }
        if(empty!=0)
        ans.add(mt);
        return ans;
        
    }
}
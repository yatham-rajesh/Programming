class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
  
        
        Set<List<Integer>> list=new HashSet<>();
   
        Arrays.sort(nums);
        /// i have solve this is using two pointers 
        ///before using  threee pointers we havee to sort the given elements
        //andi used set<list<>> for not including any duplicate triplets
        //and applied two pointers 
        for(int i=0;i<nums.length;i++)
        {  
            int sum=-nums[i];
            int left=i+1;
            int right=nums.length-1;
            
            while(left<right)
            {
                int cur_sum=(nums[left]+nums[right]);
            
                if(cur_sum<sum)
                {
                    left++;
                }
                else if(cur_sum>sum)
                {
                    right--;
                }
                else
                {   List<Integer> ll=new ArrayList<>();
                    ll.add(-sum);
                    ll.add(nums[left]);
                    ll.add(nums[right]);
                 if(!list.contains(ll))
                     list.add(ll);
                    left++;
                    right--;
                }
            }
          
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> temp:list)
        {
            ans.add(temp);
        }
        return ans;
                                                   
    
    }
    }
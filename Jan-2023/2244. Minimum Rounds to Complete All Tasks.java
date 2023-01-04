class Solution 
{
    public int minimumRounds(int[] tasks) 
    {
        Map<Integer,Integer> hm = new HashMap<>();
        int result=0;

        for(int i:tasks)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> e:hm.entrySet())
        {
            int key = e.getKey();;
            int val = e.getValue();
            
            if(val<2)
            {
                return -1;
            }
            else if(val==2)
            {
                result+=1;
            }
            else
            {
                double res=val/3.0;
                result+=Math.ceil(res);
            }
        }
        return result;
    }
}

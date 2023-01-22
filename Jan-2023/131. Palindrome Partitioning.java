class Solution 
{
    public List<List<String>> partition(String s) 
    {
        List<List<String>> res = new ArrayList();
        List<String> path = new ArrayList();
        helper(0,s,path,res);
        return res;
    }
    public void helper(int ind,String s,List<String> path,List<List<String>> res)
    {
        //base case
        if(ind==s.length())
        {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=ind;i<s.length();i++)
        {
            if(isPal(s,ind,i))
            {
                path.add(s.substring(ind,i+1));
                helper(i+1,s,path,res);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean isPal(String str,int start,int end)
    {
        while(start<=end)
        {
            if(str.charAt(start++)!=str.charAt(end--))
            {
                return false;
            }
        }
        return true;
    }
}

class Solution 
{
    public int minDeletionSize(String[] strs) 
    {
        int len = strs.length;
        int wordLen = strs[0].length();
        int del=0;

        for(int i=0;i<wordLen;i++)
        {
            char prev = strs[0].charAt(i);
            for(int j=1;j<len;j++)
            {
                char ch = strs[j].charAt(i);
                if(ch<prev)
                {
                    del++;
                    break;
                }
                prev=ch;
            }
        }
        return del;
    }
}

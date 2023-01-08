class Solution 
{
    public int maxPoints(int[][] points) 
    {
        int n = points.length;
        int ans=2;
        if(n<2)
        {
            return n;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=2;
                for(int k=0;k<n;k++)
                {
                    if(k!=i && k!=j)
                    {
                        //checking slope logic
                        int x = ((points[j][1]) - (points[i][1])) * ((points[k][0]) - (points[i][0]));
                        int y = ((points[k][1]) - (points[i][1])) * ((points[j][0]) - (points[i][0]));
                        if(x==y)
                        {
                            temp++;
                        }
                    }
                }
                if(temp>ans)
                {
                    ans=temp;
                }
            }
        }
        return ans;
    }
}

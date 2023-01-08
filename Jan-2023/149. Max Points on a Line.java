/*slope formula
(x1,y1),(x2,y2),(x3,y3)
=> (y2-y1) / (x2-x1) = (y3-y1) / (x3-x1)
=> (y2-y1) * (x3-x1) = (y3-y1) * (x2-x1)
Then (x1,y1) , (x2,y2) & (x3,y3) are in the same line
*/
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
        for(int i=0;i<n;i++) //x1,y1
        {
            for(int j=i+1;j<n;j++) //x2,y2
            {
                int temp=2;
                for(int k=0;k<n;k++) //x3,y3
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

class Solution 
{
    public int findMinArrowShots(int[][] points) 
    {
        //Sorting the ballons based on the Xend coordinate
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        
        int arrows=1;
        int range=points[0][1];

        for(int i=1;i<points.length;i++)
        {
            //there is no common area
            if(points[i][0]>range)
            {
                arrows++;
                range=points[i][1];
            }
            //if there is a common area we don't need to increment the arrow
        }
        return arrows;
    }
}

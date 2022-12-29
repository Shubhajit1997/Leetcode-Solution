class Solution 
{
    public int[] getOrder(int[][] tasks) 
    {
        //update the inputs with index position
        int[][] allTasks = new int[tasks.length][3];
        for(int i=0;i<tasks.length;i++)
        {
            allTasks[i][0] = i; //storing index
            allTasks[i][1] = tasks[i][0]; //storing available time
            allTasks[i][2] = tasks[i][1]; //storing processing time
        }

        //sort the input on the basis of duration first then index
        Queue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[2] - b[2] == 0 ? a[0]-b[0] : a[2]-b[2]);

        //sort on the basis of availability
        Arrays.sort(allTasks, (a,b) -> a[1]-b[1]);

        int i=0,index=0,curTime=0;
        int[] result = new int[tasks.length];

        while(i<tasks.length)
        {
            //check ith task's starting time is smaller or equal curTime
            while(i<tasks.length && curTime>=allTasks[i][1])
            {
                minHeap.add(allTasks[i++]);
            }
            //initiation process
            if(minHeap.isEmpty())
            {
                curTime = allTasks[i][1];
            }
            if(!minHeap.isEmpty())
            {
                int[] curTask = minHeap.poll();
                result[index++]=curTask[0];
                curTime+=curTask[2];
            }
        }
        while(!minHeap.isEmpty())
        {
            int[] curTask = minHeap.poll();
            result[index++]=curTask[0];
        }
        return result;
    }
}

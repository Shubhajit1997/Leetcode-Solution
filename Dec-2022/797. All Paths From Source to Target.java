class Solution 
{
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        int start = 0;
        int end = graph.length-1;

        Queue<List<Integer>> qu = new LinkedList<>();
        qu.add(Arrays.asList(start));

        while(!qu.isEmpty())
        {
            int size = qu.size();
            while(size>0)
            {
                List<Integer> temp = qu.poll();

                if(temp.get(temp.size()-1)==end)
                {
                    ans.add(temp);
                }
                int last = temp.get(temp.size()-1);
                for(int path:graph[last])
                {
                    List<Integer> copy = new ArrayList<>(temp);
                    copy.add(path);
                    qu.add(copy);
                }
                size--;
            }
        }
        return ans;
    }
}

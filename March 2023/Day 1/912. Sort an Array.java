class Solution 
{
    public void merge(int[] nums,int Start,int End,int Mid)
    {
        int N1 = (Mid - Start) + 1;
        int N2 = (End - Mid);

        int[] temp1 = new int[N1];
        int[] temp2 = new int[N2];
        int i,j;
        for(i=0;i<N1;++i)
        {
            temp1[i] = nums[Start+i];
        }
        for(j=0;j<N2;++j)
        {
            temp2[j] = nums[Mid+1+j];
        }

        i=0;
        j=0;
        int k=Start;

        while(i<N1 || j<N2)
        {
            if(j==N2 || i<N1 && temp1[i] < temp2[j])
            {
                nums[k++] = temp1[i++];
            }
            else
            {
                nums[k++] = temp2[j++];
            }
        }
    }
    public void mergeSort(int[] nums,int Start,int End)
    {
        if(Start < End)
        {
            int Mid = Start + (End - Start) / 2;
            mergeSort(nums,Start,Mid);
            mergeSort(nums,Mid+1,End);

            merge(nums,Start,End,Mid);
        }
    }
    public int[] sortArray(int[] nums) 
    {
        int N = nums.length;
        mergeSort(nums,0,N-1);
        return nums;
    }
}

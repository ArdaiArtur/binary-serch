package Day5;

public class FindFirstAndLasrPositionOfElementsInSortedArray {
    public int[] searchRange(int[] nums, int target) {
       if(nums.length==0) return new int[]{-1,-1};
        int beg=0;int end=nums.length-1;
        while(beg<=end)
        {
            int mid=beg+(end-beg)/2;
            if(nums[mid]>=target)
            {
                end=mid-1;
            }
            else
            {
                beg=mid+1;
            }
        }
        if(beg>=nums.length)  return new int[]{-1,-1};
        if(nums[beg]!=target)  return new int[]{-1,-1};
        int j=beg;
        while(j<nums.length&&nums[j]==target)
        {   
            j++;
        }
        return new int []{beg,j-1};
    }
}

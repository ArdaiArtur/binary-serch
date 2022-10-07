package Day7;

/**
 * TwoSumllArraySrted
 */
public class TwoSumllArraySrted {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                return new int[] {i+1,j+1};
            } else if(numbers[i]+numbers[j]<target){
                i++;  // if sum is less then target then we need some bigger number which might add up to reach target. that's why did i++
            } else{
                j--;  // if sum is greator then target then we need some smaller number which might add up to reach target. that's why did j--
            }
        }
        return new int[]{-1,-1};
    }
    
}
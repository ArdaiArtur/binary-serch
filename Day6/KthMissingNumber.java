package Day6;

public class KthMissingNumber {
    public int findKthPositive(int[] arr, int k) {
        int count=arr[0]-1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]+1!=arr[i]) count++;
        }
        return count;
    }
}

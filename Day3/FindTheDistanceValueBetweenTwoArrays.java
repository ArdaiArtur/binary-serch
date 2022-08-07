package Day3;

import java.util.Arrays;

public class FindTheDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
        
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = arr1.length;
        for(int i: arr1){
            int start = 0, end = arr2.length-1, mid;
            while(start <= end){
                mid = start + (end-start)/2;
                if(d >= Math.abs(-i + arr2[mid])){
                    count--;
                    break;
                }
                else{
                    if(arr2[mid] > i)
                        end = mid - 1;
                    else
                        start = mid + 1;
                }
            }
        }
        return count;
    }
}

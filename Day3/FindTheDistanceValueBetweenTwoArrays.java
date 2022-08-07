package Day3;

import java.util.Arrays;

public class FindTheDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
        
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count=arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            
            int str=0,db=0;
            int end=arr2.length-1;
            while (str<=end) {
                int mid=str+(end-str)/2;
                if(d>=Math.abs(arr1[i]-arr2[mid]))
                {
                     count--;
                     break;
                }
                else
                {
                    if(arr2[mid]>i)
                    end=mid-1;
                    else
                    str=mid+1;
                }
            }
        }
        return count;
    }
}

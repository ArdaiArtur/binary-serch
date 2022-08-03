import java.util.Arrays;

/**
 * da4
 */
public class da4 {

    public static void main(String[] args) {
         
    }
    public char nextGreatestLetter(char[] letters, char target) {
        if(target==letters[letters.length-1]) return letters[0];       
        int l=0;
        int r=letters.length;
        while(l<r)
        {
            int mid=l+(r-l)/2;       
            if(letters[mid]>target)
            {
                r=mid;
            }
            else
            {l=mid+1;}

        }
        return letters[l%letters.length];
    

    }


    public int mySqrt(int x) {
        int low=0;
        int hight=x;
        while(low<=hight)
        {
            int mid=low+(hight-low)/2;
            if(mid*mid==x) return mid;
            if(mid*mid>x)
            {
                hight=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }


    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count=arr1.length-1;
        for (int n : arr1) {
            int i=Arrays.binarySearch(arr2, n);
            if(i>=0)
            count--;
            else
            {
                i=-i-1;
                if(i<arr2.length && arr2[i]-n<=d)
                count--;
                else
                if(i>0&&n-arr2[i-1]<=d)
                count--;

            }
        }
        return count;
    }

    public int binaryserch(int a[],int n)
    {   int m=0;
        int l=0;
        int r=a.length-1;
        while(l<r)
        {
             m= l+(r-l)/2;
            if(a[m]==n) return m;
            if(a[m]>n)
            {
                r=m-1;
            }
            else 
            {
                l=m+1;

            }
        }
        return -l;

    }

}
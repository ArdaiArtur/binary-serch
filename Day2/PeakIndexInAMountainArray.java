package Day2;

public class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int bigg=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=bigg) bigg=arr[i];
           if(arr[i]<bigg) return i-1;
        }
        return bigg;
    }

    public int peakIndexInMountainArraygood(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (A[mi] < A[mi + 1])
                lo = mi + 1;
            else
                hi = mi;
        }
        return lo;
    }
}

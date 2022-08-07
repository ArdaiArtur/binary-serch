package Day4;

public class Sqrtx {
    public int mySqrt(int x) {
        long low=0;
        long hight=x;
        while(low<=hight)
        {
            long mid=low+(hight-low)/2;
            if(mid*mid==x) return (int)mid;
            if(mid*mid>x)
            {
                hight=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (int)low-1;
    }
}

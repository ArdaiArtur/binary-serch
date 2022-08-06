package Day3;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long low=1;
        long hight=num;
        while(low<=hight)
        {
            long mid=(low+hight)/2;
            if(mid*mid==num)
            return true;
            else if(mid*mid>num)
            {
                hight=mid-1;
            }
            else {low=mid+1;}

        }
        return false;
    }
}

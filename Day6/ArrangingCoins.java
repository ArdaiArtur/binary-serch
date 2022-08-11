package Day6;

public class ArrangingCoins {
    
        //3=6
        //4=10
        //5=15
        //x=1+2+3+4+..k=(k*(k+1))/2
        public int arrangeCoins(int n) {
            long left = 0, right = n;
            long k, curr;
            while (left <= right) {
              k = left + (right - left) / 2;
              curr = k * (k + 1) / 2;
        
              if (curr == n) return (int)k;
        
              if (n < curr) {
                right = k - 1;
              } else {
                left = k + 1;
              }
            }
            return (int)right;
          }
    
}

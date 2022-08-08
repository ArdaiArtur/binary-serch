package Day4;

import java.util.ArrayList;
import java.util.List;


public class test {
    
    public static void main(String[] args) {
        int nums[]=new int []{10,9,2,5,3,7,101,18};
        lengthOfLIS(nums);
    }
    public static int lengthOfLIS(int[] nums) {
       
        ArrayList<Integer> lis = new ArrayList<>();
        
        for(int num:nums){
            
            int size = lis.size();
            System.out.println(size+" size");
            
            if(size==0 ||size>0 && num>lis.get(size-1)){
                lis.add(num);
                System.out.println(num+"listelement");
            }else{
                int insertIndex = bs(lis,num);
                lis.set(insertIndex,num);
                System.out.println(insertIndex+"index "+num+"number");
            }
        }
        for (Integer integer : lis) {
            System.out.print(integer+" ");
        }
        return lis.size();


       
        
    }
    public static int bs(List<Integer> list, int target){
        int lo = 0;
        int hi = list.size()-1;
        
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(list.get(mid)<target){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return lo;
    }
}

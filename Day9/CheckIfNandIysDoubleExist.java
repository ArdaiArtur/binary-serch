package Day9;


import java.util.HashSet;

public class CheckIfNandIysDoubleExist {
    public boolean checkIfExist(int[] arr) {
        int count=0;
        HashSet<Integer>hs=new HashSet<>();
        for (Integer integer : arr) {
            if(!hs.contains(integer))
            {
                if(integer==0)
                count++;
                else
                hs.add(integer*2);
            }
        }
        if(count>=2) return true;
        for (Integer integer : arr) {
            if(hs.contains(integer))
            {
                return true;
            }
        }
        return false;
    }


    public boolean checkIfExistfast(int[] arr) {
        int count=0;
        HashSet<Integer>hs=new HashSet<>();
        for (Integer integer : arr) {
            if(integer==0)count++;
            if(hs.contains(integer*2)||count>=2||((integer%2 == 0) && hs.contains(integer/2)))
            {
                return true;
            }
            hs.add(integer);
        }
        return false;

    }
}

package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * KthWeakestRoewINaMatrix
 */
public class KthWeakestRoewINaMatrix {

     public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int count=0;
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]==1) 
                {
                    count++;
                }
            }
            hm.put(i, count);
        }
        List<Integer>lis=new ArrayList<>(hm.keySet());
        Collections.sort(lis, (w1, w2) -> hm.get(w1).equals(hm.get(w2)) ?
        w1.compareTo(w2) : hm.get(w2) - hm.get(w1));
        
        return lis.subList(0, k).stream().mapToInt(i->i).toArray();
    }
}
package Day4;

public class FindeSmallestLetterGreaterThanTarget {
    
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
}

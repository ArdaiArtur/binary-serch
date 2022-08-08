package Day4;

public class FindeSmallestLetterGreaterThanTarget {
    
    public char nextGreatestLetter(char[] letters, char target) {
        int str=0;int set=0;
        int end=letters.length-1;
        if(target==letters[letters.length-1]) return letters[0];       
        while(str<=end)
        {
            int mid=str+(end-str)/2;
            if(letters[mid]==target) {set=mid;break;}
            if(letters[mid]>target) end=mid-1;
            else
            str=mid+1;
        }
        if(set!=0)return letters[set+1];
        return letters[str%letters.length];
        
    }
}

package ArrayAndHashing;
import java.util.*;
public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] nums) {

        int longest =Integer.MIN_VALUE;
        Set<Integer>set=new HashSet<>();
        if(nums.length==0){
            longest=0;
        }
        else{
            for(int num:nums){
                set.add(num);
            }

            for(int num:nums){
                if(!set.contains(num-1)) //start of sequence
                {
                    int count=1;
                    while(set.contains(num+1)){
                        count+=1;
                        num++;
                    }
                    longest=Math.max(longest,count);
                }
            }
        }

        return longest;
    }
}

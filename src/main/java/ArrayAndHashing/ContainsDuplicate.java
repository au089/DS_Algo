package ArrayAndHashing;
import java.util.*;
public class ContainsDuplicate {

    //Solution 1
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> mapToCheckDuplicates=new HashMap<>();
        boolean output=false;
        for(int num:nums){
            mapToCheckDuplicates.put(num,mapToCheckDuplicates.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer>entry:mapToCheckDuplicates.entrySet()){
            if(entry.getValue()>1){
                output=true;
                break;
            }
        }
        return output;
    }

    //Solution 2

    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
}

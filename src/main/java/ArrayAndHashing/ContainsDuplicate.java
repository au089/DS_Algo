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
}

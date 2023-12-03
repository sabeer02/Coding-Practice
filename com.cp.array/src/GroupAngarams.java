import java.util.*;
import java.util.stream.Collectors;

public class GroupAngarams {
    static public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> AscendArray = new HashMap<>();
        for (String str:strs) {
            char[] temp=str.toCharArray();
            Arrays.sort(temp);
            if(AscendArray.containsKey(String.valueOf(temp))){
                AscendArray.get(String.valueOf(temp)).add(str);
            }else{
                List<String> interiorList = new ArrayList<>();
                interiorList.add(str);
                AscendArray.put(String.valueOf(temp),interiorList);
            }
        }

        for (Map.Entry<String,List<String>> entry:AscendArray.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
}

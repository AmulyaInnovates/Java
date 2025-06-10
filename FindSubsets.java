import java.util.*;

public class FindSubsets {
    
    List<List<Integer>> output= new ArrayList<>();
    
    public List<List<Integer>> findSubsets(int[] arr){
        int n= arr.length;
        
        helper(0, new ArrayList<>(), arr);
        return output;
    }
    
    public void helper(int first, ArrayList<Integer> curr, int[] arr){
        if(first == arr.length){
            output.add(new ArrayList<>(curr));
            return;
        }
        
        helper(first+1, curr, arr);
        
        curr.add(arr[first]);
        helper(first+1, curr, arr);
        
        curr.remove(curr.size() -1);
        
    }
    
    public static void main(String[] args) {
        FindSubsets obj= new FindSubsets();
        int[] arr= {1,2,3};
        List<List<Integer>> result= obj.findSubsets(arr);
        System.out.println(result);
    }
}
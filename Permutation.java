import java.util.*;

public class Permutation {
    public List<List<Integer>> permute(int[] arr){
        List<List<Integer>> result= new ArrayList<>();
        backtrack(result, new ArrayList<>(), arr);
        return result;
        }
    
    private void backtrack(List<List<Integer>> result, ArrayList<Integer> temp,int[] arr){
        
        if(temp.size() == arr.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int number : arr){
            
            if(temp.contains(number)){
                continue;
            }
            
            temp.add(number);
            
            backtrack(result,temp,arr);
            
            temp.remove(temp.size()-1);
        }
    }
    
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        Permutation obj= new Permutation();
        List<List<Integer>> resulting_array= obj.permute(arr);
        System.out.println(resulting_array);
    }
}
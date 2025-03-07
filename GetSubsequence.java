import java.util.*;

public class GetSubsequence {
    public static void main(String[] args){
        int[] arr= {1,2,3};
        ArrayList<Integer> al= new ArrayList<>();
        printsubsequence(arr,0,al);
    }

    public static void printsubsequence(int[] arr,int index, ArrayList<Integer> al){
        if(index == arr.length){
            if(al.size()> 0){
                System.out.println(al);
            }
        }
        else{
            printsubsequence(arr, index+1, al);
            al.add(arr[index]);

            printsubsequence(arr, index+1, al);
            al.remove(al.size()-1);
        }
    }
}

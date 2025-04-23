import java.util.*;

public class CountFrequencyArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string :- [IT IS CASE SENSITIVE ]");
        String str= sc.nextLine();
        int[] freq= new int[str.length()];

        char str1[]= str.toCharArray();

        for(int i=0;i<str.length();i++){
            freq[i]=1;

            for(int j=i+1;j<str.length();j++){
                if(str1[i] == str1[j]){
                    freq[i]++;
                    str1[j]='O';
                }
            }
        }

        System.out.println("The frequency of your String is as follows :- ");
        System.out.println("Character     Frequency");

        for(int k=0;k<freq.length;k++){
            if(str1[k] != ' ' && str1[k] != 'O'){
                System.out.println(str1[k] + " -> " + freq[k]);
            }
        }
    }
}

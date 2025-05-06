import java.util.*;

public class CheckStringFrequency{
    
    public int CountSubstring(String s1, String s2){
        int index=0;
        int count=0;
        
        while(index>=0){
            index= s1.indexOf(s2,index);
            if(index>=0){
                count++;
                index+= s2.length();
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        CheckStringFrequency obj= new CheckStringFrequency();
        
        System.out.println("Enter the Main-String :- ");
        String s1= sc.nextLine();
        System.out.println("Enter the Sub-String :- ");
        String s2= sc.nextLine();
        
        int result= obj.CountSubstring(s1,s2);
        System.out.println(s2+ " occurred in " + s1 + " "+ result+ " times.");
        }
    }

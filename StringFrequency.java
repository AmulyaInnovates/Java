import java.util.*;

public class StringFrequency{
    
    public boolean isSubstring(String s1, String s2){
        
        int test= s1.indexOf(s2);
        return test>=0;
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        StringFrequency obj= new StringFrequency();
        
        System.out.println("Enter the Main-String :- ");
        String s1= sc.nextLine();
        System.out.println("Enter the Sub-String :- ");
        String s2= sc.nextLine();
        
        if(obj.isSubstring(s1,s2)){
            System.out.println(s2+ " is the part of the main String which is :- " + s1);
        }
        else{
            System.out.println(s2+ " is not the part of the main String which is :- " + s1);
        }
    }
}
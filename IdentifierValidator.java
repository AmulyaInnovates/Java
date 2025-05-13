import java.util.*;

public class IdentifierValidator{
    
    public boolean isValidIdentifier(String str){
        if(str== null || str.isEmpty()){
            return false;
        }
        
        if(!Character.isLetter(str.charAt(0)) && str.charAt(0) != '_'){
            return false;
        }
        
        for(int i =0;i<str.length(); i++){
            char ch= str.charAt(i);
            if(!Character.isLetterOrDigit(ch) && ch != '_'){
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        IdentifierValidator validator = new IdentifierValidator();
        
        System.out.println("Enter the value you want to check :- ");
        String str= sc.nextLine().trim();
        
        boolean answer= validator.isValidIdentifier(str);
        if(answer){
            System.out.println(str + " is a Identifier");
        }
        else{
            System.out.println(str + " is not a Identifier");
            System.out.println("RULES FOR MAKING AN IDENTIFIER :- ");
            System.out.println("1) Start with a letter or underscore");
            System.out.println("2) It should contain letter, number and underscore only");
            System.out.println("3) It should not be Empty");
        }
        System.out.println();
        System.out.println("Program Terminated");
        
    }
}
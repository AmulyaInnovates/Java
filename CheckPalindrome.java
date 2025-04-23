import java.util.*;

class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your text :- ");
        String s1= sc.nextLine();
        if(checkPalindrome(s1)){
            System.out.println(s1+ " is a Palindrome word.");
        }
        else{
            System.out.println(s1+ " is not a Palindrome word.");
        }
    }
    
    public static boolean checkPalindrome(String str){
        int left= 0;
        int right= str.length()-1;
        
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
        
    
}
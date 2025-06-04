import java.util.Scanner;
import java.util.ArrayList;

class CollectComments {
    
    public ArrayList<String> collectComments(ArrayList<String> reviews){
        ArrayList<String> result= new ArrayList<>();
        
        for(int i=0;i<reviews.size();i++){
            String new_comment= reviews.get(i);
            if(new_comment.contains("!")){
                String formatted_String= i+"."+new_comment;
                if(!new_comment.endsWith("!") && !new_comment.endsWith(".")){
                    formatted_String += ".";
                }
                result.add(formatted_String);
            }
        }
        
        return result;
        
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        CollectComments obj= new CollectComments();
        System.out.println("Enter the number of elemnts in ArrayList");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> reviews= new ArrayList<>();
        
        for(int i=0;i<n;i++){
            System.out.println("Enter the comment number "+ (i+1) + " :-");
                String comment= sc.nextLine();
            reviews.add(comment);
        }
        
        ArrayList<String> result= obj.collectComments(reviews);
        for(String num : result){
            System.out.println(num);
        }
        
    }
}
import java.util.Scanner;

public class Project20 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of values you want in the Array");
    int n= sc.nextInt();
    int[] A= new int[n];

    System.out.println("Enter the value for variable K");
    int K= sc.nextInt();
    System.out.println("Enter the first value for A :- ");
    for(int i=0;i<n;i++){
        A[i]= sc.nextInt();
        System.out.println("Enter the next Value :- ");
    }
    for(int i=0;i<n;i++){
        System.out.println(A[i] + " ");
    }

    int[] B= new int[(n*K)];
    for (int i = 0; i < K; i++) {
        for (int j = 0; j < n; j++) {
            B[i * n + j] = A[j];
        }
    }

    System.out.println("Maximum subarray sum of B: " + Subarray_max(B));

    }

    static int Subarray_max(int B[]){
        int size= B.length;
        int max_so_far= Integer.MIN_VALUE;
        int max_ending_here= 0;

        for(int i=0;i<size;i++){
            max_ending_here= max_ending_here + B[i];

            if(max_ending_here > max_so_far){
                max_so_far=max_ending_here;
            }

            if(max_ending_here<0){
                max_ending_here=0;
            }
        }
        return max_so_far;

    }
}

import java.util.*;

public class Floor_Ceil_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " sorted denominations:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the denomination to search for: ");
        int d = sc.nextInt();
        
        int floor = -1, ceil = -1;
        int low = 0, high = n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == d) {
                floor = ceil = arr[mid];
                break;
            } else if (arr[mid] < d) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }
        
        System.out.println("\nOutput:");
        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }
}
